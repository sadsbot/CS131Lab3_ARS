/**
* This class represents a square with a side length value.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Lab #3
* Spring 2023
*/

public class Square {
	private double side;
	
	/**
	 * Default constructor sets field variable to 0.
	 */
	public Square() {
		side = 0;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor with a single parameter for side length.
	 * 
	 * @param s
	 */
	public Square(double s) {
		side = s;
	}//end preferred constructor
	
	/**
	 * Calculates and returns the area of the Square.
	 *
	 * @return the area
	 */
	public double getArea() {
		return(side*side);
	}//end getArea

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}//end getSide

	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}//end setSide
	
	/**
	 * @return the toString
	 */
	public String toString() {
		return(String.format("side=%.2f area=%.2f", side, getArea()));
	}//end toString
}//end Square.java
