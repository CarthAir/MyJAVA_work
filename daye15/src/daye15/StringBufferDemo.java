package daye15;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.LocatorEx.Snapshot;

public class StringBufferDemo {
/*
 * StringBuffer�����ַ���������
 * ���ڴ洢���ݵ�����
 * 
 * �ص㣺
 * 1�����ȿɱ�
 * 2�����Դ洢��ͬ���͵��ص�
 * 3������ת���ַ�������ʹ�� 
 * 
 * ��Ȼ��һ��������Ҫ����Щ���ܣ�
 * 1�����;
 * 		StringBuffer append(data)
 * 		StringBuffer insert(pos,data)
 * 2��ɾ��;
 * 		StringBuffer delete(start,end):����ͷ��������β
 * 		StringBuffer deieteCharAt(index):ɾ��ָ��λ�õ�Ԫ��
 * 		StringBuffer remove
 * 3������;
 * 		char charAt(index)
 * 		int indexOf(String)
 * 4���޸�;
 * 		StringBuffer replace(int start,int end,StringBuffer string)
 * 
 * 
 * 
 * */
	public static void main(String[] args) {
		stringBufferDemo_1();
		stringBufferDemo_2();
		stringBufferDemo_3();
		stringBufferDemo_4();

	}

	private static void stringBufferDemo_4() {
		StringBuffer sb=new StringBuffer("abxdefghij");
		sb.replace(0, 3,"kakdsfsda");
		System.out.println(sb.toString());
}

	private static void stringBufferDemo_3() {
		StringBuffer sb=new StringBuffer("abcdefg");
		sb.delete(1, 4);
		System.out.println(sb.toString());
		sb.deleteCharAt(0);
		System.out.println(sb.toString());
		//��ջ�����������������
		sb.delete(0, sb.length());//sb=new StringBuffer�˷��ڴ�
		System.out.println(sb.toString());
	}

	private static void stringBufferDemo_2() {
		StringBuffer sb=new StringBuffer();
		sb.append(true);
		sb.append(4);
		//StringBuffer sb1=sb.append("haha");
		System.out.println(sb.toString());
//		st
}

	/**
	 * 
	 */
	public static void stringBufferDemo_1() {
		//��������������
		StringBuffer sb=new StringBuffer();
		StringBuffer s1=sb.append(4).append(false).insert(1,"ja").append("hh");
		System.out.println(s1);
	}

}
