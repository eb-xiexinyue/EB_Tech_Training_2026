package co.jp.chapter07;

public class JavaHomework07 {

    // 質問１︓以下コードのコンパイルエラー理由を教えてください。
    // setAgeというメソッドがPetクラスで定義されていないからです。

	public static void main(String[] args) {
        // 質問2: Mathクラス
        int[] numbers = {3, 7, 1, 9, 4};

        int maxValue = Math.max(numbers);
        int minValue = Math.min(numbers);
        double avgValue = Math.average(numbers);

        System.out.println("\n質問2-1: Mathクラス");
        System.out.println("最大値：" + maxValue);
        System.out.println("最小値：" + minValue);
        System.out.println("平均値：" + avgValue);

        int[][] aData = { {1, 2}, {3, 4} };
        int[][] bData = { {5, 6}, {7, 8} };

        Matrix A = new Matrix(aData);
        Matrix B = new Matrix(bData);

        Matrix C = A.add(B);

        System.out.println("\n質問2-2: ⾏列計算");
        System.out.println("A + B = ");
        C.print();


	}

}

class Math {

    public static int max(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double average(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }
}

class Matrix {

    private final int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
    }

    public Matrix add(Matrix b) {
        int[][] c = new int[2][2];
        c[0][0] = this.data[0][0] + b.data[0][0];
        c[0][1] = this.data[0][1] + b.data[0][1];
        c[1][0] = this.data[1][0] + b.data[1][0];
        c[1][1] = this.data[1][1] + b.data[1][1];

        return new Matrix(c);
    }

    public void print() {
        for (int[] row : data) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


