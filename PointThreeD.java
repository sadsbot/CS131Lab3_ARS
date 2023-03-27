/**
* This class represents a point in 3D space.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Lab #3
* Spring 2023
*/

public class PointThreeD {
	private double xPoint, yPoint, zPoint;
	
	/**
	 * Default constructor sets all fields to 0.
	 */
	public PointThreeD() {
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor with parameters for each dimension.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end preferred constructor
	
	/**
	 * @return the toString
	 */
	public String toString() {
		return(String.format("xPoint=%.2f yPoint=%.2f zPoint=%.2f", xPoint, yPoint, zPoint));
	}//end toString
}//end PointThreeD.java
