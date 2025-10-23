package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 9;
		char c = 'c';
		String s = null;
		String sObj = new String("Java");
		
		System.out.println(s);
		System.out.println(sObj);
		
		System.out.println(s == sObj);
		System.out.println("Java".equals(sObj));
		
		System.out.println(sObj.length());
		
		System.out.println("123" + "456");
		System.out.println(123 + "4567");
		
		System.out.println("this is \\ \"Java\"");
		System.out.println("this is\tJava");
		System.out.println("this is\nJava");
		
		System.out.println(1.0 + 2.0);
		System.out.println(1.0 + "2.0");
	}

}
