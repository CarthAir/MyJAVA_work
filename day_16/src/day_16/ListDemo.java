package day_16;

import java.util.*;


public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		
//		show(list);
		
		list.add("a_1");
		list.add("a_2");
		list.add("a_3");
		list.add("a_4");
		
		System.out.println(list);
		ListIterator it=list.listIterator();//��ȡ�б������
		
		while(it.hasNext()) {
			Object ob=it.next();
			if(ob.equals("a_2")) {
				it.set("a_9");
			}
			else
				System.out.println(ob);
			
		}		
		System.out.println(list);
//		for(Iterator it=list.iterator();it.hasNext();){
//			System.out.println(it.next());
//		}
		//List���еĻ�ȡԪ�صķ���:get
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("get: "+list.get(i));
//		}
		
//		
//		for(Iterator it=list.iterator();it.hasNext();){
//			Object ob=it.next();
//			if(ob.equals("a_2")) {
//				list.add("a_9");//������ʹ�ù����У���Ҫʹ���������в��������׳����쳣��
//				//����ʹ��Iterator���ӽӿ�ListIterator������ڵ����ж�Ԫ�ؽ��и���Ĳ�����
//				
//				
//			}
//			else
//				System.out.println("next: "+it);			
//		}
//		System.out.println(list);
		
	}

	private static void show(List list) {
		//���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println("list: "+list);
		//ɾ��Ԫ��
//		list.remove(3);
		System.out.println("remove: "+list.remove(3));
		System.out.println("after remove: "+list);
		
		//�ı�Ԫ��
		System.out.println("set: "+list.set(1, "abc2_change"));
		System.out.println(list);
		
		//��ȡԪ��
		System.out.println("list.subList(0,2): "+list.subList(0, 2)); 
	}

}
