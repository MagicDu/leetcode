package cn.magicdu;

public class _66_Plus_One {
	public int[] plusOne(int[] digits) {
        int size=digits.length;
        for(int i=size-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int arr[]=new int[size+1];
        arr[0]=1;
        return arr;
}
}
