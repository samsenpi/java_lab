import java.io.*; 

 class ReadFile implements Runnable{ 
 String filename; 
 
 // param constructor 
public ReadFile(String fn) 
{ 
	filename = fn; 
} 
// overriding run method 
// this method contains the code for file reading 
// Read and print data line by line with the fileName 
public void run ( ) 
{ 
	try{
		String token ;
		FileReader f= new FileReader(filename);
		BufferedReader b=new BufferedReader(f);

	 	while((token= b.readLine()) != null) { 
           	
			System.out.println(filename+" : "+token); 
           	} 	
           b.close();


	}catch (IOException e) {

            System.out.println("IOException:");
            e.printStackTrace();

        }

	
	

} 
} // end of class 
 
public class Driver{ 
	public static void main (String args[]) 
	{ 
	// create ReadFile objects by passing file names to them 

	ReadFile obj1=new ReadFile("text1.txt");
	ReadFile obj2=new ReadFile("text2.txt");
		

	// create and start multiple threads (at least two)

	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
		
	t1.start();
	t2.start();

	
 	/*try
 	{
 	   Thread.sleep(10000);
	}
 	catch(InterruptedException e)
	 {
 		System.out.println("Main interrupted " + e.getMessage());
	 }
*/

	 }
} 