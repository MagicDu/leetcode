package cn.magicdu;

public class _1TwoSum {

	    public int[] twoSum(int[] nums, int target) {
	        int arr[]=new int[2];
	        for(int i=0;i<nums.length;i++){
	           int key=target-nums[i];
	           for(int j=i+1;j<nums.length;j++){
	               if(key==nums[j]){
	                  arr[1]=j;
	                  arr[0]=i; 
	                  break;
	               }
	           }
	        }
	        return arr;
	    }
}
