package co.jp.chapter07;

public class Math {
	
	public static int max(int[] input) {
		int res = -99999999;
		for(int i:input) 
			if(i>res)
				res = i;
		return res;
	}
	
	public static int min(int[] input) {
		int res = 99999999;
		for(int i:input) 
			if(i<res)
				res = i;
		return res;
	}
	
	public static int average(int[] input) {
		int res = 0;
		for(int i:input)
			res += i;
		
		res /= input.length;
		
		return res;
	}

}
