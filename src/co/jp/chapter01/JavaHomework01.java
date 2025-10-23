package co.jp.chapter01;

public class JavaHomework01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
   
		//質問1：以下変数nの値は？　
        int i = 10;
        int n = i%5;
        System.out.println("nの値は"+n);
        
		//質問２︓ 右の式を解釈してください: a = a > 10 ? 11 : 0; 
        // ①　a > 10 (条件がtrue)　の場合、a　＝　11；
        int a = 15;
        a = a >10 ? 11 : 0;
        System.out.println("aの値は"+a);
        
        // ②　a > 10 (条件がfalse)　の場合、a　＝　0；
        a = 5;
        a = a > 10 ? 11 : 0;
        System.out.println("aの値は"+a);
        
		//質問３︓変数値を⽐較する演算⼦は = or == ? 
        //答え：＝＝
        
		//質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
        //答え　：　「true」　と　「false」です。
	}

}
