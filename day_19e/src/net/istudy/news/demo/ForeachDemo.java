package net.istudy.news.demo;

import java.util.ArrayList;
import java.util.List;

public class ForeachDemo {
/*
 * foreach��䣺
 * ��ʽ��
 * for(���� ����:Collection���ϻ�������)
 *{
 *
 *}
 * 
 * ���Զ�mapֱ��ʹ��foreach�𣬲����Ե��ǿ���ת����set��ʹ��
 * */
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("ada");
		list.add("loj");
		list.add("plh");
		list.add("fds");
		for(String x:list) {
			System.out.println(x);
		}
		
	} 

}
