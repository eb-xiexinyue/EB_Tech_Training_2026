package co.jp.chapter01;

public class JavaHomework01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//質問　１：以下変数nの値は？ 0です
		int i = 10;
		int n = i%5;
		System.out.println("nの値は"+n);
		
		//質問　２：右の式を解釈してください：a = a>10 ? 11:0;
		//？の前の論理式の結果はtrueの場合、：前の式にします
		//逆に？の前の論理式の結果はfalseの場合、：後ろの式にします
		int a = 11;
		System.out.println("a>10の時、a = a>10 ? 11:0の結果は"+(a>10 ? 11:0));
		a = 9;
		System.out.println("a<10の時、a = a>10 ? 11:0の結果は"+(a>10 ? 11:0));
	
		//質問　３：変数値を比較する演算子は＝or＝＝？　＝＝です　＝とは代入用の演算子です。
		
		//質問　４：ブリアン変数に設定可能の値は「？」「？」　trueとfalseです
	
	}

}
