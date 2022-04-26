package com.practiceprograms.imppgms;

class Serialization {

	int eid;
	String name;
	int age;
	
	public int getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[eid=" + eid + ", name=" + name + ", age=" + age + ""
				+ "]";
	}
	
}

public class SerializationEx
{
	public static void main(String[] args) {
		Serialization ser = new Serialization();
		ser.setAge(23);
		ser.setEid(23423);
		ser.setName("ABC");
		
		System.out.println(ser);


	}
}

