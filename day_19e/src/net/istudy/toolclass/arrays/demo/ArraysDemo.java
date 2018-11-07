package net.istudy.toolclass.arrays.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Set;




public class ArraysDemo {

	public static void main(String[] args) {
		/*
		 * Arrays:���Ͽ�ܵĹ����࣬����ķ������Ǿ�̬��(��˼����˵Arrays.function����ʽʹ�÷���)
		 * 
		 * 
		 * */
//		demo_2();
		
		/*
		 * �ص㣺List asList(����)������ת���ɼ���
		 * �ô�����ʵ����ʹ�ü��ϵ÷������������е�Ԫ��
		 * ע�⣺����ĳ����ǹ̶��ģ����Լ����е���ɾ�����ǲ����е�
		 * 
		 * */
//		demo_1();
//		demo_3();
		demo_4();
	}

	private static void demo_4() {
		//��ȡϵͳ��Ϣ���Բ��洢��properties������
		Properties prop=System.getProperties();
		Set<String> propName=prop.stringPropertyNames();
		for(String x:propName) {
			String value=prop.getProperty(x);
			System.out.println(x+":"+value);
		}
	}

	private static void demo_3() {
		int[] arr= {21,35,55};
		List list=Arrays.asList(arr);
		System.out.println(list);
		/*
		 * ��������е�Ԫ���Ƕ�����ôת���ɼ���ʱ�������д洢���������еĶ���Ԫ��
		 * 
		 * ��������е�Ԫ���ǻ����������ͣ���ôת���ɼ����ǣ������д洢������������
		 * */
	}

	/**
	 * 
	 */
	private static void demo_2() {
		int[] arr= {3,1,5,6,3,6};
		List list=Arrays.asList(arr);//List<int []>list=Arrays.asList(arr);
		System.out.println(list);
	}

	/**
	 * 
	 */
	private static void demo_1() {
		String[] arr={"mid","top","sup","ad"}; 
		
		List<String> list=Arrays.asList(arr);
		System.out.println(list);
	}
	
	//toString�ľ���ʵ�֡�
	
	public static String mytoString(int[] a) {//�м�ȥ���������жϣ������Ч��
		if (a==null)
			return "null";
		int iMax=a.length-1;
		if(iMax==-1)
			return "[]";
			StringBuilder b=new StringBuilder();
			b.append('[');
			for(int i=0;;i++) {
				b.append(a[i]);
			if(i==iMax)
				return b.append('[').toString();
			b.append(",");
			}
	}
	
	

}
