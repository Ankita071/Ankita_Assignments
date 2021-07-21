package assignment04;

import java.util.ArrayList;
import java.util.List;

public class Answer4 {
	public static void main(String[] args) {
		List<Game> game = new ArrayList<>();
		game.add(new Game("Basketball"));
		game.add(new Game("FootBall")); 
		game.add(new Game("Cricket"));
		game.add(new Game("BaseBall"));
		game.add(new Game("Chess"));
		game.add(new Game("Carom"));
		game.add(new Game("Hockey"));

		System.out.println("Removing odd length games : ");


		game.removeIf(a->a.getName().length()%2!=0);
		game.forEach(System.out::println);
	}
}

class Game {
	String name;

	public Game(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + "]";
	}	
	
}
