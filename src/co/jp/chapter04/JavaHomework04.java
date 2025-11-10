package co.jp.chapter04;

public class JavaHomework04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。  
		//回答：{0,0,0,0}です。
		int[] array = new int[4];
		for(int i:array)
			System.out.println(i);
		System.out.println("-------------------------------------------------");
		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//回答：{5,6}です。
		int[] array1 = new int[] {5, 6};
		for(int i:array1)
			System.out.println(i);
		System.out.println("-------------------------------------------------");
		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		//回答：{0,0,0;0,0,0}です。
		int[][] array2 = new int[2][3];
		for(int[] out:array2)
			for(int inner : out)
				System.out.println(inner);
		System.out.println("-------------------------------------------------");
		//問題４︓以下２重Foreachを理解してください。
		//上記の通り、配列のarray２は二次元配列です。外側の長さが２で内側の長さが３です。１重のForeachでは外側の要素（行）を順番に取ります。２重のForeachでは内側（毎行）の要素（列）を順番に取ります。
		
		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
		int[] array3 = new int[] {1, 3, 5, 7, 100, 0, 1};
		int mmax = -999999;
		int mmin = 999999;
		for(int i:array3) {
			if(i>mmax)
				mmax = i;
			if(i<mmin)
				mmin = i;
		}
		System.out.println(mmax);
		System.out.println(mmin);
		System.out.println("-------------------------------------------------");
		//問題６︓問題１の配列のSUMを求める。
		int sum = 0;
		for(int i:array)
			sum += i;
		System.out.println(sum);
		System.out.println("-------------------------------------------------");
		//問題７︓⾏列（２次元配列）の和と積を計算してください。
		int[][] array4 = new int[][] {
			{0,1,2},
			{3,4,5}
		};
		int sum2 = 0;
		for(int[] out:array4)
			for(int inner : out)
				sum += inner;
		System.out.println(sum);
		System.out.println("-------------------------------------------------");
	}

}
