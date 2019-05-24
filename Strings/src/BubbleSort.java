
public class BubbleSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc= {32,34,45,27,1,13,52,38,64,95,3,43,51,72,84,44,52,16,34};
		int length= abc.length;
		int[] pqr= new int[length];
		int[] xyz=new int[length];
		for (int i=0 ; i< length*length;i++)
		{
			abc =bubbleSort(0,abc);
			
			//xyz=bubbleSort(0,abc);
			
		}
			pqr=bubbleSort(0,abc);
			
			for (int i=0;i<pqr.length;i++)
			{				
				System.out.print(pqr[i]+" ");
			}
		//for n square times try 
	}
	
	public static int[] bubbleSort(int index,int[] arr)
	{		
		
		int length=arr.length;
		///int count=0;
		int i=index;
		
		for (;index<length-1;index++) {
			
			if(arr[index]> arr[index+1])
			{
				arr=shift(index,arr);
				
				//write code 	
			}	
			else if(arr[index]==arr[index+1])
			{
				
				
				//count++;
				continue;
			}
			else 
			{
				//count++;
				bubbleSort(index+1,arr);
			}
			
		}	
		return arr;
	}

	public static int[] shift(int index,int[] arr)
	{
		int temp;
		temp= arr[index+1];
		arr[index+1]=arr[index];
		arr[index]=temp;
		return arr;
	}

}
