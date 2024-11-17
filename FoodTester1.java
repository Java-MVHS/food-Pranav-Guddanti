public class FoodTester1
{
	public static void main(String []args)
	{
		Food1 food1 = new Food1 ("baked", "banana", "muffins");
		food1.printForSale();
		Food1 food2 = new Food1 ("fried", "yam", "fritters");
		food2.printForSale();
		Pizza1 pizza = new Pizza1 ("baked","pepperoni","pizza");
		pizza.printForSale();
	}
}
