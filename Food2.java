public class Food2
	{
		protected String str;
		
		public Food2 ()
		{
			str = new String("");
		}
	
		public Food2 (String prepMethod, String ingredient, String name)
		{	
			str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
		}

		public void printForSale()
		{
			System.out.println(str);
		}
	}