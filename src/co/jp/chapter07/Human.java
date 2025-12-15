package co.jp.chapter07;

public class Human {
	public String name;
	protected int age;
	private int money;
	
	Human(String name, int age, int money){
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sleep() {}

}
