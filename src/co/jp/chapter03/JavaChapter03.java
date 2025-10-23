package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 11;
//		if(a>b) {
//			System.out.println("a>b");
//		}else if(a==b) {
//			System.out.println("a==b");
//		}else if(b==15){
//			System.out.println("b==15");
//		}else{
//			// a < b && b != 15
//			System.out.println("a<b");
//		}
		
		
//		switch(b) {
//			case 3:
//				System.out.println("b==3");
//				break;
//			case 5:
//				System.out.println("b==5");
//				break;
//			case 11:
//				System.out.println("b==11");
//				break;
//			default:
//				System.out.println("bは3,5,11以外");
//				break;
//		}
		
//		b = 3;
//		
//		switch(b) {
//		case 3:
//		case 5:
//		case 11:
//			System.out.println("bは3,または5,または11");
//			break;
//		default:
//			System.out.println("bは3,5,11以外");
//			break;
//		}
//		
//		System.out.println("------------------------------");
//		
//		if(b == 3 || b == 5 || b == 11) {
//			System.out.println("bは3,または5,または11");
//		}
//		else {
//			System.out.println("bは3,5,11以外");
//		}
		
//		for(int n=0;n<10;n++) {
//			System.out.print(n);
//		}
//		
//		int n=0;
//		
//		for(;n<10;) {
//			System.out.print(n);
//			n++;
//		}
		
//		int n=0;
//		for(;;) {
//			if(n>=10) {
//				break;
//			}
//			System.out.print(n);
//			n++;
//		}
		
//		int n=0;
//		while(n<10) {
//			System.out.print(n);
//			n++;
//		}
		
//		int n=0;
//		while(true) {
//			if(n>=10) {
//				break;
//			}
//			System.out.print(n);
//			n++;
//		}
		
//		int n=11;
//		do {
//			System.out.println(n);
//			n++;
//		}while(n<10);
//		
//		System.out.println("----------------------");
//		
//		int m=11;
//		while(m<10){
//			System.out.println(m);
//			m++;
//		}
//		
//		System.out.println("----------------------");
		
//		int n=0;
//		while(n<10) {
//			n++;
//			if(n==2) {
//				continue;
////				break;
//			}
//			System.out.println(n);
//		}
		
		int len = 9;
		
		for(int i=0;i<len;i++) {
			String str = "";
			for(int j=0;j<len;j++) {
				if(i+j==len-1 || i==j|| i==4 || j==4) {
					str = str + i + j;
				}
				str += "\t";
			}
			System.out.println(str);
		}
	}
}
