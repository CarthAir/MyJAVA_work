package net.istudy_2.bean;

import java.lang.Comparable;

public class Person implements Comparable{
	protected String name;
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age Ҫ���õ� age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person::"+name+":"+age;
	}
	
	/* ���� Javadoc��
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	/* ���� Javadoc��
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.getName().hashCode()+this.getAge();
	}

	protected int age;
	@Override
	public int compareTo(Object o) {
		Person p=(Person)o;
		int temp=this.getAge()-p.getAge();
		return temp==0?this.getName().compareTo(p.getName()):temp;
	}
}
