package day_17;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 
 * ��HashSet��洢Person��name age��ͬ��һ����
 * 
 * HashSet���������ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��
 * ʹ��Ԫ�ص�HashCode������ȷ��λ�ã����λ����ͬ����ͨ��Ԫ�ص�equals��ȷ���Ƿ���ͬ��
 * 
 * 
 * */
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(new Person(23,"Jack"));
		hs.add(new Person(41,"Jacket"));
		hs.add(new Person(12,"Jacketa"));
		hs.add(new Person(12,"Jacketa"));
//		hs.add(new Person(52,"Jacketate"));
//		hs.add(new Person(19,"Jacketater"));
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			Person p=(Person)it.next();
			System.out.println(p.getName()+"::"+p.getAge());
		}
	}

}
