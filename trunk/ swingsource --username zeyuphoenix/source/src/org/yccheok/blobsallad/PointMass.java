package org.yccheok.blobsallad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;

/**
 */
public class PointMass {
	private Vector cur;
	private Vector prev;
	private double mass;
	private Vector force;
	private double friction;

	public PointMass(double cx, double cy, double mass) {
		this.cur = new Vector(cx, cy);
		this.prev = new Vector(cx, cy);
		this.mass = mass;
		this.force = new Vector(0.0, 0.0);
		new Vector(0.0, 0.0);
		this.friction = 0.01;
	}

	public double getXPos() {
		return this.cur.getX();
	}

	public double getYPos() {
		return this.cur.getY();
	}

	public Vector getPos() {
		return this.cur;
	}

	public double getXPrevPos() {
		return this.prev.getX();
	}

	public double getYPrevPos() {
		return this.prev.getY();
	}

	public Vector getPrevPos() {
		return this.prev;
	}

	public void addXPos(double dx) {
		this.cur.addX(dx);
	}

	public void addYPos(double dy) {
		this.cur.addY(dy);
	}

	public void setForce(Vector force) {
		this.force.set(force);
	}

	public void addForce(Vector force) {
		this.force.add(force);
	}

	public double getMass() {
		return this.mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	// Key function.
	public void move(double dt) {
		double t, a, c, dtdt;

		dtdt = dt * dt;
		a = this.force.getX() / this.mass;
		c = this.cur.getX();
		t = (2.0 - this.friction) * c - (1.0 - this.friction)
				* this.prev.getX() + a * dtdt;
		this.prev.setX(c);
		this.cur.setX(t);

		a = this.force.getY() / this.mass;
		c = this.cur.getY();
		t = (2.0 - this.friction) * c - (1.0 - this.friction)
				* this.prev.getY() + a * dtdt;
		this.prev.setY(c);
		this.cur.setY(t);
	}

	// Key function.
	public double getVelocity() {
		double cXpX, cYpY;
		cXpX = this.cur.getX() - this.prev.getX();
		cYpY = this.cur.getY() - this.prev.getY();
		return cXpX * cXpX + cYpY * cYpY;
	}

	public void setFriction(double friction) {
		this.friction = friction;
	}

	public void draw(Graphics graphics, double scaleFactor) {

		BasicStroke stroke = new BasicStroke(2.0f);
		Graphics2D g2d = (Graphics2D) graphics;

		g2d.setColor(Color.BLACK);
		g2d.setStroke(stroke);
		Arc2D.Double arc = new Arc2D.Double();
		arc.setArcByCenter(this.cur.getX() * scaleFactor, this.cur.getY()
				* scaleFactor, 4.0, 0.0, 360.0, Arc2D.CHORD);
		g2d.fill(arc);
	}
}
