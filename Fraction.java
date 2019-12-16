public class Fraction
{
	private double Numerator;
	private double Denominator;


		public void setNumerator(double z) throws FractionException
		{
			if(z<=-1)
			{
				throw new FractionException("Invalid Numerator");
			}
				else
				{
					Numerator = z;
				}
		}

		public void setDenominator(double y) throws FractionException
		{
			if(y<=0)
			{
				throw new FractionException("Invalid Denominator");
			}
				else
				{
					Denominator = y;
				}
		}
}
