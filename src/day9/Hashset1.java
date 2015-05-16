package day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hashset1 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Selenium");
		l.add("QTP");
		l.add("Selenium");
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("#############");
		Set<String>s=new HashSet<>();
		s.add("Selenium");
		s.add("QTP");
		s.add("LR");
		s.add("Jmeter");
		System.out.println(s.size());
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
	}
}

