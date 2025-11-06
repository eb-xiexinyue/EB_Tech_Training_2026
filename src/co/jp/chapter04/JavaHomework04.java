package co.jp.chapter04;

public class JavaHomework04 {

	public static void main(String[] args) {
//問題1
//[0,0,0,0]

//問題2
//array[0] = 5
//array[1] = 6

//問題3
//[0,0,0]
//[0,0,0]

//問題４
// array2dは4行2列の二次元配列であり、その各要素は全部初期化設定で０である。
// 外側にあるfor (int[] out : array2d)は、「array[0]」から「array[3]」までという順に各行を取り出す。
// そして内側にあるfor(int inner : out)はその行の各要素（即ち各列）を順に取り出す。
// よって0が合計8回、行替えが入った形式で出力される。

//問題5
        int[] array = new int[]{1,3,5,7,100,0,1};
        int max = array[0], min = array[0];
        for (int x : array) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("max=" + max);// max=100
        System.out.println("min=" + min);// min=0

//問題6
        int[] array2 = new int[4];
        int sum = 0;
        for (int y : array2) {
            sum += y;
        }
        System.out.println("sum=" + sum);// sum=0

//問題7
        int[][] arr2d = new int[][]{
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        int arr2dSum = 0;
        int arr2dProduct = 1;

        for (int[] row : arr2d) {
            for (int v : row) {
                arr2dSum += v;
                arr2dProduct *= v;
            }
        }
        System.out.println("各要素の和は" + arr2dSum);//45
        System.out.println("各要素の積は" + arr2dProduct);//362880

    }

}
