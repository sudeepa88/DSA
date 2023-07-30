package container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WaterContainer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int containers[]= {1,8,6,2,5,4,8,3,7};
		System.out.println(largeArea(containers)+" ");
	}
	
	public static int largeArea(int[] height) {
		int li=0; int maxArea=0;
		int n=height.length-1; 
		int i=0;
			while( i<n) {	
			 if(height[n]<=height[i]) {
					li=height[n]*(n-i);
					maxArea=maximumArea(maxArea,li);
					n=n-1;
				}
				else {
					li=height[i]*(n-i);
					maxArea=maximumArea(maxArea,li);
					i++;
				}
			 
			}
		return maxArea;
	}
	
	private static int maximumArea(int a, int b) {
		if(a>b) {
			a=a;
			b=0;
		}
		else {
			a=b;
			b=0;
		}
		
		return a;
	}

}
