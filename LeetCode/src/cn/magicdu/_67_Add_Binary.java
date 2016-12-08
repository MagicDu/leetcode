package cn.magicdu;

public class _67_Add_Binary {
	public String addBinary(String a, String b) {
        int sizea=a.length();
        int sizeb=b.length();
        int carry=0;
        StringBuilder sb=new StringBuilder();
        for(int i=sizea-1,j=sizeb-1;i>=0||j>=0||carry>0;i--,j--){
        	int sum=0;
        	sum += (i >=0) ? a.charAt(i) - '0' : 0;
            sum += (j >=0) ? b.charAt(j) - '0' : 0;
            sum += carry;
            
            carry = sum /2;
            sum %=2;
            sb.append(sum);
            
        }
        return sb.reverse().toString();
    }
	/*public static void main(String[] args) {
		_67_Add_Binary c=new _67_Add_Binary();
		String s=c.addBinary("111", "111");
		System.out.println(s);
	}*/
}
