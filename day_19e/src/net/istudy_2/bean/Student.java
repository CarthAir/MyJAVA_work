package net.istudy_2.bean;

public class Student extends Person {

	public Student() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO �Զ����ɵĹ��캯�����
	}

	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student::"+name+":"+age;
	}
	
}
