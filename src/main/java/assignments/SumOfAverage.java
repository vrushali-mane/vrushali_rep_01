package assignments;

public class SumOfAverage {

	public static void main(String[] args) {
		
		int sum=0,i;
		float avg;
		for(i=1;i<=10;i++)
		{
			sum=sum+i;
			System.out.println("Sum is -"+sum);			
		}
		//i=i-1;
		avg=sum/i;
		
		System.out.println("Average is -"+avg);

	}

}
