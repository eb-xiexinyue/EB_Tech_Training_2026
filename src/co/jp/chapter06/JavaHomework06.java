package co.jp.chapter06;

public class JavaHomework06 {

    //質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください
    //   public static void main(String[] args);
    //修飾子：public static　返却型:void　関数名:main　引数の型:String[]　引数の名称:args


    //質問2：配列の和、MAX値、MIN値を求める処理を関数化してください。main関数に呼び出してください
    //配列の和を求めるメソッド
    public static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }

    //配列の最大値を求めるメソッド
    public static int max(int[] a) {
        int m = a[0];
        for (int x : a) if (x > m) m = x;
        return m;
    }

    //配列の最小値を求めるメソッド
    public static int min(int[] a) {
        int m = a[0];
        for (int x : a) if (x < m) m = x;
        return m;
    }

    //質問6－0：配列は直接に印刷できません。
    //下記メソッドを利用して、配列をprintします。
    //以下メソッドを呼び出してください
    public static void printArray(Object[] objs) {
        if (objs == null) {
            System.out.println("null");
            return;
        }

        String prefix = "";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objs) {
            sb.append(prefix);
            sb.append(String.valueOf(obj));
            prefix = ", ";
        }
        sb.append("]");
        System.out.println(sb.toString());
    }


    //mainメソッド
    public static void main(String[] args) {

        int[] data = {2, 4, 6, 8, 10};
        System.out.println("質問2: ");
        System.out.println("配列の要素: 2,4,6,8,10");
        System.out.println("合計 = " + sum(data));
        System.out.println("最大 = " + max(data));
        System.out.println("最小 = " + min(data));

        //質問3
        System.out.println("\n質問3の実行結果は: null");

        //質問4
        System.out.println("\n質問4の実行結果は: value2");

        //質問5
        System.out.println("\n質問5の実行結果は: true");

        //質問6-0
        System.out.println("\n質問6-0の実行結果:");
        String[] fruits = {"apple", "banana", "grape"};
        printArray(fruits);
        printArray(null);
    }
}
