public class TwoIntegers 
{
	private int num1;
	private int num2;
	public TwoIntegers()
	{
		num1 = 0;
		num2 = 1;
	}
	public TwoIntegers(int num1 , int num2)
	{
		this . num1 = num1;
		this . num2 = num2;
	}
	public void setNum1(int num1)
	{
		this . num1 = num1;
	}
	public int getNum1()
	{
		return num1;
	}
	public void setNum2(int num2)
	{
		this . num2 = num2;
	}
	public int getNum2()
	{
		return num2;
	}
	public TwoIntegers multiply(TwoIntegers twoint)
	{
		int num1 = this . num1 * twoint . getNum1();
		int num1 = this . num1 * twoint . getNum2();
		TwoIntegers result = new TwoIntegers(num1 , num2);
		return result; 
	}
	public double toDecimal;
	{
		double result = (double) num1 / num2;
		return result;
	}
	@Override
	public String toString()
	{
		return num1 + " / " + num2;
	}
	
}

