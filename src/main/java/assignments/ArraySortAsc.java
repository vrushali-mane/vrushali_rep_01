package assignments;

public class ArraySortAsc {

	public static void main(String[] args) {
	
		int arr[]= {50,20,40,60,70};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
				}
				
			}
			System.out.println(arr[i]);
		}

	}

}
