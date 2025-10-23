package co.jp.chapter01;

public class JavaHomework01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問1：以下変数nの値は？　答え： 0
		int i = 10;
		int n = i%5;
		System.out.println("nの値は"+n);
		
		//質問2：右の式を解釈してください：a = a > 10 ? 11 : 0;
		//　①　a ＞ 10（条件がture）の場合、a = 11;
		int a = 15;
		a = a > 10 ? 11 : 0;
		System.out.println("aの値は" +a);
		
		//　②　a <= 10 （条件がfalse）の場合、a = 0;
		a = 5;
		a = a > 10 ? 11 : 0;
		System.out.println("aの値は" +a);
		
		//質問3：変数値を比較する演算子は　= or ==?
		// 答え： == です。
		
		//質問4：ブリアン(boolean)変数に設定可能の値は「？」　「？」。
		//答え：「ture」と「false」です。
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
