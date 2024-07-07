import java.util.*;

class Health{


	String name;
	double weight, height , bmi;
	
Health(){

name="";
weight=height=0.0;

bmi=(weight/height);


}
Health(String n,double w,double h,double b){

	name=n;
	weight=w;
	height=h;

	bmi=(weight/height);

}
@Override
public String toString(){

	return "name:"+name+"\nWeight: "+weight+"\nheight:"+height+"\n BMI"+bmi;

}






}
 public class Driver{
		
		
		Health [] person;
		int size;

public  void Save(String n,double w,double h,int i){

	if (person[i]!=null) {
    
			try{
			throw new  indexOccupiedException();
			}catch(indexOccupiedException e){

				System.out.println(e.getMessage());
			}

	}else{
			person[i]=new Health();
			person[i].name=n;	
			person[i].weight=w;
			person[i].height=h;
			person[i].bmi=person[i].weight/person[i].height;


	}
	
	

} public void Retrieve(int i){

	
	if(i>size&&i<0){
	
		try{
			throw new indexException();
		}catch(indexException ex){
	
		System.out.println(ex);

		}
	
	}else{

		System.out.println("name:"+person[i].name+"\nWeight: "+person[i].weight+"\nheight:"+person[i].height+"\n BMI"+person[i].bmi);

		}
	
	
}

	public static void main(String args [])
	{
		Driver obj= new Driver();
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		
		obj.size=in.nextInt();
		

		if(obj.size<0){
	
			try{
				throw new NegativeArraySizeException(obj.size);		
			
			
			
			  }catch(NegativeArraySizeException e){

				System.out.print("Exception"+e);			

				}
			
			}else{


				obj.person=new Health[obj.size];
			}
			
			System.out.println("\nEnter the the index of array you want to add data:");
		
			int i=in.nextInt();

			obj.Save("Sameen",50,5,i);
			obj.Retrieve(i);

		
	}		
}
class NegativeArraySizeException extends Exception{

int i;

NegativeArraySizeException(){

i=0;
}
NegativeArraySizeException( int index){

i=index;
} 
public String toString()
    {
        return "negative value index of array " + i;
    }


}
class indexOccupiedException extends Exception {




int in;

indexOccupiedException(){


in=0;
}
indexOccupiedException(int index){


in=index;
}

public String toString()
    {
        return " index of array  is already occupied" + in;
    }






}class indexException extends Exception {

int i;
indexException (){


i=0;
}
indexException (int index){


i=index;
}

public String toString()
    {
        return " index of array  is not " + i;
    }






}