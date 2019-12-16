public class TestCode
{

	public static void main(String[] args)
	{
		Fraction x = new Fraction( 3 , 4 );
		try
		{
			x.Fraction();
			System.out.println(x.getFraction());
		}

		catch (FractionException e)
		{

			System.out.println(e);
		}
	}
}