package Collection;
class Add_type<T1>
{
	private T1 t;

	public T1 getT() {
		return t;
	}

	public void setT(T1 t) {
		this.t = t;
	}
	
}


public class GenericEx {

	public static void main(String[] args) {
		Add_type<Integer> obj=new Add_type<>();
		
		obj.setT(123);
		obj.setT(1);
		System.out.println(obj.getT()+obj.getT());
	}

}
