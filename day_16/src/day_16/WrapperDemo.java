package day_16;
/*
 * 
 * �����������Ͷ����װ�ࡣ
 * Ϊ�˷������������������ֵ�������װ���˶����ڶ����ж��������Ժ���Ϊ���ḻ�˸����ݵĲ�����
 * ���������ö�����࣬�ͳ��������������Ͷ����װ�ࡣ
 * 
 * 
 * 
 * byte		Byte
 * short	Short
 * int 		Integer
 * long 	Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * */

public class WrapperDemo {
	public static void main(String[] args)
	{
//		Integer itg=new Integer(999);
//		System.out.println(itg.toHexString(1));
//		System.out.println(Integer.MAX_VALUE);
//		Integer iu=new Integer(Integer.MAX_VALUE);
//		System.out.println(Integer.toBinaryString(iu-1));
//		int x=Integer.parseInt("23243");
//		int y=Integer.to
//		System.out.println(y);
//		System.out.println(x);
//		System.out.println(x+1);
//		System.out.println(Integer.parseInt("123")+1);
//		wrapperDemo_1();
//		wrapperDemo_2();
//		wrapperDemo_3();
		wrapperDemo_4();
	}

	private static void wrapperDemo_4() {
		Integer a=new Integer("333");
		Integer b=new Integer("333");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));
		
	}

	private static void wrapperDemo_3() {
		/*
		 * �������Ƶ�ʮ����
		 * 
		 * 
		 * */
		System.out.println(Integer.parseInt("3c", 15));
	}

	private static void wrapperDemo_2() {
		/*
		 * ���ɶ������
		 * 
		 * 
		 * */
		System.out.println(Integer.toString(219,3));
	}

	private static void wrapperDemo_1() {
//		ʮ����ת������������ʾ��
//		��������ת����ʮ����
		System.out.println(Integer.toBinaryString(-2));
		
	}
	

}












