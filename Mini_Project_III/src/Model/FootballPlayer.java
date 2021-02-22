package Model;

import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember
{
		private int number;
		private String position;
		private ArrayList<String> listSub= new ArrayList<String>();
		private ArrayList<String> listVal= new ArrayList<String>();
		
		//Default Constructor of FootballPlayer class
		
		public FootballPlayer()
		{
			super();
			number=0;
			position="";
			
			//Creating the ArrayList listSub
			
			listSub.add("Name");
			listSub.add("Height");
			listSub.add("Weight");
			listSub.add("HomeTown");
			listSub.add("HighSchool");
			listSub.add("Number");
			listSub.add("Position");
		}
		
		//Parameterized Constructor of FootballPlayer class
		
		public FootballPlayer(int number, String position,String name, Height height, int weight, String homeTown, String highSchool)
		{
			super(name,height,weight,homeTown,highSchool);
			this.number = number;
			this.position = position;
			
			//Creating the ArrayList listSub
			
			listSub.add("Name");
			listSub.add("Height");
			listSub.add("Weight");
			listSub.add("HomeTown");
			listSub.add("HighSchool");
			listSub.add("Number");
			listSub.add("Position");
			
			//Creating the ArrayList listVal
			
			listVal.add(name);
			listVal.add(height.toString());
			listVal.add(String.valueOf(weight));
			listVal.add(homeTown);
			listVal.add(highSchool);
			listVal.add(String.valueOf(number));
			listVal.add(position);
		}
		
		/*
		 * Getters and Setters
		 */
		
		public int getNumber()
		{
			return number;
		}

		public void setNumber(int number)
		{
			this.number = number;
		}

		public String getPosition()
		{
			return position;
		}

		public void setPosition(String position)
		{
			this.position = position;
		}	

		public ArrayList<String> getListSub()
		{
			return listSub;
		}

		public void setListSub(ArrayList<String> listSub)
		{
			this.listSub = listSub;
		}

		public ArrayList<String> getListVal()
		{
			return listVal;
		}

		public void setListVal(ArrayList<String> listVal)
		{
			this.listVal = listVal;
		}
		
		@Override
		public String toString()
		{
			return "number= " + number + ", position= " + position + super.toString();
		}
		
		/*
		 * Defining the abstract methods of the implemented interface
		 */
		 
		 public String getAttribute(int n)
		 {
			 return listVal.get(n);
		 }
		 public ArrayList<String> getAttributes()
		{
				return listSub;
		}
		 public String getAttributeName(int n)
		{
			 return listSub.get(n);	
		}
		public ArrayList<String> getAttributeNames()
		{
				return listVal;
		}
}

