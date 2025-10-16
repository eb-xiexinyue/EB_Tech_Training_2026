package co.jp.chapter01;

public class JavaChapter01 {
	
	final static int z = 9;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean result;
		result = true;
		
		//boolean result = true;
		
		char capitalC = 'C';
		
		byte b = 100;
		short s = 10000;
		int i = 2000;
		long l = 200000;
		float f = 1.001f;
		double d = 1.002;
		
//		System.out.println("boolean型:"+result);
//		System.out.println("char型:"+capitalC);
//		System.out.println("byte型:"+b);
//		System.out.println("short型:"+s);
//		System.out.println("int型:"+i);
//		System.out.println("long型:"+l);
//		System.out.println("float型:"+f);
//		System.out.println("double型:"+d);
		
		int x = 10;
		int y = 20; 
		x = y; 
		y = 30;
//		System.out.println(x);
//		System.out.println(y);
		
//		System.out.println(z);
		
		
//		System.out.println("1+1="+ (1 + 1));
//		System.out.println("3-1="+ (3 - 1));
//		System.out.println("3*2="+ (3 * 2));
//		System.out.println("8/2="+ (8 / 2));
//		System.out.println("9%2="+ (9 % 2));
		
		//後置
//		int ic = 1;
//		//ic++;
//		System.out.println("ic++:"+ ic++);
//		System.out.println("ic++後:"+ ic);
//		
//		int dc = 9;
//		//dc--;
//		System.out.println("dc--:"+ dc--);
//		System.out.println("dc--後:"+ dc);
		
		//前置
//		int ic = 1;
//		//ic++;
//		System.out.println("ic:"+ (++ic));
//		System.out.println("ic++後:"+ ic);
//		
//		int dc = 9;
//		//dc--;
//		System.out.println("dc--:"+ (--dc));
//		System.out.println("dc--後:"+ dc);
		
		System.out.println("1==1 :"+ (1==1));
		System.out.println("1!=1 :"+ (1!=1));
		System.out.println("2>1 :"+ (2>1));
		System.out.println("2>=1 :"+ (2>=1));
		System.out.println("2<3 :"+ (2<3));
		System.out.println("2<=3 :"+ (2<=3));
		
		System.out.println("2<=3 && 5>3 :"+ (2<=3 && 5>3));
		System.out.println("2<=3 || 5<3 :"+ (2<=3 || 5<3));
		System.out.println("!(2<=3) :"+ !(2<=3));
		
		System.out.println("(3 > 2 ? 1 : 0) :"+ (3 > 2 ? 1 : 0));
		System.out.println("(3 > 5 ? 1 : 0) :"+ (3 > 5 ? 1 : 0));
	}

}
