import javax.swing.*;
import java.util.*;
class Calculator{

	private int num1,num2;
	
	
	//default constructor
	
	Calculator(){
		
		num1=num2=0;
		

	}	
	// parameterized constructor

	Calculator(int n1,int n2){
		
		num1=n1;
		num2=n2;
	}			
		//sum ,mul,sub,div funnctions

	public int sum(){

		return num1+num2;

	}
	
	public int sub(){

		
		return num1-num2;

	}
	public int mul(){

		return num1*num2;

	}	
	public int div(){

		return num1/num2;

	}
	
	public static void main(String[] args)
	{
		String num1,num2,operator;
		int v1,v2;		
			//take input from user
		do{
			num1=JOptionPane.showInputDialog("Please Enter 1st number:");
			
			//convert String to int

			v1=Integer.valueOf(num1);
		
		}while(v1<0 );

			//take input from user
		do{
			num2=JOptionPane.showInputDialog("Please Enter 2nd number:");
			
			//convert String to int

			v2=Integer.valueOf(num2);		
		
		}while(v2<0 );
		
		
		//operator=JOptionPane.showInputDialog("what operation do you want to perfome");		
		Scanner in=new Scanner(System.in);		

		System.out.println("what operation do you want to perform:");
		operator=in.nextLine();
	
		//create an obj of calculator

		Calculator obj= new Calculator(v1,v2);
		
		// switch 		

		switch(operator){

			//sum			

			case"sum":
			System.out.println("the sum of "+num1+" ,"+num2+" = " + obj.sum() );
			break;
			case"+":
			System.out.println("the sum of "+num1+" ,"+num2+" = " + obj.sum() );
			break;
			
			//subtract
			
			case"sub":
			System.out.println("the subtract of "+num1+" ,"+num2+" = " + obj.sub() );
			break;
			case"-":
			System.out.println("the subtract of "+num1+" ,"+num2+" = " + obj.sub() );
			break;
			case"subtract":
			System.out.println("the subtract of "+num1+" ,"+num2+" = " + obj.sub());
			break;

			// Multiply:
	
			case"mul":
			System.out.println("the multiplication of "+num1+" ,"+num2+" = "+ obj.mul());
			break;
			case"multiply":
			System.out.println("the multiplication of "+num1+" ,"+num2+" = "+ obj.mul() );
			break;
			case"*":
			System.out.println("the multiplication of "+num1+" ,"+num2+" = "+ obj.mul() );
			break;
			
			// Division:

			case"div":
			System.out.println("the division of "+num1+" ,"+num2+" = "+ obj.div()  );
			break;
			case"division":
			System.out.println("the division of "+num1+" ,"+num2+" = "+ obj.div()  );
			break;
			case"/":
			System.out.println("the division of "+num1+" ,"+num2+" = "+ obj.div() );
			break;


			}

	}
		
}