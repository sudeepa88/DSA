package Q4;

public class chocoLate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int brr[]= {};
         int m=3;
         sort(brr);
         display(brr);
        
         System.out.println();
         limit(brr,m);
         
	}
	
	public static void sort(int arr[]) {
		int temp=0;
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
	}
	
	
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void limit(int arr[],int k) {
		int temp[]=new int[k];
		if(k>arr.length-1) {
			System.out.println("No packets existis.....Sorry");
		}else {
		
		int m=0;
		
		int i=0,j=m;
		while(i<k&&j<arr.length) {
			temp[i]=arr[j];
			System.out.print(temp[i]+" ");
			i++; j++;
		}
		
		
		int minElement=temp[k-1]-temp[0];
		System.out.println();
		
		System.out.println("The minimum difference is "+minElement);
		}
		
		
			}

}


  
