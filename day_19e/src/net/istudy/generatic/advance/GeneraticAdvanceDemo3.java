package net.istudy.generatic.advance;

import java.util.ArrayList;

import net.istudy_2.bean.Person;
import net.istudy_2.bean.Student;
import net.istudy_2.bean.Worker;

public class GeneraticAdvanceDemo3 {

	public static void main(String[] args) {
		ArrayList<Person> al_1=new ArrayList<Person>();
		al_1.add(new Person("p1",23));
		al_1.add(new Person("p2",56));
		
		ArrayList<Worker> al_2=new ArrayList<Worker>();
		al_2.add(new Worker("w1",12));
		al_2.add(new Worker("w2",43));
		
		ArrayList<Student> al_3=new ArrayList<Student>();
		al_3.add(new Student("s1",14));
		al_3.add(new Student("s2",21));
	}
}

//һ���ڴ洢Ԫ��ʱ����ʹ�����ޣ���Ϊ����ȡ�����ǰ����������������㣬����������Ͱ�ȫ����
class  MyCollection<E>
{
	public void add(E e) {
		
	}
	public void addAll(MyCollection<? extends E>c) {
		//�������޶��˴���ķ�Χ�����ҿ��Դ洢����������Ԫ��(��չ����)
	}
}