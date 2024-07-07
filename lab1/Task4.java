 class Task4 {

   public static void main(String [] args){

     int totalCustomer= 12467;
     double  eDrinkCustomer=0.14;  
     double  citrusflavoredCustomer=0.64;  

    int numEDrinkCustomer,numCitrusflavoredCustomer;
      numEDrinkCustomer=(int)(totalCustomer*eDrinkCustomer);
      numCitrusflavoredCustomer=(int)(totalCustomer*citrusflavoredCustomer);

      System.out.println("Number of customer who purchase one or more energy drinks per week = "+numEDrinkCustomer);
      System.out.println("Number of customer who prefer citrus flavored energy drinks = "+numCitrusflavoredCustomer);
   }
   


}
