package assignment04;

import java.util.ArrayList;
import java.util.List;

public class Answer8 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(3);
		list.add(34);
		list.add(98);
		list.add(88);
		
		
		Thread thread=new Thread(()->{
			list.forEach(System.out::println);
		});
		thread.start();
	}
}
