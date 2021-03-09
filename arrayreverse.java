/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    
    
    
    	static void	reversearray(int arr[],int size)
    	{
    	    int start=0,temp;
    	    
    	    while(start < size){
    	    temp=arr[start];
    	    arr[start]=arr[size - 1];
    	    arr[size - 1]=temp;
    	    size-- ;
    	    start++;
    	    
    	    }
    	    
    	}

    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int size;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array : ");
		size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("enter the arrray elemetes : ");
		
		for (int i=0;i<size;i++)
		{
		   arr[i]=sc.nextInt();
		}
		
		System.out.println("array is : ");
		
		for(int i =0 ; i<size ;i++)
		{
		    System.out.println(arr[i]);
		}
		
		reversearray( arr,size);
		
			
			
		System.out.println("array after reversing is : ");

		
		for(int i =0 ; i<size ;i++)
		{
		    System.out.println(arr[i]);
		}
		
	    
	}
}
