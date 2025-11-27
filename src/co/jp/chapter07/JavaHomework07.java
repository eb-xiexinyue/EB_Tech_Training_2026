package co.jp.chapter07;
import co.jp.chapter07.Math;
import co.jp.chapter07.Matrix;

public class JavaHomework07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問１︓以下コードのコンパイルエラー理由を教えてください。
//		// Pet.java
//		public class Pet {
//			public String name;
//			public void setName(String value) {
//				this.name = value;
//			}
//		}
//		// Kicker.java
//		public class Kicker {
//			public static void main(String...args) {
//				Pet cat = new Pet();
//				cat.setAge(1234);
//			}
//		}
		//Kickerというクラスのなかで、catというPetクラスの実体が定義されていました。
		//そして、Petクラスに所属するsetAgeという関数を呼び出してみます。
		//けれども、Petで関数のsetAgeが定義されでいません。ということで、アクセスすることもできません。
		//19行目で、コンパイルエラーになりました。
		
		//質問２︓Mathクラスを作成してください。以下メソッドを定義します。
		//		1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
		//		2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
		//		3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
		//		4. mainメソッドで上記それぞれメソッドを呼び出してください。
		int[] test = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(Math.max(test));
		System.out.println(Math.min(test));
		System.out.println(Math.average(test));
		
		Matrix ori = new Matrix(new int[][] {{1,2},{3,4}}) ;
		Matrix ori2 = new Matrix(new int[][] {{1,2},{3,4}}) ;
		Matrix res = ori.add(ori2);
		
	}

}
