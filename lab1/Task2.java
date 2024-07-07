 class Task2 {
 
   public static void main(String[] args){



      int n1=10,n2=20;

      
   for(int i=0;i<n1;i++){

         for(int j=0;j<n2;j++){

            if(i==0&&j==n2/2){

               System.out.print("^");
            }else if((i==1)&&j==n2/2){

               System.out.print("!");
            }
            else if((i>1&&i<=5)&&(j>=3&&j<n2-3)){
                  System.out.print("*");
            }
            else if(i>5){
                  System.out.print("*");

               }
               else{
                  
                  System.out.print(" ");

               }
           
         }
         System.out.println("");

   }

   }


}
