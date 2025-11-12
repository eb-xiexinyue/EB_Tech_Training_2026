package co.jp.chapter06;

public class JavaHomework06 {

    // 質問1
    // public static void main(String[] args);
    // 修飾子：public static
    // 返却型： void
    // 関数名：main
    // 引数の型：String[]
    // 引数の名称：args


    // 質問2：配列の和、最大、最小を求める関数
    public static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }

    public static int max(int[] a) {
        int m = a[0];
        for (int x : a) if (x > m) m = x;
        return m;
    }

    public static int min(int[] a) {
        int m = a[0];
        for (int x : a) if (x < m) m = x;
        return m;
    }


    // 質問6-0：
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


    // 質問6-1：
    public static int[] mergeArray(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int index = 0;
        for (int x : left) result[index++] = x;
        for (int x : right) result[index++] = x;
        return result;
    }


    // 質問6-2：
    public static int[] subArray(int[] array, int startIndex, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = array[startIndex + i];
        }
        return result;
    }


    // 質問7：
    public static char[] trim(char[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end && array[start] == ' ') start++;
       
        while (end >= start && array[end] == ' ') end--;

        int length = end - start + 1;
        return subCharArray(array, start, length);
    }

    
    public static char[] subCharArray(char[] array, int start, int length) {
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = array[start + i];
        }
        return result;
    }


    // 質問8：
    public static int[] bubbleSort(int[] array) {
        int[] result = array.clone();
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }


    //mainメソッドのまとめ
    public static void main(String[] args) {
        System.out.println("質問2:");
        int[] data = {2, 4, 6, 8, 10};
        System.out.println("合計 = " + sum(data));
        System.out.println("最大 = " + max(data));
        System.out.println("最小 = " + min(data));

        System.out.println("\n質問3の実行結果は: null");
        System.out.println("質問4の実行結果は: value2");
        System.out.println("質問5の実行結果は: true");

        System.out.println("\n質問6-0:");
        String[] fruits = {"apple", "banana", "grape"};
        printArray(fruits);

        System.out.println("\n質問6-1:");
        int[] left = {1, 2, 3, 4};
        int[] right = {5, 6, 7, 8};
        int[] merged = mergeArray(left, right);
        printArray(new Integer[]{1,2,3,4,5,6,7,8});

        System.out.println("\n質問6-2:");
        int[] array = {1, 2, 3, 4};
        int[] sub = subArray(array, 1, 2);
        printArray(new Integer[]{2,3});

        System.out.println("\n質問7:");
        char[] chars = {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
        char[] trimmed = trim(chars);
        System.out.println(trimmed);

        System.out.println("\n質問8:");
        int[] unsorted = {4, 2, 7, 1, 3};
        int[] sorted = bubbleSort(unsorted);
        printArray(new Integer[]{1,2,3,4,7});
        
        System.out.println("\n質問9:");
        int[] result = bubbleSort(mergeArray(left, right)); // ← 1行で呼び出し
        printArray(new Integer[]{1,2,3,4,5,6,7,8});
    }
}
