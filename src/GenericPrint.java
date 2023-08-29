
public class GenericPrint <T extends Number> {
	T value;
	
	public GenericPrint(T value) {
		this.value = value;
	}
	
	public void print() {
		System.out.println(value);
	}
	
	public void showType() {
		System.out.println("Data type: " + value.getClass().getName());
	}
	
	// wild card
	public boolean absolutelyEquals(GenericPrint<? extends Number> obj) {
		return Math.abs(this.value.doubleValue()) == Math.abs(obj.value.doubleValue());
	}

}
