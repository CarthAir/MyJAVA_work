package cn.itcast.regex.demo;

import com.sun.org.apache.xpath.internal.functions.FunctionDef1Arg;

public class RegexDemo2 {
	public static void main(String[] args) {
		/*
		 * 
		 * ������ʽ���ַ����ĳ���������
		 * 1��ƥ�䣺
		 * 		��ʵ����ʹ��String���matches����
		 * 
		 * 2���и�
		 * 		��ʵ����String���split����
		 * ��ĸ���
		 * 		
		 * 3���滻
		 * 		��ʵʹ�õľ���String�е�replaceAll����
		 * 
		 * 
		 * 4����ȡ
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
//		functionDemo_1(); 
//		functionDemo_2();
//		functionDemo_3();
		functionDemo_4();
	}

	private static void functionDemo_4() {
		
		
		
		
	}

	private static void functionDemo_3() {
		String str1="eeeeesdggdfhgfb";
		String str2="13814652886";
		
		str1=str1.replaceAll("(.)\\1+","$1");
		str2=str2.replaceAll("(\\d{3})(\\d{5})(\\d{3})", "$1****$3");
		System.out.println(str2);
//		System.out.println(str1);
	}

	private static void functionDemo_2() {
		//
		String str2="guhaollllljibassssskika";
		
		
		String[] names=str2.split("(.)\\1+");
		
		for (String name:names) {
			System.out.println(name);
		}
		
	}

	private static void functionDemo_1() {
		//ƥ���ֻ������Ƿ���ȷ
		
		String str1="13510022558";
		String regex="1[358]\\d{9}";
		
		boolean b=str1.matches(regex);
		
		System.out.println("Tel: "+b);
	}
}












