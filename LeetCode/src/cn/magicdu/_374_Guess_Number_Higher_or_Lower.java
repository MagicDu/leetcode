package cn.magicdu;

public class _374_Guess_Number_Higher_or_Lower {
	public int guessNumber(int n) {
		return guessNumber(1, n);
	}
	/*递归*/
	private  int guessNumber(int start,int end){
		int mid=start+(end-start)/2;
		if(guess(mid)==-1){
			return guessNumber(start,mid-1);
		}else
		if(guess(mid)==1){
			return guessNumber(mid+1,end);
		}else{
			return mid;
		}
	}
	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*二分查找*/
	
public int guessNumber1(int n) {
        
        int low = 1;
        int high = n;
       
        while (low <= high) {
            int mid = low+(high-low)/2;
            int guessResult = guess(mid);
            if (guessResult == 0)
                return mid;

            if (guessResult == 1)
                low = mid+1;
            else if (guessResult == -1) 
                high = mid-1;
        }
        
        return -1;
    }
}
/*public class Solution extends GuessGame {
    public int guessNumber(int n) {
		return guessNumber(1, n);
	}
	private  int guessNumber(int start,int end){
		int mid=(start+end)/2;
		if(guess(mid)==-1){
			return guessNumber(mid+1, end);
		}else if(guess(mid)==1){
			return guessNumber(start,mid-1);
		}else{
			return mid;
		}
	}
}*/