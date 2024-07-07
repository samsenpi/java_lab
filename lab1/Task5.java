class Task5 {
   

      public static void main(String[] args){

         int s=999;
         int rem,rem2,quo;  
         int sum; 

         System.out.println("The armstrong number in range(0,"+s+"):");

         for(int i=0;i<s;i++){

            rem=i%10;
            quo=i/10;
            if(i>=100&&i<999){

               rem2=quo%10;
               quo=quo/10;
               sum=(int)(Math.pow(rem, 3)+Math.pow(rem2, 3)+Math.pow(quo, 3));
            }else{


               sum=(int)(Math.pow(rem, 3)+Math.pow(quo, 3));
            }
            if(i==sum)
            {

               System.out.print(sum+",");

            }




            }


      }


}
