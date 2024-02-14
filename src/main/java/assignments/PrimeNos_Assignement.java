package assignments;

public class PrimeNos_Assignement {

	public static void main(String[] args) {
		/*
		 * Prime no. from 1-20
		 * 
		 */
		int i,j,num=20;
		int count;
		for(j=2;j<=num;j++)
		{
			count=0;
		for(i=1;i<=j;i++)
		{
			if(j%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println(j);	
		}
			
				
		}
		
		
	}
	
	}
