package daye15;

/*
 * �����ַ������顣�����ֵ�˳����дӴ�С������
 * {"nba","abc","cba","zz","qq","haha"}
 * 
 * ˼·��
 * 1���������������
 * 2��forǶ�׺ͱȽ��Լ���λ��
 * 
 * һ���Ӵ��������г��ֵĴ�����
 * "nbaernbatynbauinbaopnba"
 * ˼·��
 * 1��Ҫ�ҵ��Ӵ��Ƿ���ڣ������ڻ�ȡ��λ�á���indexOf��ɡ�
 * 2�������ҵ��ˣ���ô��¼���ֵ�λ�ò���ʣ���ַ����м������Ҹ��Ӵ���
 * 
 * 
 * 
 * �����ַ����������ͬ���Ӵ�
 * 1����Ȼȡ��������Ӵ����ȿ��̵��ַ����Ƿ����Ǹ������ַ�����
 * ������ڣ��̵��Ǹ���������Ӵ�
 * 2��������ǣ����̵��Ǹ����г��ȵݼ��ķ�ʽȥ�Ӵ���ȥ�������ж��Ƿ���ڡ�
 * 
 * 
 * 
*/
public class StringTest {
	public static void main(String[] args) {
//		String[] arr= {"nba","abc","cba","zz","qq","haha"};
//		stringSort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("");
//		String str="nbaernbatynbauinbaopnba";
//		String key="nba";
//		int count=stringCount_1(str,key);
//		System.out.println("The count of \""+key+"\" = "+count);
//		int count=stringCount_2(str,key);
//		System.out.println("The count of \""+key+"\" = "+count);
//		String str1="diu";
//		String key2="hahuhiahdiufw";
//		String str2=stringCount_3(str1,key2) ;
//		System.out.println(str2);
		
		
		
	}
/*
 * ��ȡ����Ӵ�
 * 
 * */
	private static String stringCount_3(String str1, String key2) {
		for(int x=0;x<str1.length();x++){
			for(int y=0,z=str1.length()-x;z!=str1.length()+1;y++,z++) {
				String subStr=str1.substring(y,z);
//				System.out.println(subStr);
				if(key2.contains(subStr))
					return subStr;
			}
		}
		return null;
	}

	private static int stringCount_2(String str, String key) {
		int count=0;
		return count;
	}

	private static int stringCount_1(String str,String key) {
		int count=0;
		int index=0;
		while((index=str.indexOf(key))!=-1){
			str=str.substring(index+key.length());
			count++;
		}
		return count;
	}

	private static void stringSort(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String str;
					str=arr[i];
					arr[i]=arr[j];
					arr[j]=str;
				}				
			}
		}
	}
	
}
		














