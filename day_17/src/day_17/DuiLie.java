package day_17;

import java.util.LinkedList;

public class DuiLie{
	private LinkedList link;
	public DuiLie() {
		// TODO �Զ����ɵĹ��캯�����
		link = new LinkedList();
	}
	/*
	 * 
	 * �������Ԫ�صĹ��ܡ�
	 * 
	 * */
	public void myAdd(Object obj) {
		link.add(obj);
	}
	public Object myGet() {
		return link.removeFirst();
	}
	public boolean isNull() {
		return link.isEmpty();
	}
}