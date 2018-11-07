package daye15;

/*
 * �����������˼�뽫�ַ������ܽ��з���
 * 
 * 1����ȡ
 * 1.1����ȡ�ַ�������
 * 		int length();
 * 1.2������λ�û�ȡ�ַ�
 * 		char charAt(int index)
 * 1.3�������ַ���ȡ���ַ�����һ�γ��ֵ�λ�á�
 * 		int indexOf (int ch)
 * 		��ָ����������ʼ�����������ڴ��ַ����е�һ�γ���ָ���ַ����������� 
 * 		int indexOf(int ch, int fromIndex) 
 * 		��ָ������������ʼ�����ص�һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е������� 
 * 		int indexOf(String str, int fromIndex)
 * 		���ص�һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е������� 
 * 		int indexOf(String str)    
 *1.4����ȡ�ַ����е�һ�����ַ�����Ҳ���Ӵ�
 *		String substring(int,int)
 *		substring(int beginIndex)
 *	
 *2��ת��
 *2.1�����ַ���ת�����ַ����顣
 *		String[] split(String regex) :�漰��������ʽ
 *2.2�������ַ���ת��Ϊһ���µ��ַ����顣
 *		char[] toCharArray()  	
 *2.3��ʹ��ָ�����ַ������� String ����Ϊ�ֽ����У���������洢��һ���µ��ֽ������С�    
 *		byte[] getBytes(String charsetName) 
 *2.4������һ���µ��ַ���������ͨ���� newChar �滻���ַ����г��ֵ����� oldChar �����ɵġ�
 *		String replace(char oldChar, char newChar) 
 *2.5����ָ���ַ����������ַ����Ľ�β��
 *		String concat(String str) 
 *
 *3���ж�
 *3.1�������ַ��������Ƿ���ͬ��
 *		boolean equals(Object anObject) 
 *3.2�����ҽ������ַ������� char ֵ��ָ������ʱ���ŷ��� true��
 *		boolean contains(CharSequence s) 
 */
public class StringMethodDemo {
	public static void main(String[] args) {
//		stringMethod_1();
//		stringMethod_2();
//		stringMethod_3();
//		stringMethod_4();
//		stringMethod_5();
//		stringMethod_6();
//		stringMethod_7(); 
		stringMethod_8(); 
	}

	private static void stringMethod_8() {
		String str="abcdefg";
		System.out.println(str.equalsIgnoreCase("ABCDEFG"));
	}

	private static void stringMethod_7() {
		String str="abg";
		System.out.println(str.concat("sdd"));
	}

	private static void stringMethod_6() {
		String str="jhisfhosd��";
		String st=str.replace('h', '3');
		System.out.println(st);
		System.out.println("-"+" ads d s  ".trim()+"+");
	}

	private static void stringMethod_5() {
		String str="jhisfhosd��";
		byte[] arr=str.getBytes();
		for (int i = 0; i < arr.length; i++) {
			byte b = arr[i];
			System.out.print(arr[i]+" ");
		}
	}

	private static void stringMethod_4() {
		String str="abc";
		char[] s=str.toCharArray();
		for (int i = 0; i < s.length; i++) {
			char c = s[i];
			System.out.println(s[i]);
		}
	}

	private static void stringMethod_3() {
		String str="����.����.����";
		String[] s=str.split("\\.");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	private static void stringMethod_2() {
		String str="abbccddeesds";
		System.out.println(str.substring(2,6));
		System.out.println(str.substring(3));
	}

	private static void stringMethod_1() {
		String str="abccccde";
		System.out.println(str.length());
		System.out.println(str.indexOf('c',4));
		System.out.println(str.indexOf("cc"));
		System.out.println(str.charAt(4));
		System.out.println(str.lastIndexOf("cc"));
		System.out.println(str.lastIndexOf("cd"));
	}
}




