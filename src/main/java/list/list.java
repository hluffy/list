package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import object.Info;

public class list {
	public static void main(String[] args) {
		List<Info> list = new ArrayList<Info>();  
		list.add(new Info(1,2,3));
		list.add(new Info(2,3,4));
		list.add(new Info(1,2,5)); 
		list.add(new Info(3,4,7));
		list.add(new Info(4,5,9));
		list.add(new Info(5,6,9));
		
		int length = 3;
		List<HashSet<Info>> list1 = new ArrayList<HashSet<Info>>();
		list1 = getList(list, length, list1);
		System.out.println(list1);
		
	}

	public static List<HashSet<Info>> getList(List<Info> list, int length, List<HashSet<Info>> list1) {
		HashSet<Info> hashSet = new HashSet<Info>();
		for(int i=0;i<=list.size()-length;i++){
			hashSet.add(list.get(i));
			for(int j=i+1;j<=list.size()-length+1;j++){
				hashSet.add(list.get(j));
				for(int t=j+1;t<list.size();t++){
					hashSet.add(list.get(t));
					//System.out.println(hashSet);
					HashSet<Info> s = new HashSet<Info>(hashSet);
					//s = hashSet;
					list1.add(s);
					if(list1.size()>=10){
						return list1;
					}
					hashSet.remove(list.get(t));;
				}
				hashSet.remove((list.get(j)));
			}
			hashSet.remove((list.get(i)));
		}
		return list1;
	}


}
