
import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		Movie movieObj = new Movie();
		
		Scanner movie = new Scanner(System.in);
		
		//MovieDriver movieThing = new MovieDriver();

		char yn;
		do {
		String skip = movie.nextLine();	
			
		System.out.println("Enter the name of a movie ");
		String movieTitle = movie.nextLine();
		movieObj.setTitle(movieTitle);
		
		System.out.println("Enter the rating of the movie ");
		String movieRating = movie.nextLine();
		movieObj.setRating(movieRating);
		
		System.out.println("Enter the number of tickets sold for this movie ");
		int numOfTicketsSold = movie.nextInt();
		movieObj.setSoldTickets(numOfTicketsSold);
		
		 System.out.println(movieObj.toString());
		
		System.out.println("Do you want to enter another? (y or n)");
		 yn = movie.next().charAt(0);
		 
	
		}
		while (yn == 'y');
		
		System.out.println("Goodbye");
		
		/*if (yn == "y") {
			System.out.println("Enter the name of a movie ");
			 movieTitle = movie.nextLine();
			movieObj.setTitle(movieTitle);
			
			System.out.println("Enter the rating of the movie ");
			 movieRating = movie.nextLine();
			movieObj.setRating(movieRating);
			
			System.out.println("Enter the number of tickets sold for this movie ");
			 numOfTicketsSold = movie.nextInt();
			movieObj.setSoldTickets(numOfTicketsSold);
			System.out.println(movieObj.toString());
			
		}
		else {
			System.out.println("Goodbye");
		}*/
		
		
		
	}
}
