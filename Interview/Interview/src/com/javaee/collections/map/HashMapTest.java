package com.javaee.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<MapElement, String> map = new HashMap<MapElement, String>();
		MapElement mapElement1 = new MapElement(1, "xielong1");//A 放入
		MapElement mapElement2 = new MapElement(2, "xielong2");//B 放入
		MapElement mapElement3 = new MapElement(2, "xielong2");//C 不放入
		MapElement mapElement4 = new MapElement(2, "xielong4");//D 放入
		if(mapElement1.hashCode()==mapElement2.hashCode()){
			System.out.println("hashCode相等:");
		}
		map.put(mapElement1, mapElement1.getName());
		map.put(mapElement2, mapElement2.getName());
		map.put(mapElement3, mapElement3.getName());
		map.put(mapElement4, mapElement4.getName());
		map.put(null, null);//放入NULL
//		map.put(null);//语法报错
		System.out.println(map.size());//包含NULL4个 不算NULL 三个
		for(Map.Entry<MapElement, String> entry:map.entrySet()){//遍历元素
			System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
		}
	}

}
