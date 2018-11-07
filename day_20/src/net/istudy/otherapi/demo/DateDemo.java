package net.istudy.otherapi.demo;

import java.text.DateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
//		methodDemo_1();
		methodDemo_2();
	}

	private static void methodDemo_2() {
		Date date=new Date();
		
		DateFormat df=DateFormat.getDateInstance();
		
		df=DateFormat.getDateTimeInstance();
	}

	/**
	 * 
	 */
	private static void methodDemo_1() {
		/*
		 * ���ڶ���ͺ���ֵ֮���ת����
		 * 1,����ֵ-->���ڶ���
		 * 2,������ͨ��setTime��������
		 * 
		 * ͨ��Date�Ĺ��췽������
		 * ���ڶ���-->����ֵ��
		 * 1,getTime����
		 * 2,��Ϊ����ͨ���������ֵ�������㡣
		 * */
		long time=System.currentTimeMillis();
//		System.out.println(time);//1537864218347l
		
		Date date_1=new Date();//��ǰ���ں�ʱ���װ��date����
		System.out.println(date_1);//Tue Sep 25 16:28:27 CST 2018
		Date date_2=new Date(1537864218351l);//��ָ������ֵ��װ��date����
		System.out.println(date_2);
	}

}
