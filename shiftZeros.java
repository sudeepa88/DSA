package Question2;

public class shiftZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,8,1,4,0,2};
		int count=0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count+=1;
			}
		}
		
		System.out.println(count);
		display(arr);
		System.out.println();
		for(int i=0;i<count;i++) {
			shiftZeros(arr);
		    display(arr);
		    System.out.println();
		}
		
		

	}
	
	public static void display(int[] brr) {
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}
	}
	
	public static void shiftZeros(int[]brr) {
		for(int i=0;i<brr.length-1;i++) {
			if(brr[i]==0) {
				int temp=brr[i];
				brr[i]=brr[i+1];
				brr[i+1]=temp;
				
			}
		}
	}

}
