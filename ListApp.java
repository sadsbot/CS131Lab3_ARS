/**
* Application class for Lab3 containing main method.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Lab #3
* Spring 2023
*/

public class ListApp {

	/**
	 * Main method for Lab3.
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("###===================================================###");
		sb.append("\nThe first test for the ArrayList class is a list of String objects."
		+"\nThis app will now add 11 String objects to an ArrayList with the default size of 10."
		+"\nEach time an item is added, it will print the boolean return value to show failure or success."
		+"\nOnce all items have been added, the toString method for the ArrayList will be called.");
		ArrayList<String> stringList = new ArrayList<String>();
		sb.append("\n\nAdding String 1: "+stringList.addItem("Alphabet"));
		sb.append("\nAdding String 2: "+stringList.addItem("Barnicle"));
		sb.append("\nAdding String 3: "+stringList.addItem("Crocodile"));
		sb.append("\nAdding String 4: "+stringList.addItem("Detached"));
		sb.append("\nAdding String 5: "+stringList.addItem("Exonerated"));
		sb.append("\nAdding String 6: "+stringList.addItem("Something about a quick brown fox..."));
		sb.append("\nAdding String 7: "+stringList.addItem("And a lazy dog."));
		sb.append("\nAdding String 8: "+stringList.addItem("This is the 8th item to be added."));
		sb.append("\nAdding String 9: "+stringList.addItem("Here's the 9th."));
		sb.append("\nAdding String 10: "+stringList.addItem("You'd never guess it, but this is 10!"));
		sb.append("\nAdding String 11: "+stringList.addItem("Adding this one should return false."));
		sb.append("\n\nstringList.toString() returns: " + stringList.toString());
		
		sb.append("\n\nNext, the squareList ArrayList will demonstrate an incomplete list.");
		ArrayList<Square> squareList = new ArrayList<Square>();
		sb.append("\n\nAdding Square 1: "+squareList.addItem(new Square(12)));
		sb.append("\nAdding Square 2: "+squareList.addItem(new Square(2)));
		sb.append("\nAdding Square 3: "+squareList.addItem(new Square(5.23)));
		sb.append("\nAdding Square 4: "+squareList.addItem(new Square(23)));
		sb.append("\nAdding Square 5: "+squareList.addItem(new Square(16.792)));
		sb.append("\nAdding Square 6: "+squareList.addItem(new Square(19.2352)));
		sb.append("\n\nsquareList.toString() returns: " + squareList.toString());
		
		sb.append("\n\nFinally, the pointList ArrayList will use the preferred contructor of ArrayList"
		+ "\nto make an ArrayList with length 5");
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>(5);
		sb.append("\n\nAdding point 1: "+pointList.addItem(new PointThreeD()));
		sb.append("\nAdding point 2: "+pointList.addItem(new PointThreeD(1, 2, 3)));
		sb.append("\nAdding point 3: "+pointList.addItem(new PointThreeD(15, 2.7, 9)));
		sb.append("\nAdding point 4: "+pointList.addItem(new PointThreeD(11, 20, 33.33)));
		sb.append("\nAdding point 5: "+pointList.addItem(new PointThreeD(4, 5, 6.7)));
		sb.append("\nAdding point 6: "+pointList.addItem(new PointThreeD(1, 2, 3)));
		sb.append("\n\npointList.toString() returns: " + pointList.toString());
		
		sb.append("\n###===================================================###");
		System.out.println(sb.toString());
	}//end main
}//end ListApp.java
