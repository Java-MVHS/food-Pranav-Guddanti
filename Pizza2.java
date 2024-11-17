
public class Pizza2 extends Food2
{
	protected String ingredient;
	protected String name;
	protected String prepMethod;
	
	public Pizza2() {
		super();
	}
	
	public Pizza2(String prepMethodIn, String ingredientIn, String nameIn)
	{
		super(prepMethodIn, ingredientIn,nameIn);
	
	}
	public void printForSale()
	{
		System.out.println(str);
	}
	
	//public void Print

}
