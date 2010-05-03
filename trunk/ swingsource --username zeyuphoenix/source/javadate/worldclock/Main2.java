/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main2.java
 *
 * Created on 12.02.2010, 17:09:26
 */

package worldclock;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import swinglayout.GroupLayout;

/**
 */
public class Main2 extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form Main2 */
    public Main2() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel1 = new BackgroundPanel();
        clockPanelDayNight1 = new ClockPanelDayNight();
        clockPanelDayNight2 = new ClockPanelDayNight();
        clockPanelDayNight3 = new ClockPanelDayNight();
        clockPanelDayNight4 = new ClockPanelDayNight();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel1.setName("backgroundPanel1"); // NOI18N

        clockPanelDayNight1.setCity(City.HongKong);
        clockPanelDayNight1.setName("clockPanelDayNight1"); // NOI18N

        clockPanelDayNight2.setName("clockPanelDayNight2"); // NOI18N

        clockPanelDayNight3.setCity(City.NewYork);
        clockPanelDayNight3.setName("clockPanelDayNight3"); // NOI18N

        clockPanelDayNight4.setCity(City.SanFrancisco);
        clockPanelDayNight4.setName("clockPanelDayNight4"); // NOI18N

        GroupLayout backgroundPanel1Layout = new GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(GroupLayout.LEADING)
            .add(backgroundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(backgroundPanel1Layout.createParallelGroup(GroupLayout.LEADING)
                    .add(clockPanelDayNight1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .add(clockPanelDayNight2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .add(clockPanelDayNight3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .add(clockPanelDayNight4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(GroupLayout.LEADING)
            .add(backgroundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(clockPanelDayNight1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(clockPanelDayNight2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(clockPanelDayNight3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(clockPanelDayNight4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.LEADING)
            .add(backgroundPanel1, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.LEADING)
            .add(backgroundPanel1, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BackgroundPanel backgroundPanel1;
    private ClockPanelDayNight clockPanelDayNight1;
    private ClockPanelDayNight clockPanelDayNight2;
    private ClockPanelDayNight clockPanelDayNight3;
    private ClockPanelDayNight clockPanelDayNight4;
    // End of variables declaration//GEN-END:variables

}
