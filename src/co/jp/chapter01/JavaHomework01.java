package co.jp.chapter01;

public class JavaHomework01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 質問１
        int i = 10;
        int n = i % 5;
        System.out.println("質問1：nの値 = " + n); 
        
     // 質問２
        int a = 8;
        a = a > 10 ? 11 : 0;
        System.out.println("質問2：aの値 = " + a); 

        a = 12;
        a = a > 10 ? 11 : 0;
        System.out.println("質問2（再）：aの値 = " + a);
        
     // 質問３
        int x = 5;
        int y = 5;
        boolean isEqual = (x == y); 
        System.out.println("質問3：x == y ? " + isEqual); 
        
     // 質問４
        boolean flagTrue = true;
        boolean flagFalse = false;
        System.out.println("質問4：flagTrue = " + flagTrue + ", flagFalse = " + flagFalse);
	}

}
