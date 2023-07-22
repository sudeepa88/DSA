package medium_array2;

public class Finally_done_noTLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int brr[]= {4,5,0,-2,-3,1};
		int y=5;
		int b=no_TLE(brr,y);
		System.out.println(b+" ");

	}
	
	public static int no_TLE(int[] nums,int k) {
		int count = 0;
	    int runningSum = 0;
	    int[] remainderCounts = new int[k];

	    for (int i = 0; i < nums.length; i++) {
	        runningSum += nums[i];

	        int remainder = ((runningSum % k) + k) % k;
	        count += remainderCounts[remainder];
	        if (remainder == 0)
	            count++; // Include the subarrays whose sum is divisible by k starting from index 0.

	        remainderCounts[remainder]++;
	    }

	    return count;
	}

}
