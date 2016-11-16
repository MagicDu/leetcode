package cn.magicdu;

import java.util.ArrayList;
import java.util.List;

public class _119_Pascal_TriangleII {

	/**
	 * My Solution
	 * @author xiaoduc
	 */
	    public List<Integer> getRow(int rowIndex) {
	        if(rowIndex<0){
	            return null;
	        }
	         List<List<Integer>> list=new ArrayList<>();
	        if(rowIndex>=0){
	            List<Integer> l=new ArrayList<>();
	            l.add(1);
	           list.add(l);
	        }
	        if(rowIndex>=1){
	            List<Integer> l=new ArrayList<>();
	            l.add(1);
	            l.add(1);
	            list.add(l);
	            
	        }
	       
	        if(rowIndex>=2){
	            for(int i=2;i<=rowIndex;i++){
	                List<Integer>l=new ArrayList<>();
	                List<Integer>prev=list.get(i-1);
	                l.add(1);
	                for(int j=1;j<=i-1;j++){
	                    l.add(prev.get(j-1)+prev.get(j));
	                }
	                l.add(1);
	                list.add(l);
	            }
	        }
	        return list.get(rowIndex);
	    }
	    
	    
	    /*
	     * others Solution
	     */
	    
	    /*
	    public List<Integer> getRow(int rowIndex) {
	    	List<Integer> list = new ArrayList<Integer>();
	    	if (rowIndex < 0)
	    		return list;

	    	for (int i = 0; i < rowIndex + 1; i++) {
	    		list.add(0, 1);
	    		for (int j = 1; j < list.size() - 1; j++) {
	    			list.set(j, list.get(j) + list.get(j + 1));
	    		}
	    	}
	    	return list;
	    }
	    */
}




