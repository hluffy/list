package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import Util.MyComparator;
import object.Info;

public class ListInfo {
	public static List<Integer> sums = new ArrayList<Integer>();
	public static void main(String[] args) {
		Info info1 = new Info(1,2,3);
		Info info2 = new Info(1,2,5);
		Info info3 = new Info(2,3,6);
		Info info4 = new Info(2,4,4);
		Info info5 = new Info(1,2,7);
		
		List<Info> infos = new ArrayList<Info>();
		infos.add(info1);
		infos.add(info2);
		infos.add(info3);
		infos.add(info4);
		infos.add(info5);
		
		Collections.sort(infos,new MyComparator());
		
		List<Integer> sums = combine(infos,0,infos.size()-1,3,new HashSet<Info>());
		for (Integer sum : sums) {
			System.out.println(sum);
		}
	}
	
	private static List<Integer> combine(List<Info> list, int start, int end, int length,  
            HashSet<Info> hashSet) {  
		
        if(length ==0){  
//            System.out.println(hashSet.toString());
            for (Info info : hashSet) {
				System.out.println(info);
				int sum = sum(info);
				sums.add(sum);
			}
            return sums;
        }  
        for(int i = start ;i<=end - length + 1;i++){  
            hashSet.add(list.get(i));  
            combine(list, i+1, end, length-1, hashSet);  
            hashSet.remove((list.get(i)));  
        }
		return sums;
    }
	
	private static int sum(Info info){
		return info.getA()+info.getB()+info.getC();
	}

}
