package co.jp.chapter08;

public class JavaChapter08 {
	
	public class innerClass{
		public void hello() {
			System.out.println("hello from innerClass");
		}
	}
	
	public static void print(Parent p) {
		p.hello();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Child child = new Child("John","Lee",20);
//		System.out.println(child.getFamilyName());
//		System.out.println(child.getGivenName());
//		System.out.println(child.getAge());
//		
//		Parent parent = new Child("Parent","Lee",50);
		
//		print(new Parent("Parent","Lee",50));
//		print(new Child("John","Lee",20));
//		
//		System.out.println((new Parent("Parent","Lee",50)) instanceof Child);
//		System.out.println((new Child("John","Lee",20)) instanceof Parent);
		
		Child c = new Child("Child", "John", 23);
		Child d = new Child("Child2", "John", 25);
		
		System.out.println(c.toString());
		
		System.out.println(c.equals(d));
		
//		JavaChapter08 jc8 = new JavaChapter08();
//		
//		innerClass ic = jc8.new innerClass();
//		ic.hello();
//		
//		System.out.println(jc8.toString());
	}

}
