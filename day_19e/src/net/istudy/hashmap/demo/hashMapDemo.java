package net.istudy.hashmap.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.istudy_2.bean.Student;

public class hashMapDemo {

	public static void main(String[] args) {
		/*
		 * ��ѧ�������ѧ��������ͨ����ֵ�Դ洢��Map�����С�
		 * */
		
		HashMap<Student,String> sql=new HashMap<Student,String>();
		sql.put(new Student("Harry",17), "ɽ��");
		sql.put(new Student("Luis",23), "�㶫");
		sql.put(new Student("Jack",19), "�Ϻ�");
		sql.put(new Student("Jack",19),"���");
		
		Set<Map.Entry<Student,String>> rel=sql.entrySet();
		Iterator<Map.Entry<Student,String>> it=rel.iterator();
		while(it.hasNext()) {
			Map.Entry<Student,String> shuj=it.next();
			System.out.println(shuj.getKey()+" "+shuj.getValue());
		}
	}
}
