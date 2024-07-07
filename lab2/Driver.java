
import java.util.*;



 class Student {
   

   private String roll,name,email,address;

   Student(){

      roll=name=email=address="";

   }
   Student(String r,String nam,String mail,String add){

      roll=r;
      name=nam;
      email=mail;
      address=add;


   }
   Student(Student obj){
      roll=obj.roll;
      name=obj.name;
      email=obj.email;
      address=obj.address;


   }
   public void setStudent(String r,String nam,String mail,String add)
   {
      roll=r;
      name=nam;
      email=mail;
      address=add;

   }
   public String getRollNo() {
      return roll;
  }

  public String getName() {
      return name;
  }

  public String getEmail() {
      return email;
  }

  public String getAddress() {
      return address;
  }

   public void inputData(){

      Scanner in =new Scanner(System.in);
       //String r,n,e,a;

       System.out.println("Enter roll number:");
       roll=in.nextLine();
       
       System.out.println("Enter name:");
       name=in.nextLine();
       
       System.out.println("Enter email:");
       email=in.nextLine();
       
       System.out.println("Enter address:");
       address=in.nextLine();
       
       //setStudent(r, n, e, a);

   }public void showData(){

      System.out.println("Name:"+this.name);
      System.out.println("roll no.:"+this.roll);
      System.out.println("Email:"+this.email);
      System.out.println("Address:"+this.address);

   }


 


}

public class Driver {
    public static void main(String[] args) {
        

        Student[] students = new Student[1];

        
       
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].inputData();
        }

        
        System.out.println("\nDetails of all students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i].showData();
        }
    }
}
