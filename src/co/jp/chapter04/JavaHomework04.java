package co.jp.chapter04;

public class JavaHomework04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問題1：int[] array = new int[4];各要素の値を記載してください。
		//答え：array = [0, 0, 0, 0];
		
		//問題2：int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//答え：array = [5, 6];
		
		//問題３:int[][] array = new int[2][3]; 各要素の値を記載してください。
		//答え： 2行3列の2次元配列、すべて初期値は0
		//       [0, 0, 0]
		//       [0, 0, 0]

		//問題4：以下２重Foreachを理解してください。
		int[][]array2d = new int [4][2];
		for(int[] out:array2d) {
			for(int inner:out) {
				System.out.println(inner);
			}
		}
		//問題4は4行2列の2次元配列、すべて初期値は0。
		//ループを使って、outが1行分の配列[0,0]を取り出し、
		//その名でinnerが0,0を順番に出力する　→　これを4回繰り返す
		
		
		//問題5：︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を
		//System.out.println()。
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max = array[0];
		int min = array[0];

		for (int n : array) {
		    if (n > max) max = n;
		    if (n < min) min = n;
		}
		System.out.println("\n問題5: ");
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);
		
		//問題６︓問題１の配列のSUMを求める。
		int sum = 0;
		for (int n : array) {
		    sum += n;
		}
		System.out.println("\n問題6: ");
		System.out.println("問題1の配列の合計は: " + sum);
		
		//問題７：行列（２次元配列）の和と積を計算してください。
		//例として二次元配列を以下になる
		int[][] array1 = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };
		
		int sum1 = 0;//和を入れる変数,初期値は0
        int product = 1;//積を入れる変数,初期値は1
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sum1 += array1[i][j];
                product *= array1[i][j];
            }//forループを使って、配列のすべての要素に順番にアクセスする
        }
        System.out.println("\n問題7: ");
        System.out.println("和 = " + sum1);
        System.out.println("積 = " + product);	
	}

}
