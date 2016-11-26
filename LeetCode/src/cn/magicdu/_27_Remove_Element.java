package cn.magicdu;

public class _27_Remove_Element {
	public int removeElement(int[] nums, int val) {
        int size=nums.length;
        if(size==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<size;i++){
            if(nums[i]!=val){
               nums[count++]=nums[i];
            }
        }
        return count;
    }
}
