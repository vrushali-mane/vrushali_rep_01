package Demo;

public class TestClass implements SampleTestInterface{

	public static void main(String[] args) {
		TestClass obj1=new TestClass();
		BaseClass_1 obj2=new BaseClass_1();
		obj1.display();
		obj2.display();
		
		SampleTestInterface obj3=new TestClass();
		SampleTestInterface obj4=new BaseClass_1();
		obj3.display();
		obj4.display();
		  
		
	}
	public void display_child()
	{
		System.out.println("New child method");
	}
	public void display()
	{
		System.out.println("This is Child class");
	}

}
