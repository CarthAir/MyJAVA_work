package cn.itcast.regex.demo;


/*
 * 
 * ���󣺶���һ�����ܶ�QQ�Ž��м���
 * Ҫ�󣺳���5~15��ֻ�������֣�0���ܿ�ͷ
 * 
 * */
public class RegexDemo {
	public static void main(String[] args)
	{
		String QQ="123456";
		String regex="[1-9][0-9]{4,14}";
		boolean bool=QQ.matches(regex);
		if(bool)
			System.out.println(QQ+": ���ϱ�׼");
		else
			System.out.println(QQ+": �����ϱ�׼");
		String str="aiiiiiiiifg";
		String reg="ai{6,}fg";
		System.out.println(str.matches(reg));
	}
}
