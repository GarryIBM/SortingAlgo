package demofirst;

import java.util.Scanner;

public class SelectionSort {

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
        	 for(int b=a+1;b<arr.length;b++)
        	 {
        		 if(arr[a]>arr[b])
        		 {
        			 temp=arr[a];
        			 arr[a]=arr[b];
        			 arr[b]=temp;
        		 }
        		 
        	 }
        	
        	
        }
            for (int val : arr) {
				System.out.println(val);
			}
        
        
	}

}





//01 02 03 04 
//12 13 14 
//23 24 
//34