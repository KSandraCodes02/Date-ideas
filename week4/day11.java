package week4;

import java.util.Scanner;

public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kay = new Scanner(System.in);

	/// indoor 
		String dinner =" out to eat $100";
		String movies = "movies $20";
		String museum = "museum FREE";
		String home= "";
		///OUTDOOR
		String park= "park FREE";
		String picnic = "picnic $30";
		String gocarting = "go carting $50";
		
		int budget = 10;

		System.out.println("What is your name");
		home = kay.next();
		System.out.println("Hello " + home);
		
	
		

		System.out.println("How much do u want to typically want to spend on this date " + home);
		budget = kay.nextInt();

		System.out.println("Do you and yor partner like to be indoors or outdoors " + home);
		home = kay.next();

if(home.equalsIgnoreCase("indoors")&& budget<=100) {
	System.out.println(movies);
	System.out.println(dinner);
	System.out.println(museum);
}
if(home.equalsIgnoreCase("indoors")&& budget>=100) {
	System.out.println(movies);
	System.out.println(dinner);
	System.out.println(museum);
}

if(home.equalsIgnoreCase("outdoors")&& budget<=100) {
	System.out.println(park);
	System.out.println(picnic);
	System.out.println(gocarting);
}

if(home.equalsIgnoreCase("outdoors")&& budget>=100) {
	System.out.println(park);
	System.out.println(picnic);
	System.out.println(gocarting);
}
		System.out.println("goodbye");

		kay.close();

	}

}
