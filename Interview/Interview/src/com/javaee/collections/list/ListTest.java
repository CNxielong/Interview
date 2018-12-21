package com.javaee.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()){
//		    String x = it.next();
//		    if(x!=null){
//		        it.remove();
//		    }
//		}
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {//并发修改异常
			Object object = (Object) iterator.next();
			if(object!=null){
				iterator.remove(); 
			}
		}
		System.out.println(list);
	}

}
