package Util;

import java.util.Comparator;

import object.Info;

public class MyComparator implements Comparator<Info>{

	public int compare(Info o1, Info o2) {
		// TODO Auto-generated method stub
//		return 0;
		return o1.getC().compareTo(o2.getC());
	}

}
