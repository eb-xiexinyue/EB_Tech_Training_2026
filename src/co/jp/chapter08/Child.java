package co.jp.chapter08;

public class Child extends Parent {

	public Child(String familyName, String givenName, int age) {
		super(familyName, givenName, age);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	@Override
	public void hello() {
		System.out.println("hello from child");
		
		super.hello();
	}

	@Override
	public String toString() {
		return this.getFamilyName() + this.getGivenName()+this.getAge();
	}
	
	@Override
	public boolean equals(Object obj) {
//		Child target = Child.class.cast(obj);
		Child target = (Child)obj;
		
		return target.getGivenName().equals(this.getGivenName());
	}
}
