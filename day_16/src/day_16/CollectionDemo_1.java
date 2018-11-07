package day_16;

import java.util.*;
public class CollectionDemo_1 {

	public static void main(String[] args) {
		
		Collection coll=new ArrayList();
		show(coll);
		
		
		Collection c1=new ArrayList<>();
		Collection c2=new ArrayList<>();
		show(c1,c2);
		
		
	}

	private static void show(Collection C) {
		
//		1,���Ԫ��
		C.add("abc1");
		C.add("abc2");
		C.add("abc3");
		C.add("abc4");
//		2,ɾ��Ԫ��
		C.remove("abc3");//��ı䳤��

		System.out.println(C);
		System.out.println(C.size());
		
		//3,��ռ���
		System.out.println(C);
		System.out.println(C.size());
		
		//4,�ж�
		System.out.println(C.contains("abc0"));
		
		
	}
	public static void show(Collection c1,Collection c2) {
		
		c1.add("c1_abc1");
		c1.add("c1_abc2");
		c1.add("c1_abc3");
		c2.add("c2_abc1");
		c2.add("c2_abc2");
		c2.add("c2_abc3");
		
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		
		c1.addAll(c2);
		System.out.println("c1 addAll: "+c1);
		
		c1.removeAll(c2);
		System.out.println("c1 removeAll: "+ c1);
	}


}




















