package reflections;

             //any modifier here is just for demonstration of capabilities of reflections and may be against rules.

public class Person {

	private final  String NAME;
	private String id;
	
	
	public Person(String nAME, String id) {
		super();
		NAME = nAME;
		this.id = id;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNAME() {
		return NAME;
	}
	
	
	public void shout() {
		System.out.println("aaaaaaaaaaaaaaaaaa"+NAME);
	}
	private static void run() {
		System.out.println("ruuuuuuuuuuuuuuuuun, forest run");          
	}
	
}
