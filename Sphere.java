/**Student Name: First Last
*Date Completed: 09/26/2022
*Project No. and Page No. in the book: Chapter 5
*Extra Credit: No
*Project Description: Create a sphere class consisting of methods that are capable of doing necessary calculations when called to, to obtain the volume and surface area of a sphere.
**/

package spherecreation;

public class Sphere {
	
	//creating necessary instance variables to use in later program
	private double diameter;
	private double volume;
	private double surfaceArea;

	//creation of constructor that can accept double parameters
	public Sphere(double i)
	{
		diameter = i;
		volume = i;
		surfaceArea = i;
	}

	//constructor that accepts nothing
	public Sphere()
	{	
	}
	
	public void setDiameter(double i) // method to be able to set the diameter of a sphere
	{
		diameter = i;
	}
	
	public double getDiameter() // method to retrieve the sphere's diameter value
	{
		return diameter;
	}
	
	public double calcVolume(double i) //method to calculate the volume of a sphere
	{
		volume = (4/3) * Math.PI * Math.pow((i/2), 3);
		return volume;
	}
	
	public void setVolume(double i) //method to set volume
	{
		volume = i;
	}
	
	public double getVolume() //method to retrieve the value in volume
	{
		return volume;
	}
	
	public double calcSurfaceArea(double i) //method to calculate the surface area of a sphere
	{
		surfaceArea = 4 * Math.PI * Math.pow((i/2), 2);
		return surfaceArea;
	}
	
	public void setSurfaceArea(double i) //method to set the surface area 
	{
		surfaceArea = i;
	}
	
	public double getSurfaceArea() //method to retrieve surface area
	{
		return surfaceArea;
	}
	
	public String toString() //to string method to concatenate the instance variables 
	{
		return "This is the diameter: " + diameter
				+ "\nThis is the volume: " + volume
				+ "\nThis is the surface area " + surfaceArea;
	}
	
}
