package net.istudy.news.demo;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.*;//��̬���룬��ʵ����������еľ�̬��Ա
import static java.lang.System.*;

public class StaticImportDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("anca");
		list.add("anck");
		list.add("anca");
		list.add("ancg");
	
		out.println(list);
		
		sort(list);
		
		out.println(list);
		
		String max=max(list);
	
		System.out.println("max="+max);
	} 

}
