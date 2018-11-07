package net.istudy.map.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
//		method_1(map);
//		method_2(map);
//		method_3(map);
		method_4(map);
	}
	
	private static void method_4(Map<Integer, String> map) {
		map.put(1, "sd");
		map.put(4, "ht");
		map.put(9, "lp");
		Collection<String> name=map.values();
		Iterator<String> it=name.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void method_3(Map<Integer, String> map) {
		map.put(1, "da");
		map.put(7, "jiu");
		map.put(6, "hr");
		map.put(3, "fa");
		Set<Map.Entry<Integer,String>> relation=map.entrySet();
		Iterator<Map.Entry<Integer,String>> iterator=relation.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer,String> me=iterator.next();
			Integer key=me.getKey();
			String value=me.getValue();
			System.out.println(key+":::"+value);
		}
	}

	public static void method_1(Map<Integer,String> map) {//ѧ�ţ�����
		//���Ԫ��
		System.out.println(map.put(7, "wu"));
		System.out.println(map.put(7, "liu"));//����ͬ����ֵ�Ḳ��
		System.out.println(map);
	}
	/*
	 * ������ʽһ��ͨ��keySet()������Map�еļ��洢��һ��Set������
	 * ������ʽ����ͨ��entrySet()������Map�еļ�ֵ��ӳ���ϵ�洢��Set�����У�����ӳ���ϵ�����;���Map.Entry����
	 * 
	 * */
	public static void method_2(Map<Integer, String> map) {
		map.put(6, "he");
		map.put(3,"ha");
		map.put(5, "da");
		map.put(9, "ada");
		
		Set<Integer> keySet=map.keySet();
		
		Iterator<Integer> iterator=keySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
		}
	}
}