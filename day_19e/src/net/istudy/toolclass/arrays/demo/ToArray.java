package net.istudy.toolclass.arrays.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
/*
 * ���ʵ�ּ���ת��������
 * 
 * ʹ�õľ���Collection�нӿ��е�toArray����
 * 
 * ����ת�����飺�Լ����е�Ԫ�ؽ����޶��������������ɾ
 * */
		List<String> list=new ArrayList<String>();
		list.add("da");
		list.add("hl");
		list.add("lop");
		
		String []arr=list.toArray(new String[4]);
		System.out.println(Arrays.toString(arr));
	}
/*
 * toArray������Ҫ����һ��ָ�����͵�����
 * ���ȸ���ζ�����
 * �������С�ڼ��ϵ�size����ô�÷����ᴴ��һ��ͬ���Ͳ��Һͼ�����ͬsize������
 * ������ȴ��ڼ��ϵ�size����ô�ͻ�ʹ��ָ��������洢ָ��Ԫ�أ�����λ��Ϊ��
 * ��ó���ָ��Ϊ���ϵ�size
 * 
 * */
}
