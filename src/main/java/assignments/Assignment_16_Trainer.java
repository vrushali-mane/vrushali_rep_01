package assignments;


public class Assignment_16_Trainer {
	
	String trainerName,trainerSkills;
	double trainerNumber;
	
	public static void main(String args[])
	{
	
		Assignment_16_Trainer trainer1=new Assignment_16_Trainer("Mukesh",15454,"Automation");
		Assignment_16_Trainer trainer2=new Assignment_16_Trainer("Ritika",112244,"Manual");
		Assignment_16_Trainer trainer3=new Assignment_16_Trainer("Komal",556688,"Sales");
		
		trainer1.canteachAutomation();
		trainer2.canteachManual();
		trainer3.canteachSales();
	}
	
	public Assignment_16_Trainer(String name,double number,String skills)
	{
		trainerName=name;
		trainerNumber=number;
		trainerSkills=skills;
	}
	
	public void canteachAutomation()
	{
		System.out.println(trainerName+" can teach Automation.");
	}
	
	public void canteachManual()
	{
		System.out.println(trainerName+" can teach Manual.");
	}
	
	public void canteachSales()
	{
		System.out.println(trainerName+" can teach Sales.");
	}
}
