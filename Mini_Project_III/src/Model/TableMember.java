package Model;

import java.util.ArrayList;

public interface TableMember
{
	public String getAttribute(int n);		//Returns the value of a specific attribute.
	public ArrayList<String> getAttributes();		//Returns the value of all attributes as an ArrayList of Strings.
	public String getAttributeName(int n);		//Returns the name of a specific attribute.
	public ArrayList<String> getAttributeNames();		//Returns the name of all attributes as an ArrayList of Strings.
}
