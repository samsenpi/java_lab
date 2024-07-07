import javax.swing.*;


class Shape{

private double area,volumn;

Shape(){

   area=volumn=0.0d;
}
Shape(double a,double v){

   area=a;
   volumn=v;

}Shape(Shape obj){

area=obj.area;
volumn=obj.volumn;

}public void getInput(){


   area=Double.valueOf(JOptionPane.showInputDialog("Enter area:"));
   volumn=Double.valueOf(JOptionPane.showInputDialog("Enter volumn:"));


}
@Override
public String toString(){

return "area:"+area+"  &volumn:"+volumn;


}


}
class Square extends Shape{

private double width,length,height;

@Override
public void getInput(){


   width=Double.valueOf(JOptionPane.showInputDialog("Enter width:"));
   length=Double.valueOf(JOptionPane.showInputDialog("Enter length:"));
   height=Double.valueOf(JOptionPane.showInputDialog("Enter height:"));


}
@Override
public String toString(){

return "width:"+width+"  &length:"+length+",height"+height+"area of squre:"+width * length+"volumn of squre:"+width * length * height;


}


}
class Sphere extends Shape{

   private double radius;
   private final double pi=3.14;
   
   @Override
   public void getInput(){
   
   
      radius=Double.valueOf(JOptionPane.showInputDialog("Enter radius:"));
      
   
   }
   @Override
   public String toString(){
   
   return "radius:"+radius+"pi:"+pi+"Area of sphere: "+4 * pi * radius * radius+"volumn  of sphere: "+(4 / 3) * pi * radius * radius * radius;
   
   
   }
   
    


}





public class Driver2 {
   

   public static void main(String[] args){

      Shape shape1 = new Shape();
      shape1.getInput();
      System.out.println("Shape 1: " + shape1);

      Square square1 = new Square();
      square1.getInput();
      System.out.println("Square 1: " + square1);

      Sphere sphere1 = new Sphere();
      sphere1.getInput();
      System.out.println("Sphere 1: " + sphere1);

   }
}
