package co.jp.chapter07;

public class Pet {
	private String name;
	
	private int age;
	
	public final static int startAge = 0;
	
	public Pet(String name) {
		this.name = name;
	}
	
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void run() {
		System.out.println("running....");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
