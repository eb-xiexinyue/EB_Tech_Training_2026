package co.jp.chapter05;

public class JavaChapter05 {

	public static void main(String...args) {
		// TODO 自動生成されたメソッド・スタブ
//		System.out.println(args[0]);
//		
//		JavaChapter05 s = new JavaChapter05();
//		s.output();
//		
//		outputStatic();
//		s.outputStatic();
//		JavaChapter05.outputStatic();
//		int s = sum(3,4);
//		System.out.println("sum() returns "+s);
//		String str = "abcb";
//		int idx = str.indexOf('b');
//		System.out.println("indexOf() returns "+idx);
//		String secondStr = getSecondString(new String[] {"abc","bcd","cde"});
//		System.out.println(secondStr);
		
//		demo();
//		demo(2);
//		demo(2,3);
//		demo(1.0f);
//		String str = demo("Java");
//		System.out.println(str);
		
		System.out.println(multiParam("123","456","789"));
	}
	
	 static int fact(int n) { 
		if(n == 0) 
			return 1; 
		else
			return fact(n - 1) * n;
			//n=1 : fact(1) = fact(0) * 1 = 1
			//n=2 : fact(2) = fact(1) * 2 = ( fact(0) * 1 ) * 2 = 1 * 2 = 2 
	 }
	
	static String multiParam(String...str ) {
		return str[1];
	} 
	
	/**
	 * 文字列の配列の2個目の要素を取得する
	 * @param arr 文字列の配列
	 * @return 配列の2個目の要素
	 */
	static String getSecondString(String[] arr) {
		return arr[1];
	}
	
//	void output() {
//		System.out.println("this is not static");
//	}
//	
//	static void outputStatic() {
//		System.out.println("this is static");
//	}
	
	/**
	 * get the sum of a and b
	 * @param a integer
	 * @param b integer
	 * @return a + b integer
	 */
	static int sum(int a, int b) {
		return a + b;
	}
	
	static void demo() {
		System.out.println("from demo()");
	}
	
	static void demo(int a) {
		System.out.println("from demo(int a), a=" +a);
	}
	
	static void demo(int a, int b) {
		System.out.println("from demo(int a, int b), a=" +a+",b="+b);
	}
	
	static void demo(float f) {
		System.out.println("from demo(float f), f=" +f);
	}
	
	static String demo(String s) {
		System.out.println("from demo(String s), s=" +s);
		return s;
	}
}
