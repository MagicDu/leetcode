package cn.magicdu;

public class _26_Remove_Duplicates_from_Sorted_Array {
	 public int removeDuplicates(int[] nums) {
	        int size=nums.length;
	        if(size==0){
	            return 0;
	        }
	        int count=1;
	        
	        for(int i=1;i<size;i++){
	           if(nums[i]==nums[i-1]){
	               continue;
	           }else{
	               nums[count]=nums[i];
	               count++;
	           }
	        }
	        return count;
	    }
}
