package net.istudy_2.bean;

public class Worker extends Person {

	public Worker() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Worker(String name, int age) {
		super(name, age);
		// TODO �Զ����ɵĹ��캯�����
	}

	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "worker::"+name+":"+age;
	}
	
}
