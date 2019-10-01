package demofirst;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int temp;
        int arr[] = new int[5];
        System.out.println("Enter elements of array");
        for(int index=0;index<arr.length;index++) {
        	 arr[index]=sc.nextInt();
        }
        for(int a=0;a<arr.length-1;a++) 
        {
        	for(int b=0;b<arr.length-1-a;b++) 
        	{
        		 if(arr[b]>arr[b+1])
        		 {
        			 temp=arr[b];
        			 arr[b]=arr[b+1];
        			 arr[b+1]=temp;     
        			 
        		 }
        	}
        }
        for (int val : arr) {
			System.out.println(val);
		}
    
    
        
	}

}



//01 12 23 34
//01 12 23
//01 12
//01
