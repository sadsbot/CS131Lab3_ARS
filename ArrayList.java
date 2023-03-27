public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
  /**
   * This method adds an item to the ArrayList object.
   *
   * @param item
   * @return the success
   */
  public boolean addItem(T item) {
	  if(currentItem<arList.length&&arList[currentItem]==null) { //If arList isn't full and the current item is null...
		  arList[currentItem] = item;
		  currentItem++;
		  return true;
	  }else return false;
  }//end addItem
  
  /**
   * Returns each item of arList as a toString() of that item, or null.
   * 
   * @return the toString
   */
  public String toString() {
	  StringBuilder sb = new StringBuilder("");
	  for(int i = 0; i < arList.length; i++) {
		  if(arList[i]!=null)sb.append("\narList["+i+"]="+arList[i].getClass().getName()+" "+arList[i].toString());
		  else sb.append("\narList["+i+"]=null");
	  }
	  return sb.toString();
  }//end toString
}//end class
