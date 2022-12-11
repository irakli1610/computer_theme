package computerTheme;

public  class User {
	//----fields
	private String name;
	private String password;
	
	
	//--constructors
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
		
	}
	public User() {}
	
	
	//---getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

	
	
	
}
