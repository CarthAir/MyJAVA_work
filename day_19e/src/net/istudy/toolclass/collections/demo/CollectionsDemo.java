package net.istudy.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CollectionsDemo {

	/*
	 * Collections:���Ͽ�ܵĹ����࣬����ķ������Ǿ�̬��	
	 * 
	 * */
	public static void main(String[] args) {
		demo_1();
	}

	public static void demo_1() {
		List<String> list=new ArrayList<String>();
		list.add("ad");
		list.add("fr");
		list.add("ad");
		list.add("gtr");
		list.add("mx");
		System.out.println(list);
		//��list���Ͻ���ָ��˳�������
		Collections.sort(list);
		System.out.println(list);
		
	}
}
