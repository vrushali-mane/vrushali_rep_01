package assignments;


public class Assignment_5 {
	/*
	 * Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
		For first 0 - 50 units Rs. 0.50/unit
		For 51-100 units Rs. 0.75/unit
		For 101- 150 units Rs. 1.20/unit
		For unit above 150 Rs. 1.50/unit
		Input :
		Electricity units consumed - 86
		Bill - 64.5
	 */
	public static void main(String args[])
	{
	float unit=86;
	if(unit>=0 && unit<=50)
	{
		unit=(float) (unit*0.50);
		System.out.println("Bill - "+unit);
	}
	else if (unit>=51 && unit<=100)
	{
		unit=(float)(unit*0.75);
		System.out.println("Bill - "+unit);
	}
	else if (unit>=101 && unit<=150)
	{
		unit=(float)(unit*1.20);
		System.out.println("Bill - "+unit);
	}
	else if (unit>150)
	{
		unit=(float)(unit*1.50);
		System.out.println("Bill - "+unit);
	}
	
	}

}
