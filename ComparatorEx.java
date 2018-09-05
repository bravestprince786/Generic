package generics;
import java.util.*;
class Emp implements Comparator<Emp>
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
	public int compare(Emp obj1, Emp obj2) {
	Emp i1=(Emp)obj1;
	Emp i2=(Emp)obj2;
	if(i1.getId()<i2.getId())
	{
		return -1;
	}
	else if(i1.getId()>i2.getId())
	{
		return 1;
	}
	else
	{
		return 0;
	}
	
	}
}
public class ComparatorEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Emp> al=new ArrayList<Emp>();
		Emp e;
		for(int i=0;i<=2;i++)
		{
			System.out.println("=====enter info======");
			e=new Emp();
			e.setId(sc.nextInt());
			e.setName(sc.next());
			al.add(e);
		}
		System.out.println("============before sorting==============");
		System.out.println("Id\tname");
		
		Emp emp1;
		for(Iterator itr=al.iterator();itr.hasNext();)
		{
			 emp1=(Emp)itr.next();
			System.out.println(emp1.getId()+"\t"+emp1.getName());
		}
		Collections.sort( al,new Emp());
		
		System.out.println("===================after sorting===============");
		Emp emp2;
		System.out.println("Id\tname");
		for(Iterator itr=al.iterator();itr.hasNext();)
		{
			 emp2=(Emp)itr.next();
			System.out.println(emp2.getId()+"\t"+emp2.getName());
		}
	}

}
