package net.istudy.generatic.define.demo;

/*public class Tool {
	private  Object object;

	*//**
	 * @return object
	 *//*
	public Object getObject() {
		return object;
	}

	*//**
	 * @param object Ҫ���õ� object
	 *//*
	public void setObject(Object object) {
		this.object = object;
	}
	
}*/

public class Tool<Q>{//jdk1.50��ʹ�÷�������������Ҫʹ�õ���
					 //���������ν���Զ��巺����,�����в�������������������ȷ����ʱ���ʹ�÷�������ʾ
	private Q q;

	/**
	 * @return q
	 */
	public Q getQ() {
		return q;
	}

	/**
	 * @param q Ҫ���õ� q
	 */
	public void setQ(Q q) {
		this.q = q;
	}
	
	/*
	 * ���������ڷ�����
	 * */
	public <T> void show(T str_1){
		System.out.println("show::"+str_1.toString());
	}
	public <T> void print(T str_2) {
		System.out.println("print::"+str_2.toString());
	}
	
	/*
	 * ��������̬ʱ�����ܷ������϶�Ӧ�ķ��ͣ����������Ҫʹ�÷��ͣ�Ҫ�����Ͷ����ڷ�����
	 * 
	 * */
	public static <K> void method(K kk) {
		System.out.println("method::"+kk.toString());
	} 
}

