package Model;

public class Model
{
	//Declaring three objects of FootballPlayer class


	FootballPlayer f1;
	FootballPlayer f2;
	FootballPlayer f3;

	//Default constructor of Model class 

	public Model()
	{
		/*
				 Creating objects of FootballPlayer class using the parameterized constructor		 
		 */


		FootballPlayer fp =new FootballPlayer(9,"Defence","Anwesha",new Height(5,4),54,"Kolkata","NGHSS");
				System.out.println(fp.getAttributes().toString());
				System.out.println(fp.getAttributes().toString()); 
				
				
				for (int i = 0; i < fp.getAttributes().size(); i++)
				{ 
					System.out.println(i+"="+fp.getAttributeName(i) +"-"+fp.getAttribute(i));
				} 
				
				System.out.println(fp.getAttributeNames().toString());
				System.out.println(fp.getAttributeNames().toString());
	}
}
