/**Student Name: First Last
*Date Completed: 09/26/2022
*Project No. and Page No. in the book: Chapter 5
*Extra Credit: No
*Project Description: Create a driver class that can create objects from the sphere class we've created while also running all of the methods we've created in the sphere class
**/

package spherecreation;

public class MultiSphere {
	
	public static void main(String[] args)
	{
		//creation of sphere objects
		Sphere sphere1 = new Sphere();
		Sphere sphere2 = new Sphere();
		Sphere sphere3 = new Sphere();
		
		sphere1.setDiameter(6); //setting sphere 1 diameter to a value
		sphere1.setVolume(sphere1.calcVolume(6)); //using set volume and calculate volume methods
		sphere1.setSurfaceArea(sphere1.calcSurfaceArea(6)); //using set surface area and calculate surface area methods
		
		sphere2.setDiameter(20);
		sphere2.setVolume(sphere2.calcVolume(20));
		sphere2.setSurfaceArea(sphere2.calcSurfaceArea(20));
		
		sphere3.setDiameter(5.2);
		sphere3.setVolume(sphere3.calcVolume(5.2));
		sphere3.setSurfaceArea(sphere3.calcSurfaceArea(5.2));
		
		// printing out sphere results
		System.out.println("Sphere 1: \n" + sphere1); 
		System.out.println();
		System.out.println("Sphere 2: \n" + sphere2);
		System.out.println();
		System.out.println("Sphere 3: \n" + sphere3);
		System.out.println();
		
		//changing sphere objects value except sphere 3 to check continuinity 
		sphere1.setDiameter(12);
		sphere1.setVolume(sphere1.calcVolume(12));
		sphere1.setSurfaceArea(sphere1.calcSurfaceArea(12));
		
		sphere2.setDiameter(2.7);
		sphere2.setVolume(sphere1.calcVolume(2.7));
		sphere2.setSurfaceArea(sphere1.calcSurfaceArea(2.7));
		
		sphere3.setDiameter(5.2);
		sphere3.setVolume(sphere3.calcVolume(5.2));
		sphere3.setSurfaceArea(sphere3.calcSurfaceArea(5.2));
		
		//displaying results of change
		System.out.println("Sphere 1's diameter has changed to: " + sphere1.getDiameter()); // using get diameter method to retrieve and display the changed value in the sphere objects
		System.out.println("Sphere 2's diameter has changed to: " + sphere2.getDiameter());
		System.out.println("Sphere 3's diameter not changed: " + sphere3.getDiameter());
		System.out.println();
		System.out.println("Sphere 1: \n" + sphere1);
		System.out.println();
		System.out.println("Sphere 2: \n" + sphere2);
		System.out.println();
		System.out.println("Sphere 3: \n" + sphere3);
	
		
		
		
		
		
		
		
	}
}
