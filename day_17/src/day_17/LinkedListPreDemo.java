package day_17;
/*
 * 
 * ��ʹ��LinkedList��ģ��һ����ջ���߶������ݽṹ.
 * 
 * ��ջ:�Ƚ����	FILO
 * 
 * ����:�Ƚ��ȳ�	FIFO
 * 
 * ����Ӧ����������һ������ 	  	 
 * 
 * */
import java.util.*;



public class LinkedListPreDemo {

	public static void main(String[] args) {
		DuiLie d=new DuiLie();
		d.myAdd("abc1");
		d.myAdd("abc2");
		d.myAdd("abc3");
		d.myAdd("abc4");
		
		while(!d.isNull()) {
			System.out.println(d.myGet());
			
		}
		
		
	}	

}
