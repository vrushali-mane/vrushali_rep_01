package assignments;

public class RepeatedCharatersInString_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Java is programming language , Java can be used for web development , java can be used for Automation";
			// ", Jaa can be used for Automation";
		//String msg="Price is 200 USD";
		
		String []str=msg.split(" ");
				
		int count,i,j;
		
		System.out.println("Repeated Characters -");
		
		for(i=0;i<=str.length-1;i++)
		{
			count=0;
			for(j=i+1;j<=str.length-1;j++)
			{
				//System.out.println(str[i]+" "+str[j]);
				if(str[i].equals(","))
				{
					str[i]="";
				}
				else if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;
					str[j]="";
				}
				
			}
			
			if(count>=1)
			{
				System.out.println(str[i]);	
			}
			
		
		}
		
		//String msg2;
		/*int len=msg.length()-1;
		for(int i=0;i<=msg.length()-1;i++)
		{ 
			count=0;
			for(j=i+1;j<=msg.length()-1;j++)
			{				
				if(arr[i]==arr[j] && arr[i]!=' ')
				{
					//msg2=String.valueOf(msg.charAt(i));
					//msg2=msg2.replace(msg2," ");
					count++;
					arr[j]='0';
					
				}
				  				
			}
			if(count > 1 && arr[i] != '0') 
			{
                System.out.println(arr[i]+" repeated "+count);  
			}
			
		}*/
			
	}

}
