package daye15;

public class StringDemo {
/**
 * @param Carth
 * */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		/*
		 * string���ص�
		 * �ַ�������һ������ʼ���Ͳ����Ըı䡣
		 * */
//		stringDemo1();
		stringDemo2();
		stringDemo3();
	}

	public static void stringDemo3() {
		
	
	}

	public static void stringDemo2() {
		String s1="abc";//�������д���
		String s2=new String("abc");
		String s3=new String("abc");//���д���
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
	} 

	/**
	 * ��ȷ������
	 */
	public void stringDemo1() {
		String a2="hahha";//a1�洢���ַ��������أ�û�д������о������á�
		String a1="hahha";
		System.out.println(a1==a2);
		System.out.println("a--"+a1);
	}

}
