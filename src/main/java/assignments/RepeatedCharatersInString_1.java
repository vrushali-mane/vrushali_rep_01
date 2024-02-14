package assignments;

public class RepeatedCharatersInString_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Selenieum";
		char arr[]=msg.toCharArray();
		int count,j;
		//String msg2;
		int len=msg.length()-1;
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
			
		}
			
	}

}
