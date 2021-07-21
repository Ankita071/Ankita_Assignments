package assignment03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Thread1 extends Thread{
	public List<Integer> list;
	public Thread1(List<Integer> l) {
		list=l;
	}
	public void run()
    {
        try {
             list.add(71);
        }
        catch (Exception e) {
            System.out.println("Exception caught" + e);
        }
    }
}
class Thread2 extends Thread{
	public List<Integer> list;
	public Thread2(List<Integer> l) {
		list=l;
	}
	public void run()
    {
		try {
            list.add(8);
       }
       catch (Exception e) {
           System.out.println("Exception caught" + e);
       }
    }
}

public class Answer8 {
public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new CopyOnWriteArrayList<>();
		
		list1.add(11);
		list1.add(21);
		list1.add(36);
		list1.add(45);
		
		list2.add(23);
		list2.add(34);
		list2.add(43);
		list2.add(64);
		try {
			
			Iterator<Integer> iterator = list1.iterator();
			
			new Thread1(list1).start();
			
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Iterator<Integer> iterator2 = list2.iterator();
			new Thread2(list2).start();
			
			while (iterator2.hasNext()) {
				System.out.println(iterator2.next());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("List 1 : "+list1);
		System.out.println("List 2 : "+list2);
		
	}
}
