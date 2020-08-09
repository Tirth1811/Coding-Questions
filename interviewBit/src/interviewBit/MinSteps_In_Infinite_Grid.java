package interviewBit;
//You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. 
//You start from the first point.
public class MinSteps_In_Infinite_Grid {
	public static int coverPoints(int[] A, int[] B) {
		int step = 0;
		for(int i =0;i<A.length-1;i++) {
			int x = Math.abs(A[i]-A[i+1]);
			int y = Math.abs(B[i]-B[i+1]);
			step+= Math.max(x, y);
		}
		return step;
    }
	public static void main(String[] args) {
		int[] A = {0, 1, 1};
		int[] B = {0, 1, 2};
		System.out.println(coverPoints(A,B));
		
	}
}
