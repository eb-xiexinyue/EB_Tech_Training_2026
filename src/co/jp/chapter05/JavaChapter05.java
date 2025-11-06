package co.jp.chapter05;

public class JavaChapter05 {

	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ

		String secondStr = getSecondString(new String[] {"abc","bcd","cde"});
		System.out.println(secondStr);
	}
	
public static String getSecondString(String[] arr) {
	return arr[1];
}
}
