package assignment03;

import java.util.ArrayList;
import java.util.ListIterator;

class Movie_details{
	private String movieName;
	private String actor;
	private String actress;
	private String genre;
	public Movie_details(String movieName, String actor, String actress, String genre) {
		super();
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
		this.genre = genre;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie_details [movieName=" + movieName + ", actor=" + actor + ", actress=" + actress + ", genre="
				+ genre + "]";
	}
	
	
}

class Movie_DetailsList{
	private static ArrayList<Movie_details> list=new ArrayList<>();
	public static void add_movie(Movie_details m) {
		list.add(m);		
	}
	public static void remove_movie(Movie_details m) {
		list.remove(m);		
	}
	public static void remove_AllMovies() {
		list.clear();
	}
	public static ArrayList<Movie_details> find_movie_By_mov_Name(String name) {
		
		ArrayList<Movie_details> result=new ArrayList<>();
		boolean flag=false;
		Movie_details m=null;
		
		ListIterator<Movie_details> iter=list.listIterator();
		
		while(iter.hasNext()) {
			m=iter.next();
			if(m.getMovieName().equals(name)) {
				flag=true;
				result.add(m);
			}
		}
		
		if(flag==false)
			return null;
		else
			return result;
	}
	
	public static ArrayList<Movie_details> find_movie_By_Genre(String genre) {
		
		ArrayList<Movie_details> result=new ArrayList<>();
		boolean flag=false;
		Movie_details m=null;
		
		ListIterator<Movie_details> iter=list.listIterator();
		
		while(iter.hasNext()) {
			m=iter.next();
			if(m.getGenre().equals(genre)) {
				flag=true;
				result.add(m);
			}
		}
		
		if(flag==false)
			return null;
		else
			return result;
	}
	
	public static void sort(String field) {
		switch (field) {
		case "mov_Name":
			list.sort((o1, o2)
                    -> o1.getMovieName().compareTo(
                        o2.getMovieName()));
			break;
		case "genre":
			list.sort((o1, o2)
                    -> o1.getGenre().compareTo(
                        o2.getGenre()));
			break;
		case "lead_actor":
			list.sort((o1, o2)
                    -> o1.getActor().compareTo(
                        o2.getActress()));
			break;
		case "lead_actress":
			list.sort((o1, o2)
                    -> o1.getActress().compareTo(
                        o2.getActress()));
			break;
		default:
			System.out.println("Invalid");
		}
	}
	public static void view_list() {
		for (Movie_details movie_details : list) {
			System.out.println(movie_details);
		}
	}
}

public class Answer10 {
	public static void main(String[] args) {
		
	}
}
