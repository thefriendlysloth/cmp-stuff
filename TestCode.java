public class TestCode {

	public static void main(String[] args) {
		Car x = new Car();
		try
		{
			x.setYear(2010);
			System.out.println(x.getYear());
		}

		catch (CarException e)
		{

			System.out.println(e);
		}

		System.out.println(x.getCount());

		Car y = new Car();
				try
				{
					y.setPrice(100.11);
					System.out.println(y.getPrice());
				}

				catch (CarException e)
				{

					System.out.println(e);
		}

		System.out.println(x.getCount());

		System.out.println(y);

		x.finalize();

		System.out.println(x.getCount());

		Car z = new Car();
		try
		{
		z.setMake("Acura");
		System.out.println(z.getMake());
		}
		catch(CarException e)
		{
			System.out.println(e);
		}

		Car a = new Car();
		try
		{
			a.setVin("4USBT33443LR62024");
			System.out.println(a.getVin());
		}
		catch(CarException e)
		{
			System.out.println(e);
		}

		System.out.println(x.getCount());

	}

}
