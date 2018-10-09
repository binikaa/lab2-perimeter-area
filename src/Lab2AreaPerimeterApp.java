import java.util.Scanner;

public class Lab2AreaPerimeterApp {

	public static void main(String[] args) {
		String input;
		do {
			
		
		Scanner scr= new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		System.out.println("Enter Length: ");
		double length= scr.nextDouble();
		
		System.out.println("Enter Width: ");
		double Width= scr.nextDouble();
		
		System.out.println("Enter Heigth");
		double Height= scr.nextDouble();
		
		double area = length * Width;
		System.out.println("Area: "+ area);
	
		
		double perimeter = 2*(length + Width);
		System.out.println("Perimeter: " + perimeter);
		//printf("%d",perimeter);
		double volume= length * Height* Width;
		System.out.println("Volume: "+ volume);
		System.out.println("Continue?(y/n)");
		Scanner scr1= new Scanner(System.in);
				
		 input = scr1.nextLine();
			if(scr1.equals("n")|| scr1.equals("N"))
			{
	
				System.exit(0);
			}
		}
		while(input.equals("y") || input.equals("Y"));
		
		// TODO Auto-generated method stub

	}

}
