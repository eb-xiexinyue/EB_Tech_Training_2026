package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = new int[5];
		int[] arr1 = new int[] {1,2,3,4,5};
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr1));
		
		boolean[] bArr = new boolean[5];
		float[] fArr = new float[5];
		char[] cArr = new char[5];
		
		String[] sArr = new String[5];
		Object[] oArr = new Object[5];
		
//		System.out.println(Arrays.toString(bArr));
//		System.out.println(Arrays.toString(fArr));
//		System.out.println(Arrays.toString(cArr));
//		System.out.println(Arrays.toString(sArr));
//		System.out.println(Arrays.toString(oArr));
		
		char[] chArr = {'a','c','e','g'};
		
//		System.out.println(chArr.length);
		
//		for(int i=0;i<chArr.length;i++){
//			System.out.println(chArr[i]);
//		}
		
//		for(char ch : chArr){
//			System.out.println(ch);
//		}
//		
//		chArr[0] = 'f';
		
//		System.out.println(Arrays.toString(chArr));
		
//		chArr[0] = 'z';
//		chArr[1] = 'y';
//		chArr[2] = 'x';
//		chArr[3] = 'w';
//		
//		System.out.println(Arrays.toString(chArr));
		
//		chArr = new char[] {'z','y','x','w'};
//		System.out.println(Arrays.toString(chArr));
////		
////		chArr = new char[] {'z','y','x'};
////		System.out.println(Arrays.toString(chArr));
//		
//		char[] cpArr = Arrays.copyOf(chArr, 5);
//		System.out.println("cpArr: "+Arrays.toString(cpArr));
//		
//		char[] cpArr2 = Arrays.copyOfRange(chArr, 2, 5);
//		System.out.println("cpArr2: "+Arrays.toString(cpArr2));
//		
//		char[] cpArr3 = new char[2];
//		for(int i=1;i<cpArr3.length+1;i++) {
//			cpArr3[i-1] = chArr[i];
//		}
//		System.out.println("cpArr3: "+Arrays.toString(cpArr3));
		
		
		int[][] arr2d = new int[][] {
			{1,2,3},
			{4,5},
			{6,7,8,9}
		}; 
		
//		System.out.println(Arrays.toString(arr2d[0]));
//		System.out.println(Arrays.toString(arr2d[1]));
		
//		for(int i=0;i<arr2d.length;i++) {
//			//System.out.println(Arrays.toString(arr2d[i]));
//			for(int j=0;j<arr2d[i].length;j++){
//				System.out.println(arr2d[i][j]);
//			}
//		}
		
//		for(int[] outEl : arr2d) {
//			for(int innerEl : outEl){
//				System.out.println(innerEl);
//			}
//		}
		
		arr2d[0] = new int[]{6,7,8,9};
		//arr2d[0][1] = 5;
		
		for(int[] outEl : arr2d) {
			for(int innerEl : outEl){
				System.out.println(innerEl);
			}
		}
		
		int[][][][][] arr5d = new int[5][][][][];
		
		
	}

}
