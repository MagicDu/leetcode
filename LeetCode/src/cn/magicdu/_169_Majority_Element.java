package cn.magicdu;

import java.util.HashMap;
import java.util.Map;

public class _169_Majority_Element {
	
	/*public static void main(String[] args) {
		_169_Majority_Element e=new _169_Majority_Element();
		int arr[]={2,2,2,3,4,5,5,6,6,6,6,6,6,6,6};
		System.out.println(e.majorityElement(arr));
	}*/
	
	public int majorityElement(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
        int size=nums.length;
        for(int i=0;i<size;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
            if(map.get(nums[i])+1>size/2){
            		return nums[i];
            }
        }
        return 0;
    }
}
