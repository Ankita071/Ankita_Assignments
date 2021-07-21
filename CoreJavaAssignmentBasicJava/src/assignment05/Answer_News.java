package assignment05;

import java.util.ArrayList;
import java.util.List;

public class Answer_News {

	public static void main(String[] args) {
		List<News> newsList = new ArrayList<>(10);

		newsList.add(new News(1001, "Ankita", "Abc", "Commenting about news"));
		newsList.add(new News(1002, "A", "Xyz", "Commenting about budget"));
		newsList.add(new News(1001, "A", "Abc", "Commenting about budget"));
		newsList.add(new News(1001, "Ankita", "Xyz", "Commenting about news"));
		newsList.add(new News(1002, "B", "Abc", "Commenting about budget"));
		newsList.add(new News(1004, "Ankita", "Abc", "Commenting budget news"));
		newsList.add(new News(1003, "A", "Abc", "Commenting about news"));
		newsList.add(new News(1004, "B", "Xyz", "Commenting budget news"));
		newsList.add(new News(1003, "Ankita", "Abc", "Commenting budget news"));
		newsList.add(new News(1005, "A", "Xyz", "Commenting about budget"));
		newsList.add(new News(1002, "Ankita", "Abc", "Commenting about news"));
		newsList.add(new News(1004, "A", "Xyz", "Commenting budget news"));
		newsList.add(new News(1003, "Ankita", "Abc", "Commenting about budget"));
		newsList.add(new News(1002, "Ankita", "Xyz", "Commenting about news"));
		newsList.add(new News(1001, "A", "Abc", "Commenting about budget"));
		newsList.add(new News(1001, "C", "Xyz", "Commenting about news"));
		newsList.add(new News(1002, "A", "Abc", "Commenting budget news"));
		newsList.add(new News(1003, "Ankita", "Xyz", "Commenting about news"));
		newsList.add(new News(1004, "Ankita", "Xyz", "Commenting budget news"));
		newsList.add(new News(1005, "C", "Xyz", "Commenting about budget"));
		newsList.add(new News(1001, "B", "Abc", "Commenting budget news"));
		newsList.add(new News(1002, "A", "Xyz", "Commenting about news"));
		newsList.add(new News(1004, "Ankita", "Xyz", "Commenting about budget"));
		
		System.out.println("newsId which has received maximum comments: ");
		
		News a = newsList.stream()
			.max((o1,o2)->o1.getComment().length()-o2.getComment().length())
			.get();
		System.out.println(a.newsId);
		
		System.out.println("No. of times the word 'budget' arrived in user comments all news.");
		
		newsList.stream()
			.filter(b -> b.getComment().contains("budget"))
			.forEach(b -> System.out.println(b));
		
		System.out.println("User who has posted maximum comments");
		
		System.out.println("CommentByUser wise number of comments");
	}
}
