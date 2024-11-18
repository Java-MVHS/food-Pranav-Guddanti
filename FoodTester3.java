public class FoodTester3//Run this class in powershell
{
	public static void main(String []args)//main Method (runs first)
	{
		System.out.print("\n\n\n");//three blank lines
		Food3 food1 = new Food3 ("baked", "banana", "muffins",50,12,6.00);//calling the overloaded constructor
		food1.printForSale();//calling the print method
		Food3 food2 = new Food3 ("fried", "yam", "fritters",100,3,3.00);//calling the overloaded constructor
		food2.printForSale();//calling print mehod
		Pizza3 pizza = new Pizza3 ("pepperoni");//calling the overloaded constructor
		pizza.printForSale();//calling print method
		DeepDishPizza3 Dpizza = new DeepDishPizza3 ("extra cheese");//calling the overloaded constructor
		Dpizza.printForSale();//calling print method
		System.out.print("\n\n\n");//three blank lines
	}
}
