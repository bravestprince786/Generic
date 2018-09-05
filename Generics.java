package generics;
import java.util.*;
class A implements Comparable<A>
{
	int id;
	String name;
	double sal;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public int compareTo(A o) {
		A obj1=(A)o;
		if(this.getSal()>obj1.getSal())
		{
			return 1;
		}
		else if(this.getSal()<obj1.getSal())
		
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
public class Generics {

	public static void main(String[] args) {
		ArrayList <A> al=new ArrayList<A>();
		Scanner sc=new Scanner(System.in);
		A e;
		for(int i=0;i<=2;i++)
		{
			System.out.println(" Enter the information :");
			e=new A();
			e.setId(sc.nextInt());
			e.setName(sc.next());
			e.setSal(sc.nextDouble());
			al.add(e);
		}
		System.out.println("===============Before sorting========");
		System.out.println("id\tname\tsalary");
		for(A obj:al)
		{
			System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getSal());
		}
		Collections.sort(al);
		System.out.println("============After the sorting ===============");
		System.out.println("id\tname\tsalary");
		for(A obj:al)
		{
			System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getSal());
		}

	}

}
