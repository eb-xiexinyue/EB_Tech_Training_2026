package co.jp.chapter08;

public class JavaChapter08 {
	
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
		
		print(new Parent("Parent","Lee",50));
		print(new Child("John","Lee",20));
		
		System.out.println((new Parent("Parent","Lee",50)) instanceof Child);
		System.out.println((new Child("John","Lee",20)) instanceof Parent);
	}

}
