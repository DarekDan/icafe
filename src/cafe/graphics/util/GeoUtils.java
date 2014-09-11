/**
 * Copyright (c) 2014 by Wen Yu.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Any modifications to this file must keep this entire header intact.
 */

package cafe.graphics.util;

/** 
 * This utility class contains static methods 
 * to work with geometry. 
 * 
 * @author Wen Yu, yuwen_66@yahoo.com
 * @version 1.0 04/15/2013
 */
public class GeoUtils {

	private GeoUtils() {} // Prevents instantiation
	
	public static boolean isInsidePoly(int npol, int[] xp, int[] yp, int x, int y)
	{		
	     int i, j;
	     boolean c = false;
	     
	     for (i = 0, j = npol-1; i < npol; j = i++) {
	           if ((((yp[i]<=y) && (y<yp[j])) ||((yp[j]<=y) && (y<yp[i]))) &&
	                (x < (xp[j] - xp[i]) * (y - yp[i]) / (yp[j] - yp[i]) + xp[i]))
	              c = !c;
	     }
	     
	     return c;
	}   

	public static boolean isInsidePoly(int npol, double[] xp, double[] yp, double x, double y)
	{
		int i, j;
		boolean c = false;
     
		for (i = 0, j = npol-1; i < npol; j = i++) {
			if ((((yp[i]<=y) && (y<yp[j])) ||((yp[j]<=y) && (y<yp[i]))) &&
					(x < (xp[j] - xp[i]) * (y - yp[i]) / (yp[j] - yp[i]) + xp[i]))
				c = !c;
		}
     
		return c;
	}   
}