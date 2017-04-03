package challenges;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		
		MovieChallenge movie=new MovieChallenge();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Movie Name: ");
		movie.setMovieName(input.next());
		System.out.println("Enter Rating(G,PG,PG-13,R): ");
		movie.setMovieRating(input.next());
		System.out.println("Enter Year: ");
		movie.setYear(input.nextInt());
		System.out.println("Enter Run Time(minutes): ");
		movie.setRunTime(input.nextInt());
		
		System.out.println(movie.toString());
		input.close();
	}
}
