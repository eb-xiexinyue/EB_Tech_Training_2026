package co.jp.chapter08;

public class Child extends Parent {

	public Child(String familyName, String givenName, int age) {
		super(familyName, givenName, age);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	@Override
	public void hello() {
		System.out.println("hello from child");
	}

}
