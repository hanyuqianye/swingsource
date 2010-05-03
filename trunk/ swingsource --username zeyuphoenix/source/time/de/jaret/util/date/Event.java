/*
 *  File: Event.java 
 *  Copyright (c) 2004-2007  Peter Kliem (Peter.Kliem@jaret.de)
 *  A commercial license is available, see http://www.jaret.de.
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package de.jaret.util.date;


/**
 * Extension of the interval implementation forming a single point in time.
 * 
 * @author kliem
 * @version $Id: Event.java 562 2007-09-15 14:45:12Z olk $
 */
public class Event extends IntervalImpl {
    
    public Event(JaretDate date) {
        setBegin(date);
        setEnd(date);
    }
    

    @Override
    public void setBegin(JaretDate begin) {
        if (_begin != null) {
            _begin.removePropertyChangeListener(this);
        }
        JaretDate oldVal = _begin;
        _begin = begin;
        _end = _begin;
        _begin.addPropertyChangeListener(this);
        firePropertyChange(PROP_BEGIN, oldVal, begin);
    }

    
    /**
     * {@inheritDoc}
     */
    public void setEnd(JaretDate end) {
        if (_end != null) {
            _end.removePropertyChangeListener(this);
        }
        JaretDate oldVal = _end;
        _end = end;
        _begin = end;
        _end.addPropertyChangeListener(this);
        firePropertyChange(PROP_END, oldVal, end);
    }

    
}
