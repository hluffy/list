package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SelectList {
	public static int a = 0;
	public static void main(String[] args) {  
        List list = new ArrayList();  
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);
        list.add(5);
        list.add(6);
        
//        for(int i =1;i<list.size();i++){
//        	combine(list,0,3,i,new HashSet());
//        }
        
        combine(list,0,list.size()-1,3,new HashSet());
    }  
  
    private static void combine(List list, int start, int end, int length,  
            HashSet hashSet) {  
        if(length ==0){  
        	
            System.out.println(hashSet.toString());  
            return;  
        }  
        for(int i = start ;i<=end - length + 1;i++){  
        	
            hashSet.add(list.get(i));  
            combine(list, i+1, end, length-1, hashSet);  
            hashSet.remove((list.get(i)));  
        }  
    }  

}
