package co.jp.chapter08;

public class Parent {
	private String familyName;
	private String givenName;
	private int age;
	
	public Parent(String familyName,String givenName, int age) {
		this.familyName = familyName;
		this.givenName = givenName;
		this.age = age;
	}
	
	public void hello() {
		System.out.println("hello from parent");
	}
	
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
