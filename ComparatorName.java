package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class Emp1 implements Comparator<Emp1>
{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compare(Emp1 obj1, Emp1 obj2) {
	Emp1 ol=(Emp1)obj1;
	Emp1 ol1=(Emp1)obj2;
	 return ol.getName().compareTo(ol1.getName());
	}
}
public class ComparatorName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Emp1> al=new ArrayList<Emp1>();
		Emp1 e;
		for(int i=0;i<=2;i++)
		{
			System.out.println("=====enter info======");
			e=new Emp1();
			e.setId(sc.nextInt());
			e.setName(sc.next());
			al.add(e);
		}
		System.out.println("============before sorting==============");
		System.out.println("Id\tname");
		
		Emp1 emp11;
		for(Iterator itr=al.iterator();itr.hasNext();)
		{
			 emp11=(Emp1)itr.next();
			System.out.println(emp11.getId()+"\t"+emp11.getName());
		}
		Collections.sort( al,new Emp1());
		
		System.out.println("===================after sorting===============");
		Emp1 emp12;
		System.out.println("Id\tname");
		for(Iterator itr=al.iterator();itr.hasNext();)
		{
			 emp12=(Emp1)itr.next();
			System.out.println(emp12.getId()+"\t"+emp12.getName());
		}
	}

}
