package day_16;
import java.util.*;

public class CollectionDemo_2 {

	public static void main(String[] args) {
		
		Collection coll=new ArrayList();
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		//ʹ����Collection iterator()�ķ������ü����еĵ�������������Ϊ�˻�ȡ�����еĶ���
		
		for(Iterator it=coll.iterator();it.hasNext();) {
			System.out.println(it.next());	
		}
		
		System.out.println(coll);
	}

}
