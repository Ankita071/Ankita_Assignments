package assignment03;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

class DateClass{
	int date,month,year;

	@SuppressWarnings("deprecation")
	public DateClass(Date d) {
		date=d.getDate();
		month=d.getMonth()+1;
		year=d.getYear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		result = prime * result + month;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateClass other = (DateClass) obj;
		if (date != other.date)
			return false;
		if (month != other.month)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DateClass [date=" + date + ", month=" + month + ", year=" + year + "]";
	}	
}

public class Answer4 {
	private static Map<DateClass,String> hashmap=new HashMap<>();

	public static void add(DateClass key,String value) {
		Set<DateClass> keySet = hashmap.keySet();
		boolean flag=false;
		for (DateClass dateClass : keySet) {
			if(dateClass.equals(key)==true) {
				flag=true;
				break;
			}

		}
		if(flag==false) {
			hashmap.put(key, value);
		}
		else {
			System.out.println("Cannot insert the given date");
		}
	}
	public static void view() {
		Set<Entry<DateClass, String>> entrySet = hashmap.entrySet();
		for (Entry<DateClass, String> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue() );
		}
	}

	public static void main(String[] args) throws Exception {


		Date d = new SimpleDateFormat("dd/MM/yyyy").parse("17/11/1997");
		DateClass k1=new DateClass(d);
		Answer4.add(k1, "A");

		d=new SimpleDateFormat("dd/MM/yyyy").parse("04/01/1999");
		DateClass k2=new DateClass(d);
		Answer4.add(k2, "B");

		d=new SimpleDateFormat("dd/MM/yyyy").parse("17/11/1999");
		DateClass k3=new DateClass(d);
		Answer4.add(k3, "C");

		Answer4.view();

	}

}