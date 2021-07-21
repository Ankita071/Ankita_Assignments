package assignment05;

import java.util.LinkedList;
import java.util.List;

public class Answer_Transaction {

	public static void main(String[] args) {
		List<Transaction> transactionList=new LinkedList<Transaction>();
		
		transactionList.add(new Transaction(new Trader("Ankita", "Bokaro"), 2012, 600));
		transactionList.add(new Transaction(new Trader("B", "Ranchi"), 2012, 600));
		transactionList.add(new Transaction(new Trader("E", "Delhi"), 2013, 300));
		transactionList.add(new Transaction(new Trader("D", "Pune"), 2011, 400));
		transactionList.add(new Transaction(new Trader("A", "Mumbai"), 2015, 700));
		transactionList.add(new Transaction(new Trader("J", "Indore"), 2011, 600));
		transactionList.add(new Transaction(new Trader("G", "Delhi"), 2014, 300));
		transactionList.add(new Transaction(new Trader("F", "Pune"), 2011, 200));
		transactionList.add(new Transaction(new Trader("C", "Bangalore"), 2012, 900));
		transactionList.add(new Transaction(new Trader("I", "Indore"), 2013, 200));
		
		System.out.println("Transactions  in  the  year  2011  and  sort  them  by  value  (small  to high) :");
		
		transactionList.stream()
		.filter(a->a.getYear()==2011)
		.sorted((o1,o2)->o1.getValue()-o2.getValue())
		.forEach(System.out::println);
		
		System.out.println("Print all transaction values from the traders living in Delhi :");
		
		transactionList.stream()
		.filter(a->a.getTrader().getCity().equalsIgnoreCase("delhi"))
		.forEach(a->System.out.println(a.getValue()));
		
		System.out.println("Highest value of all transactions :");
		
		Transaction transaction = transactionList.stream()
				.max((o1,o2)->o1.getValue()-o2.getValue())
				.get();
		
		System.out.println(transaction.getValue());
		
		System.out.println("Least value of all transactions :");
		
		transaction = transactionList.stream()
				.min((o1,o2)->o1.getValue()-o2.getValue())
				.get();
				
		System.out.println(transaction.getValue());
	}

}
