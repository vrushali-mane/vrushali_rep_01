package assignments;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=5,num2=2;
		int sum, difference, product, quotient,modulo;
		
		sum=num1+num2; 			//Addition
		difference=num1-num2;	//Subtraction
		product=num1*num2;		//Multiplication
		quotient=num1/num2;		//Division
		modulo=num1%num2;
		
		System.out.println("The sum of "+num1+" and "+num2+" is "+sum+".");
		System.out.println("The difference between "+num1+" and "+num2+" is "+difference+".");
		System.out.println("The product of "+num1+" and "+num2+" is "+product+".");
		System.out.println("The quotient of "+num1+" divide by "+num2+" is "+quotient+".");
		System.out.println("modulo "+modulo);
	}

}
