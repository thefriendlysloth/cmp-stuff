public class Car
{
	private int Year;
	private double Price;

	private final double MINVALUE = 0;
	private final int MINYEAR = 1970;

	private String make;
	private String vin;
	private static int Count = 0;


	public void setYear(int y) throws CarException
	{
		if(y>2011 || y <1970)
		{
			throw new CarException("Invalid year");
		}
			else
			{
				Year = y;
			}
	}

	public int getYear()
	{
		return Year;
	}

	public void setPrice(double z) throws CarException
	{
		if(z < 0 || z > 100000)
		{
			throw new CarException ("Invalid price");
		}
			else
			{
				Price = z;
			}
	}

	public double getPrice()
	{
		return Price;
	}

	//Assignment3
// Oveloaded Constructor
	public Car(int y, double p, String r, String t) throws CarException
	{
		setYear(y);
		setPrice(p);
		setMake(r);
		setVin(t);
		Count ++;
	}

// Default Constructor
	public Car()
	{
		Year = MINYEAR;
		Price = MINVALUE;
		Count ++;
	}

	public Car(Car c)
	{
		Year = c.Year;
		Price = c.Price;
		Count ++;
	}

	protected void finalize()
	{
		System.out.println("The finalize method has been called. ");
		Count --;
	}

	public String toString()
	{
		return "Year Manufactured: " + Year + " - " + "Current Value: " + Price;
	}

	//Assignment 6
	public void setMake(String s) throws CarException
	{
		boolean test="".equals(s);
		String str = s;

		if( test == true)
		{
			throw new CarException("Invalid vehicle make");
		}
			else
			{
				make = s;
			}
	}


	public String getMake()
	{
		return make;
	}


	public void setVin(String z)throws CarException
	{
		boolean test2 = "".equals(z);

		if(test2 == true)
			{
			throw new CarException("Invalid vin number");
			}
				else
				{
				vin = z;
				}
	}

	public String getVin()
	{
		return vin;
	}

	public int getCount()
	{
		return Count;
	}

}


