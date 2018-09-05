package generics;
import java.util.*;
class Employee implements Comparable<Employee>
{
	int depttNo;
	String project;
	String name;
	public int getDepttNo() {
		return depttNo;
	}
	public void setDepttNo(int depttNo) {
		this.depttNo = depttNo;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee e) {
		//Employee obj=(Employee)e;
		return this.getName().compareTo(e.getName());	
	}

}
public class SortByName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee>al=new ArrayList<>();
		Employee emp = null;
		for(int i=0;i<=2;i++) {
			emp=new Employee();
			System.out.println("enter the info :");
			emp.setDepttNo(sc.nextInt());
			emp.setName(sc.next());
			emp.setProject(sc.next());
			al.add(emp);}
		System.out.println("============before sorting============");
		
		System.out.println("depttNo\tname\tproject");
		Employee emp1;
		for(Iterator itr=al.iterator();itr.hasNext();)
		{
			 emp1=(Employee)itr.next();
			System.out.println(emp1.getDepttNo()+"\t"+emp1.getName()+"\t"+emp1.getProject());
		}
		Collections.sort(al);
		Employee emp2;
		System.out.println("===================after sorting===============");
		System.out.println("depttNo\tname\tproject");
		for(Iterator itr=al.iterator();itr.hasNext();)
		{
			emp2=(Employee)itr.next();
			System.out.println(emp2.getDepttNo()+"\t"+emp2.getName()+"\t"+emp2.getProject());
		}
	}

}
