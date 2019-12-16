public class CarException extends Exception
{
	private String message;

	public CarException(String m)
	{
		message = m;
	}

	public String toString()
	{
		return message;
	}

}
