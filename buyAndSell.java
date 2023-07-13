package stockPrice;

public class buyAndSell {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prices[]= {15,7,2,4,12,6,16,9};
		lowestPrice(prices);
		indexOfLowestPrice(prices);
		highestPriceRemaining(prices);
		maxProfit(prices);
		
		

	}
	
	
	public static int lowestPrice(int[] arr) {
		int i=0;
		int n=0;
	    int lowestElement=arr[i];
		for(i=0;i<arr.length-1;i++) {
			if(lowestElement>arr[i+1]) {
				lowestElement=arr[i+1];
				 
				 
			}else {
				lowestElement=lowestElement;
				
			    }
			
		}
		
		return lowestElement;
		
		
	}
	
	
	
	public static int indexOfLowestPrice(int[] arr) {
		int k=lowestPrice(arr);
		int n=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
			  n=i;
				
			}
		}
		return n;
	}
	
	public static int highestPriceRemaining(int[]arr) {
		int k=indexOfLowestPrice(arr)+1;
		int highest=0;
		for(int i=k;i<arr.length;i++) {
			if(highest<arr[i]) {
				highest=arr[i];
			}
		}
		
		
		return highest;
	}
	
	
	
	public static void maxProfit(int[] arr) {
		int maxProfit=highestPriceRemaining(arr)-lowestPrice(arr);
		System.out.println("Highest profit will be "+ maxProfit );
	}
	

}
