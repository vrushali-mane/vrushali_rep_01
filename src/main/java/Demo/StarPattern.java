package Demo;

public class StarPattern {

	public static void main(String[] args) {
		
		System.out.println("========= Pattern 1 -=========");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========= Pattern 2 -=========");
		for(int j=5;j>0;j--)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========= Pattern 3 - =========");
		for(int i=0;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========= Pattern 4 - =========");
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========= Pattern 5 - =========");
		for(int i=0;i<=7;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
