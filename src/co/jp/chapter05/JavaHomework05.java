package co.jp.chapter05;

public class JavaHomework05 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。  public static void main(String[] args);
		//修飾⼦ public  返却型　void  関数名　main　　引数　引数の型 String[] 名称　args
			
		//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
		int[] array = {0,1,2,3,4,5};
		System.out.println(max(array));
		System.out.println(min(array));
		System.out.println(sum(array));
		
		//質問３．以下メソッドの実施結果を教えてください。
		String x = null;
		sayHello(x);
		System.out.println(x);
		
		//質問４︓以下メソッドの実施結果を教えてください。
		String[] array1 = new String[]{"value1"};
		fillArray(array1);
		System.out.println(array1[0]);
		
		//質問５︓以下メソッドの実施結果を教えてください。
		String[] array2 = null;
		fillArray2(array2);
		System.out.println(array2 == null);
		
		//質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
		String[] array3 = {"Hello ","EB"};
		printArray(array3);
		
		//質問６-１︓以下静的なメソッドを定義してください。
		//		1. メソッド名: megerArray
		//		2. 引数１︓intの配列 left
		//		3. 引数２︓intの配列 right
		//		4. 戻り値︓intの配列
		//		5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
		int[] result1 = megerArray(left, right);
		for(int i:result1)
			System.out.println(i);
		
		//質問６-２︓以下静的なメソッドを定義してください。
		//		1. メソッド名: subArray
		//		2. 引数１︓intの配列 array
		//		3. 引数２︓開始のstartIndex
		//		4. 引数３︓⻑さlength
		//		5. 戻り値︓intの配列
		//		6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
		int[] array4 = new int[] {1, 2, 3, 4};
		int[] result2 = subArray(array4,1,2);
		for(int i:result2)
			System.out.println(i);
		
		//質問７︓以下静的なメソッドを定義してください。
		//		1. メソッド名︓trim
		//		2. 引数１︓charの配列
		//		3. 戻り値︓charの配列
		//		4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
		char[] input = new char[] {' ',' ','A','b',' ',' ','C',' '};
		char[] result3 = trim(input);
		
		//質問８︓バブルソート⽤メソッドを作成してください。
		//		1. メソッド名︓bubbleSort
		//		2. 引数１︓intの配列
		//		3. 戻り値︓ソート済みの配列
		//		4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
		int[] array5 = new int[] {2,5,6,1,4,7,8,9,0,3};
		int[] result4 = bubbleSort(array5);
		for(int i:result4)	
			System.out.println(i);
		
		//質問９︓メソッドの呼び出す練習。
		//		1. 質問６-１を⽤い、２つ配列をマージします。
		//		2. 質問８を⽤い、ステップ１のマージした配列をソートする。
		//		3. 注意︓コードを１⾏にしてください。
		int[] result5 = bubbleSort(megerArray(new int[] {3,5,7,1}, new int[] {2,8,4,6}));
		for(int i:result5)	
			System.out.println(i);
	}
	
	
	
	
	
	
	public static int max(int[] datas) {
		int max = -99999999;
		for(int data: datas) {
			if(data> max)
				max = data;
		}
		return max;
	}
	
	public static int min(int[] datas) {
		int min = 99999999;
		for(int data: datas) {
			if(data< min)
				min = data;
		}
		return min;
	}
	
	public static int sum(int[] datas) {
		int sum = 0;
		for(int data: datas) {
			sum += data;
		}
		return sum;
	}
	
	private static void sayHello(String y) {
		y = "Hello world";
	}
	private static void fillArray(String[] array) {
		array[0] = "value2";
	}
	
	private static void fillArray2(String[] array) {
		array = new String[]{"1", "2"};
	}
	
	public static void printArray(Object[] objs) {
		if(objs == null) {
		System.out.println("null");
		return;
		}
		String prefix =
		"";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Object obj : objs) {
		sb.append(prefix);
		sb.append(String.valueOf(obj));
		prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	
	public static int[] subArray(int[] array, int startindex, int length) {
		if(array.length < startindex + length) {
			System.out.println("illegal startindex and length");
			return new int[] {};
		}
		
		int[] res = new int[length];
		for(int i=0; i<length;i++) {
			res[i] = array[startindex+i];
		}
		return res;
	}
	
	public static int[] megerArray(int[] left, int[] right) {
		int[] res = new int[left.length+right.length];
		for(int i=0;i<left.length;i++)
			res[i] = left[i];
		for(int i=0;i<right.length;i++)
			res[left.length+i] = right[i];
		
		return res;
	}
	
	public static char[] trim(char[] input) {
		
		int startindex = 0;
		int endindex = input.length - 1;
		
		while(input[startindex]==' ') startindex++;
		while(input[endindex]==' ') endindex--;
		
		char[] res = new char[endindex - startindex + 1];
		for(int i=0; i<=endindex-startindex;i++)
			res[i] = input[i+startindex];
		
		return res;
		}
			
	public static int[] bubbleSort(int[] array) {
		int[] res = array.clone();
		
		for(int i=0;i<res.length - 1;i++)
			for(int j=0;j<res.length- 1 - i;j++) {
				int temp = 0;
				if(res[j]<res[j+1]) {
					temp = res[j];
					res[j] = res[j+1];
					res[j+1] = temp;
				}
			}
		return res;
	}
}


