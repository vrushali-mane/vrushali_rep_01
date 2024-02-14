
public class PrimeNos {

	public static void main(String[] args) {
	
		boolean status=false;
		int j,i=1,num=10;
		for(j=2;j<=num;j++)
		{
			for(i=1;i<j;i++)
			{
				if(j%i==0)
				{
				status=true;
				//break;
				}	
				
			}
			if(!status)
			{
				System.out.println("Number is prime "+j);
			}
		}
	}
}
