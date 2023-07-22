package duplicate3;

public class duplicacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brr[]= {-1,0,0,0,0,3,3};
		int u=stillCounting(brr);
		System.out.println(u+" ");

	}
      public static int stillCounting(int[] nums) {
    	  int i=0;int j=0;int count=0;
    	  int k=nums.length;
    	  int temp[]=new int[k];
    	  
    	 
    	  
    	  while(j<k) {
    		  temp[j]=nums[j];
    		  j++; count++;
    		  for(i=0;i<k-1;i++) {
    			  if(nums[i]!=nums[i+1]) {
    				  count++;
    				  temp[j]=nums[i+1];
    				  j++;
    				  
    			  }
    			  
    		  }
    		  break;
    	  }
    	 for(i=0;i<k;i++) {
    		 nums[i]=temp[i];
    		 System.out.print(nums[i]+" ");
    	 }
    	 System.out.println();
    	
    	return count;
    	
    	  
    	  
    	  
      }
}
