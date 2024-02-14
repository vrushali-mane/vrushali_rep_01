package assignments;

public class PrimeNos {

	public static void main(String[] args) {
	
		boolean status=false;
		int num=3;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				status=true;
				break;
			}
				
		}
	if(!status)
	{
		System.out.println("Number is prime");
	}
	else
	{
		System.out.println("Number is not prime");
	}
	}

}
