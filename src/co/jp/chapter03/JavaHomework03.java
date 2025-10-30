package co.jp.chapter03;

public class JavaHomework03 {

	public static void main(String[] args) {
		
		//
		int len = 9;
		for(int i=0;i<len;i++) {
			String str="";
			for(int j=0;j<len;j++) {
				if(i + j==4||i+j==12||i==1&&j==5||i==2&&j==6||i==3&&j==7||i==5&&j==1||i==6&&j==2||i==7&&j==3) {
					str=str+i+j;
				}
				str=str+"\t";
			}
			System.out.println(str);
			}

		
		//質問1
		int a = 56;
		System.out.println("\n成績ランキング判断。入力値="+a);
		
		if(a>=90) {
			System.out.println("A");
		}else if(a>=80) {
			System.out.println("B");
		}else if(a>=70) {
			System.out.println("C");
		}else if(a>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	
        //質問2
        int all = 3340;
        System.out.println("\n合計金額:"+all+"円");
        
        int coin500 = all/500;
        all = all % 500;
        
        int coin100 = all / 100;
        all = all % 100;

        int coin10 = all / 10;
        all = all % 10;

        int coin5 = all / 5;
        all = all % 5;

        int coin1 = all;

        System.out.println("500円: " + coin500 + "枚");
        System.out.println("100円: " + coin100 + "枚");
        System.out.println("10円: " + coin10 + "枚");
        System.out.println("5円: " + coin5 + "枚");
        System.out.println("1円: " + coin1 + "枚");
	}
}


        
     