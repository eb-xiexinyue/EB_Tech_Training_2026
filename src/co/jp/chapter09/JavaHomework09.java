package co.jp.chapter09;

public class JavaHomework09 {
    public static void main(String[] args) {
        /*
          質問１︓以下ソースにラムダ式の使う場所を解釈してください。
          import java.awt.event.ActionEvent;
          import java.awt.event.ActionListener;
          import javax.swing.JButton;
          import javax.swing.JFrame;
          public class GUISample {
              public static void main(String[] args) {
                  JFrame window = new JFrame("DCNet Java 教育");
                  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  window.setSize(800, 600);
                  JButton btn = new JButton("hello world");
                  window.getContentPane().add(btn);
                  btn.addActionListener((ActionEvent e) -> {　　　　// ここから
                      System.out.println("ボタンクリックしました。");
                  });                                             // ここまで
                  window.setVisible(true);                        // ラムダ式は Java1.8の新し機能である。構⽂は:
              }                                                   // (実装するメソッドの引数) -> { // 処理内容 };
         }
         質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
         public class Kicker {
              public static void main(String... args) {
                  new Thread() {                                      // ここから
                      @Override
                      public void run() {
                          System.out.println("thread running...");
                      }
                  }.start();                                         // ここまで
            }
        }

      */

    }
}
