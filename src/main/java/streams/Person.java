package streams;


public class Person {
	private String name;
	private Gender gender;
	private int age;
	
	
	public Person(String name, Gender gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age=age;
		
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
