
public class Pizza1 extends Food1
{
	protected String ingredient;
	protected String name;
	protected String prepMethod;
	
	public Pizza1() {
		super();
	}
	
	public Pizza1(String prepMethodIn, String ingredientIn, String nameIn)
	{
		super(prepMethodIn, ingredientIn,nameIn);
	
	}
	public void printForSale()
	{
		System.out.println(str);
	}
	
	//public void Print

}
