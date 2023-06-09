package in.ineuron.in;

import java.util.Arrays;
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;  // Count of elements not equal to val
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Move non-val element to the front
                k++;  // Increment count
            }
        }
        
        return k;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        
        int result = removeElement(nums, val);
       
        System.out.println("Output: " + result + ", nums = " + Arrays.toString(nums));
    }
}


//public class RemoveElement {
//	public static  int removeElement(int[] n, int val) {
//		int k=0;
//		for(int i=0;i<n.length;i++) {
//			if(n[i]!=val) {
//			n[k]=n[i];
//			
//			k++;
//			}
//		}
//		return k;
//	}
//
//	public static void main(String[] args) {	
//		int []  n= {3,2,2,3};
//		int val=3;
//    int result=removeElement(n,val);
//    System.out.println("Output"+result+",  nums="+Arrays.toString(n));
//	}
//
//}
