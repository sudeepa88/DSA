package Arrray2;

public class ZeroSSS {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brr[][]= {{0,2,0},
			      {4,8,8},
			      {2,6,9}};
		int n=brr.length;
		int m=brr[0].length;//row
		
		display(brr,n,m);
		System.out.println();
		setZeros(brr,n,m);
		display(brr,n,m);

	}
	
	
	public static void setZeros(int arr[][],int n, int m) {
		int answer[][]=new int [n][m];//temporary array 
		///answer er sobkota element 1 a shift korlam
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				answer[i][j]=1;
			}
		}
		
		//sei row er sobkota element 0 korlam
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==0) {
					for(int k=0;k<m;k++) {
						answer[i][k]=0;
					}
				}
			}
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==0) {
					for(int k=0;k<m;k++) {
						answer[k][j]=0;
					}
				}
			}
		}
		
		
		///displaying the duplicate matrix to see that if it is working or not 
		
		
		for(int i=0;i<n;i++) {
			System.out.println();
			for(int j=0;j<m;j++) {
				System.out.print(answer[i][j]+"");
			}
		}
		
		System.out.println();
		System.out.println();
		
		//abr main matrix upadation
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(answer[i][j]==0) {
					arr[i][j]=0;
				}
			}
		}
		
		
		
	}
	
	
	public static void display(int arr[][],int m,int n ) {
		   int i,j;
		  
		   for(i=0;i<n;i++) {
			   System.out.println();
			   for(j=0;j<m;j++) {
				   System.out.print(arr[i][j]+" ");
			   }
		   }
		   
	   }
	
  
}
