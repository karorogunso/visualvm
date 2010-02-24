/*
 *  Copyright 2007-2010 Sun Microsystems, Inc.  All Rights Reserved.
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 *  This code is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License version 2 only, as
 *  published by the Free Software Foundation.  Sun designates this
 *  particular file as subject to the "Classpath" exception as provided
 *  by Sun in the LICENSE file that accompanied this code.
 *
 *  This code is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  version 2 for more details (a copy is included in the LICENSE file that
 *  accompanied this code).
 *
 *  You should have received a copy of the GNU General Public License version
 *  2 along with this work; if not, write to the Free Software Foundation,
 *  Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *  Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 *  CA 95054 USA or visit www.sun.com if you need additional information or
 *  have any questions.
 */

package com.sun.tools.visualvm.modules.tracer.impl.timeline.items;

import com.sun.tools.visualvm.modules.tracer.ItemValueFormatter;
import java.awt.Color;

/**
 *
 * @author Jiri Sedlacek
 */
public abstract class XYItemDescriptor extends ValueItemDescriptor {

    private final float lineWidth;
    private final Color lineColor;
    private final Color fillColor1;
    private final Color fillColor2;


    XYItemDescriptor(String name, String description,
                     ItemValueFormatter formatter, double dataFactor,
                     long minValue, long maxValue, float lineWidth,
                     Color lineColor, Color fillColor1, Color fillColor2) {

        super(name, description, formatter, dataFactor, minValue, maxValue);
        this.lineWidth = lineWidth;
        this.lineColor = lineColor;
        this.fillColor1 = fillColor1;
        this.fillColor2 = fillColor2;
    }

    
    public final float getLineWidth() {
        return lineWidth;
    }

    public final Color getLineColor() {
        return lineColor;
    }

    public final Color getFillColor1() {
        return fillColor1;
    }

    public final Color getFillColor2() {
        return fillColor2;
    }

}