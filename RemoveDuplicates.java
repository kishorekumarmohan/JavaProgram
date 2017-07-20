package testJava;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void rmdp(int[] num){
		
		for(int i=0;i<=num.length;i++){
			System.out.println("Arrays with dp:"+num[i]);
			int nouniqueele=num.length;
			for(int j=i+1;j<=num.length;j++)
				
			{
				if(num[i]==num[j]){
					num[j]=num[num[i-1]];
					
					
					nouniqueele--;
					j--;
					
				}
			}
			
		
		int[] arraywithoutdp=Arrays.copyOf(num, nouniqueele);
		for(int i1=0;i1<=arraywithoutdp.length;i1++){
			System.out.println("arrays without duplicates:"+arraywithoutdp[i1]);
		}
		}
		
	}
	public static void main(String[] args) {
		
		int[] num={2,3,3,3,5,5,6,6,7};
RemoveDuplicates.rmdp(num);
	}

}
