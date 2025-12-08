package co.jp.chapter02;

public class JavaHomework02 {

	public static void main(String[] args) {
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
	if(a >= 90) {
		System.out.println("A");
	} else if(a >= 80) {
		System.out.println("B");
	} else if(a >= 70) {
		 System.out.println("C");
	} else if(a >= 60) {
		 System.out.println("D");
	} else {
		 System.out.println("E");
	}
		// TODO 自動生成されたメソッド・スタブ

	}
	{
	//⽇本のコインを１円、５円、１０円、１００円、５００円があります。
	//３３４０ 円のコイン数をもとめください。
	    int totalAmount = 3340;
	    
	        
	    int coins500 = totalAmount / 500; // 500円玉の枚数
	    totalAmount %= 500; // 残りの金額
	        
	    int coins100 = totalAmount / 100; // 100円玉の枚数
	    totalAmount %= 100; // 残りの金額
	        
	    int coins10 = totalAmount / 10; // 10円玉の枚数
	    totalAmount %= 10; // 残りの金額
	        
	    int coins5 = totalAmount / 5; // 5円玉の枚数
	    totalAmount %= 5; // 残りの金額
	        
	    int coins1 = totalAmount; // 1円玉の枚数（残りがそのまま枚数になる）

	    System.out.println("500円玉: " + coins500 + "枚");
	      System.out.println("100円玉: " + coins100 + "枚");
	      System.out.println("10円玉: " + coins10 + "枚");
	      System.out.println("5円玉: " + coins5 + "枚");
	      System.out.println("1円玉: " + coins1 + "枚");
	    }

	
{
	   int len = 9;
	   
	   for(int i=0;i<len;i++) {
		   String str = "";
		   for(int j=o; j<len;j++) {
			   
			   if(i+j==8 || i==j || i==4 || j==4) {
				   str =str + i + "" + j + "¥t";
				    
			   } else {
			       str = str + "¥t";
			   }
		   }
			   //abc
		   System.out.println(str);
	   }
	
    }
}
