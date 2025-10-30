package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//
		int len = 9;
				
		for(int i=0;i<len;i++) {
			String str = "";
			for(int j=0;j<len;j++) {
				if(i+j== 4 || i+j==12 || j-i==4 || i-j==4) {
					str = str + i + j;
				}
				str = str + "\t";
			}
			System.out.println(str);
		}
		
	}

}
