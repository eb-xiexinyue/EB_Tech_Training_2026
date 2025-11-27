package co.jp.chapter12;

public class JavaChapter12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		try {
//			System.out.println(20/0);
//		}
//		catch(NullPointerException e) {
//			System.out.println("NullPointerException!");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("ArithmeticException!");
//		}
//		catch(ArithmeticException | NullPointerException e) {
//			System.out.println("Exception!");
//		}
//		catch(Exception e) {
//			System.out.println("Exception!");
//		}
//		catch(ArithmeticException | NullPointerException e) {
//		System.out.println("Exception!");
//	}
//		catch(ArithmeticException e) {
//			System.out.println("Exception!");
//		}
//		catch(Exception e) {
//			System.out.println("Exception!");
//		}
//		
//		finally {
//			System.out.println("finished!");
//		}
//		try {
//			throwException(8);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("ArithmeticException!");
//		}
		
		try {
			throwMyException(8);
		}
		catch(MyException e) {
			System.out.println(e.msg);
		}
		
	}
	
	/**
	 * 
	 * @param a
	 * @throws ArithmeticException
	 */
	public static void throwException(int a) throws ArithmeticException{
		System.out.println(a/0);
	}
	
	/**
	 * 
	 * @param a
	 * @throws ArithmeticException
	 */
	public static void throwMyException(int a) throws MyException{
		throw new MyException("this is MyException msg");
	}

}

class MyException extends ArithmeticException{
	String msg;
	MyException(String msg){
		super();
		this.msg = msg;
	}
}
