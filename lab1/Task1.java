
class Task1
{
    
   public static void main(String[] args){      
   
    
			int n1=7,n2=14;
			int k=0,L;
			for(int i=0;i<n1;i++)
			{
						if(i!=0)
							k=i+1;
						for(int j=0;j<n2;j++){
				
									if(i<n1/2){
														if(k>=j&&j%2!=0){
															System.out.print(" ");
														}
														else if((n2-1-k)<=j&&j%2==0){
															System.out.print(" ");
														}
														else{
															System.out.print("*");
														}
													}
									else if(i==n1/2){
									
													if(k>=j&&j%2==0){
													
														System.out.print("*");
													}
													else if((n2-1-k)<=j&&j%2!=0){
													
														System.out.print("*");
													}
													else{
													
															System.out.print(" ");
													}
									
									  }
									else{
							
												   L=n1-i;
													if(i==n1-1){											
													
													L=0;
													}
													if(L>=j&&j%2!=0){
													
														System.out.print(" ");
													}
													else if((n2-1-L)<=j&&j%2==0){
													
														System.out.print(" ");
													}
													else{
													
														System.out.print("*");
													}
										}
									
				      }
				
						 System.out.println("");
		}
		}
}