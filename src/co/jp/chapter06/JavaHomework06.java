package co.jp.chapter06;

import java.util.Arrays;

public class JavaHomework06 {
    // 質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください
    // public static void main(String[] args);
    // 修飾子：public, static
    // 返却型：void
    // 関数名：main
    // 引数：
    //   型：String[]
    //   名称：args

    // 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください
    // 配列の和を求めるメソッド
    public static int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    // 配列の最大値を求めるメソッド
    public static int max(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 配列の最小値を求めるメソッド
    public static int min(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /*
     質問３．以下メソッドの実施結果を教えてください。
        public class Kicker {
            private static void sayHello(String y) {
                y = "Hello world";
            }
            public static void main(String args[]) {
                String x = null;
                sayHello(x);
                System.out.println(x);
            }
        }
    */

    // 【実行結果】 null

    /*
      質問４︓以下メソッドの実施結果を教えてください。
        public class Kicker {
            private static void fillArray(String[] array) {
                array[0] = "value2";
        }
        public static void main(String args[]) {
            String[] array = new String[]{"value1"};
            fillArray(array);
            System.out.println(array[0]);
        }
    }
   */

    // 【実行結果】 value2

    /*
      質問5︓以下メソッドの実施結果を教えてください。
        public class Kicker {
            private static void fillArray(String[] array) {
                array = new String[]{"1", "2"};
            }
            public static void main(String args[]) {
                String[] array = null;
                fillArray(array);
                System.out.println(array == null);
            }
        }
   */

    // 【実行結果】 true

    //   質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
    public static void printArray(Object[] objs) {
        if (objs == null) {
            System.out.println("null");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        String prefix = "";
        for (Object obj : objs) {
            sb.append(prefix);
            sb.append(String.valueOf(obj));
            prefix = ", ";
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    // 質問６-１︓配列をマージする静的メソッド
    public static int[] mergeArray(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        // left 配列をコピー
        for (int i = 0; i < left.length; i++) {
            result[i] = left[i];
        }

        // right 配列をコピー
        for (int i = 0; i < right.length; i++) {
            result[left.length + i] = right[i];
        }

        return result;
    }

    // 質問６-２︓以下静的なメソッドを定義してください。

    public static int[] subArray(int[] array, int startIndex, int length) {

        if(array == null || array.length==0 || startIndex > array.length){
            return new int[]{};
        }


        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = array[startIndex + i];
        }

        return result;
    }

    // 質問７︓以下静的なメソッドを定義してください。
    public static char[] trim(char[] input) {
        int start = 0;
        int end = input.length - 1;

        while (start <= end && input[start] == ' ') {
            start++;
        }

        while (end >= start && input[end] == ' ') {
            end--;
        }

        int length = end - start + 1;

        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = input[start + i];
        }

        return result;
    }

    // 質問8︓バブルソート⽤メソッドを作成してください。
    public static int[] bubbleSort(int[] array) {

        int[] result = array.clone();
        int n = result.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        return result;
    }







    public static void main(String[] args) {
        // 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください
        System.out.println("質問2: 配列の和・MAX値・MIN値を求める処理を関数化し、main関数から呼び出す");
        int[] nums = {3, 8, 1, 9, 4};

        // 各メソッドの呼び出し
        int sum = sum(nums);
        int max = max(nums);
        int min = min(nums);

        // 結果表示
        System.out.println("合計：" + sum);
        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);

        System.out.println("\n質問6-0: 配列をprintします");
        String[] numString = {"one", "two", "three"};
        printArray(numString);

        System.out.println("\n質問6-1: 配列をマージする");
        int[] left = {1, 2, 3, 4};
        int[] right = {5, 6, 7, 8};
        int[] merged = mergeArray(left, right);
        for (int item : merged) {
            System.out.print(item + " ");
        }

        System.out.println("\n質問6-2: startIndexからstartIndex + lengthまでサブ配列を取得する");
        int[] nums2 = {1, 2, 3, 4};
        int[] sub = subArray(nums2, 1, 2);
        for (int item : sub) {
            System.out.print(item + " ");
        }

        System.out.println("\n質問7: 引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください");
        char[] chars = {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
        char[] trimmed = trim(chars);
        System.out.println(trimmed);

        System.out.println("\n質問8: 引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください");
        int[] array = {5, 2, 8, 3, 1};
        int[] sorted = bubbleSort(array);
        System.out.println(Arrays.toString(sorted));

        System.out.println("\n質問9: メソッドの呼び出す練習。\n質問６-１を⽤い、２つ配列をマージします。\n質問８を⽤い、ステップ１のマージした配列をソートする。");
        int[] result = bubbleSort(mergeArray(left, right)); // ← 1行で呼び出し
        System.out.println(Arrays.toString(result));

    }

}
