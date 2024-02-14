package assignments;

public class Assignment_2 {

	public static void main(String[] args) {
		//Program to check student score

		int score=85;
		
		if(score<50)
		{
			System.out.println("Failed");
		}
		else if(score>=50 && score<60)
		{
			System.out.println("Grade D");
		}
		else if(score>=60 && score<70)
		{
			System.out.println("Grade C");
		}
		else if(score>=70 && score<80)
		{
			System.out.println("Grade B");
		}
		else if(score>=80 && score<90)
		{
		System.out.println("Grade A");
		}
		else if(score>=90 && score<100)
		{
			System.out.println("Grade A++");
		}
		else if(score==100)
		{
			System.out.println("Price");
		}
		else if(score>100 || score<0)
		{
			System.out.println("Please enter the valid score");
		}
	}

}
