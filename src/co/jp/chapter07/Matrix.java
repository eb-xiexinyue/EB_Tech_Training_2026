package co.jp.chapter07;

public class Matrix {
	private final int[][] data;
	
	public Matrix(int[][] data) {
		this.data = data;
	}
	
	public Matrix add(Matrix b) {
		int r1,r2;
		int c1,c2;
		
		r1 = this.data.length;
		r2 = b.data.length;
		
		c1 = this.data[0].length;
		c2 = b.data[0].length;
		
		if(r1!=r2 || c1!= c2) {
			System.out.println("The 2 matrix have different rows or columns, cannot be added.");
			return new Matrix(new int[][] {});
		}
		
		int[][] res = new int[r1][c1];
		for(int i =0;i<r1;i++)
			for(int j=0;j<c1;j++)
				res[i][j] = this.data[i][j] + b.data[i][j];
		
		return new Matrix(res);
	}
}
