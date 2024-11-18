/* Name:Pranav Guddanti
 * Date 10/23/2024
*/
public class Food3//Creating Food Class
{
	protected String str;// Creating our class variable
	
	public Food3 ()//Constructor to initialize our variables
	{
		str = new String("");//initializing our class variables
	}
	
	public Food3 (String prepMethod, String ingredient, String name,int cents, int num ,double cost)//overloaded constructor with multiple parameters in the constructor
	{	
		String input; //creating a string to input all of the varaibles
		input = "At the sale: %s %s with %s will be sold for %d cents each. With %d %s(s). $%.2f can be made"; //new class variable if you pass in multiple variables
		str = String.format(input, name, prepMethod, ingredient, cents, num,name, cost);//Using String.format to supply variables to the String
	}

	public void printForSale()//print method
	{
		System.out.println(str);//output
	}
}//end class
