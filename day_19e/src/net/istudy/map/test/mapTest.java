package net.istudy.map.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * ��ϰ��
 * "sdsdfsrgreyrjutiret"��ȡ���ַ�����ÿһ����ĸ���ֵĴ�����
 * Ҫ���ӡ����ǣ�e(2)......;
 * 
 * ˼·��
 * �۲켴�ɷ��֣���ĸ�����֮�����ӳ���ϵ��
 * ���ԾͿ����뵽���ܴ洢ӳ���ϵ���������map����
 * ��ϵ��һ�����������𣿲��ǣ�
 * �Ǿ�ʹ��map����
 * �ֿ��Է��ֿ��Ա�֤Ψһ�Ե�һ���߱���˳����a b c
 * ���Կ���ʹ��TreeMap����
 * 
 * 
 * */
public class mapTest {

	public static void main(String[] args) {
		String test="sdsdfsrgreyrjutiret";
		TreeMap<Character, Integer> map=new TreeMap<Character,Integer>(new CompareByChar());
		for(int x=0;x<test.length();x++) {
			if(map.containsKey(test.charAt(x))) {
				int num=map.get(test.charAt(x));
				++num;
				map.put(test.charAt(x), num);
			}else {
				map.put(test.charAt(x), 1);
			}
		}
		Set<Map.Entry<Character,Integer>> tm=map.entrySet();
		Iterator<Map.Entry<Character,Integer>> it=tm.iterator();
		while(it.hasNext()) {
			Map.Entry<Character, Integer> m=it.next();
			Character key=m.getKey();
			Integer value=m.getValue();
			System.out.print(key+"("+value+")");
		} 
	}

}
