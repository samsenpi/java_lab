
 abstract class Hwork{

	private  int data=5;
 Hwork(){
	


}
public abstract void fun();

public void show(){


	System.out.println(data);
}




}
public class Mymainclass extends Hwork{


public void fun(){

System.out.println("this is overrided fun");

}

public static void main(String args[]){
	
	Hwork h= new Mymainclass();
	h.fun();
	h.show();
}


}