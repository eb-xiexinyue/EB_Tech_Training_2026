package co.jp.chapter03;

public class JavaHomework03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓
		//D, 60以下︓E」
		
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		if(a>90)
			System.out.println("A");
		else if(a>=80)
			System.out.println("B");
		else if(a>=70)
			System.out.println("C");
		else if(a>=60)
			System.out.println("D");
		else
			System.out.println("E");
		
		//質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０
		//円のコイン数をもとめください。
		
		int total = 3340;
		int count_1=0;
		int count_5=0;
		int count_10=0;
		int count_100=0;
		int count_500=0;
		
		while(total>0) {
			if(total>=500) {
				total -= 500;
				count_500++;
				continue;
			}
			if(total>=100) {
				total -= 100;
				count_100++;
				continue;
			}
			if(total>=10) {
				total -= 10;
				count_10++;
				continue;
			}
			if(total>=5) {
				total -= 5;
				count_5++;
				continue;
			}
			if(total>=1) {
				total -= 1;
				count_1++;
				continue;
			}
		}
		System.out.println("3340円のコイン数は："+(count_500+count_100+count_10+count_5+count_1));
		
		System.out.println("500のコイン数は："+count_500);
		System.out.println("100のコイン数は："+count_100);
		System.out.println("10のコイン数は："+count_10);
		System.out.println("5のコイン数は："+count_5);
		System.out.println("1のコイン数は："+count_1);
		
		
		//質問３：ターゲットのパッタンをアウトプットします
		int len = 9;
		
		for(int i=0;i<len;i++) {
			String str = "";
			for(int j=0;j<len;j++) {
				if(i+j==4 || i+j==12 || i==j+4 || j==i+4)
					str = str + i + j;
				str = str + "\t";
			}
			System.out.println(str);
		}
	}

}
