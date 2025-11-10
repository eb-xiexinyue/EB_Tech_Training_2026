package co.jp.chapter07;

public class Human {
	
	private String name;
	
	protected int age;
	
	private int money;
	
	int gender;
	
	public Human(String name) {
		this.name = name;
		this.age = 3;
		this.money = 20;
		this.gender = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sleep() {
		
	}
	
//	public void callMyName() {
//		System.out.println("MY name is "+name);
//	}
//	
//	public Human createHuman() {
//		return new Human("human from createHuman()");
//	}
}
