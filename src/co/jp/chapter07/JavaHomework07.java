package co.jp.chapter07;

public class JavaHomework07 {

    public static void main(String[] args) {

    //質問1：以下のコードのコンパイルエラー理由を教えてください
    	//Pet.java
    	// public class Pet { 
    	//   public String  name; 
    	//   public void setName(String value) { 
    	//    this.name = value;
    	//   }
    	// }
    	//Kicker.java
    	// public class Kicker {
    	//    public static void main(String...args) {
    	//      Pet cat = new Pet();
    	//       cat.setAge(1234);
    	//    }
    	// }
    	//このコードがコンパイルエラーになる理由は、
    	//Pet クラスには setAge メソッドがないのに、
    	//Kicker クラスで setAge(1234) を呼び出しているためです。
    	//PetクラスにあるのはsetNameだけなので、
    	//存在しないメソッドを呼び出してエラーになっています。
    			
    			
    	//質問2：Mathクラスを作成してください。以下メソッドを定義します。
    	// 1.配列のMAXを求める静的メソッドを定義。（引数は int 配列）
    	// 2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
    	// 3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
    	// 4. mainメソッドで上記それぞれメソッドを呼び出してください。

        // Mathクラスのメソッドを呼び出す
        int[] data = {4, 1, 9, 3};
        
        System.out.println("MAX = " + Math.max(data));
        System.out.println("MIN = " + Math.min(data));
        System.out.println("AVG = " + Math.avg(data));

        // 行列計算の動作確認
        int[][] aData = {{1, 2}, {3, 4}};
        int[][] bData = {{5, 6}, {7, 8}};

        Matrix a = new Matrix(aData);
        Matrix b = new Matrix(bData);
        Matrix c = a.add(b);

        System.out.println("\n行列A+B = ");
        System.out.println(c.get(0,0) + " " + c.get(0,1));
        System.out.println(c.get(1,0) + " " + c.get(1,1));
    }
}

// 質問2: Mathクラス 
class Math {

    public static int max(int[] input) {
        int m = input[0];
        for (int x : input) if (x > m) m = x;
        return m;
    }

    public static int min(int[] input) {
        int m = input[0];
        for (int x : input) if (x < m) m = x;
        return m;
    }

    public static double avg(int[] input) {
        int sum = 0;
        for (int x : input) sum += x;
        return (double) sum / input.length;
    }
}

//  質問3: Matrixクラス 
class Matrix {

    private final int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
    }

    public Matrix add(Matrix b) {
        int[][] result = new int[2][2];

        result[0][0] = this.data[0][0] + b.data[0][0];
        result[0][1] = this.data[0][1] + b.data[0][1];
        result[1][0] = this.data[1][0] + b.data[1][0];
        result[1][1] = this.data[1][1] + b.data[1][1];

        return new Matrix(result);
    }

    public int get(int r, int c) {
        return data[r][c];
    }
}
