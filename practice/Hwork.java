
 abstract class Hwork{

	private int data;
Hwork(int d){
	
data=d;

}
private  void fun(){


	System.out.println("this is a private fun in abstract class"+data);
}





}
public Mymainclass extend Hwork(){

public static void main(String args[]){
	Hwork v1= new Mymainclass();
	Mymainclass v2= new Mymainclass();
	
	v1.fun();
	v2.fun();

}


}