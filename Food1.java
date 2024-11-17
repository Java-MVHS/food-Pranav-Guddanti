
	/* Write your heading
	  Food.java
	  
	*/


	public class Food1
	{
		protected String str;
		
		public Food1 ()
		{
			str = new String("");
		}
	
		public Food1 (String prepMethod, String ingredient, String name)
		{	
			str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
		}

		public void printForSale()
		{
			System.out.println(str);
		}
	}
