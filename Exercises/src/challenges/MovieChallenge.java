package challenges;

public class MovieChallenge {
	private String movieName;
	private String movieRating;
	private int year;
	private int runTime;
	
	public MovieChallenge(){	
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
	public String toString(){
		return ("Movie Name: " + getMovieName() + 
							"\nMovie Rating: " + getMovieRating() + 
							"\nMovie Year: " + getYear() +
							"\nMovie Rating: " + getRunTime());
	}
}
