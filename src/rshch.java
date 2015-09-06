
public class rshch {

	public static void main(String[] args) {
  
		int nums[]={99,-10,100123,18,-978,5623,463,-9,287,49};
		 
		  System.out.print("Original array is:"); 
		  for(int i=0;i<10;i++)
		  System.out.print(" "+nums[i]);
		  System.out.println(); 
		  int b;
		for(int a = 1;a<10;a++) 
		    for(b=10-1;b>=a;b--)
		    { 
		    if(nums[b-1]>nums[b])
		    { 
		    int t = nums[b-1]; 
		    nums[b-1]=nums[b]; 
		    nums[b]=t; 
		    } 
		    }
		  System.out.print("Sroted array is:");
		  for(int i=0;i<10;i++)
		  System.out.print(" "+nums[i]); 
		  System.out.println();
		} 

	}

