package Demo;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc 86.70%";
		
		String []newstr=str.split(" ");
		char []str1=str.toCharArray();
		
		System.out.println(newstr[1]);
		System.out.println(str.substring(4));
		System.out.println();
	}

}
