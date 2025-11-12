package co.jp.chapter06;

public class JavaChapter06 {
    private static void sayHello(String y) {
        y = "Hello word";
    }

    public static void main(String[] args) {
        String x = null;
        sayHello(x);
        System.out.println(x);
    }
}
