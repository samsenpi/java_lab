import java.util.*;

class Words{

	String name;
	String meaning;

	Words(){

	 name="";
 	meaning="";
	}
	Words(String n,String m){

	 name=n;
 	meaning=m;
	}
	public void setName(String n){

	 name=n;
 	
	}
	public void setMeaning(String m){

	meaning=m;;
 	
	}public String getName(){

	return name;

	}
	public String getMeaning(){

	return meaning;

	}
}
 class Dictionary{

	HashMap<String,String> map=new HashMap<>();

Dictionary(){

	map.put("","");



}
Dictionary(String name,String mean){

	map.put(name,mean);



}
public void insertRecord(String n,String m){

	map.put(n,m);


}
public void  find(String word){

	String m; 
	
	if(map.containsKey(word))
	{
		m=map.get(word);
		System.out.println("The Meaning of"+""+word+" is :"+m);

	}else{

	System.out.println("The Meaning of"+" "+word+" is not found");


	}

}





}

public class Driver{

	public static void main(String[] args)
	{

		String name,mean;
		Scanner str =new Scanner(System.in);
		Scanner in =new Scanner(System.in);
		int choice;
		 Dictionary obj= new Dictionary();

		while(true){
			
			System.out.println("1. Insert new REcord \n"+" "+"2. Find String \n"+"3. Exit");
	
			choice=in.nextInt();

		switch(choice){

			case 1:
			{	
				System.out.print("Enter record name:");
				name=str.nextLine();
				str.nextLine();
				System.out.println("Enter  meaning :");
				mean=str.nextLine();
				
				
				obj.insertRecord(name,mean);
				
				break;
	
			}
			case 2:
			{	System.out.println("Enter word you want to find:");
				name=str.nextLine();
				
				obj.find(name);
				
				break;
			}
			
			case 3:
			{
				System.exit(0);
				}
		
		}


		}
	}

} 
