package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
	
		int[][] arr2d = new int[][] {
			{1,2,3},
			{4,5},
			{6,7,8,9}
		};
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				System.out.println(arr2d[i][j]);
			}
		}
		
		

	}

}
