import java.util.*;

class TypeCasting{

	public static void main(String[] args){
	
	String my="2";
	int num=2+Integer.valueOf(my);
	float num2=Float.valueOf(my);
	double num3=Double.valueOf(my);

	System.out.println("the string is: "+ my);
	System.out.println(" the num:" + num);
	System.out.println(" the num:" + num2);
	System.out.println(" the num:" + num3);

	}

}
// impilcit type casting:(automatically)
/*
	char<int<long<float<double
*/
//explicity:(by programmer)

//	double<float<long<int<char

//--->primitive data type:(size and type are define)

//  * int,char,double,float,bool,byte etc 
//  * start with lowercase letter

//--->Non-primitive data type:(user define)

//  *String is also a non_primitive data type 

//   *start with a uppercase letter
//   *String,Array,classes etc