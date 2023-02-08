package org.tnsif.multilevelinheritance;
//child class 1
public class Android extends Nokia {
	
	private String version;
	public void accept()
	{
		System.out.println("The Android Version Name Is : "+version);
	}
	
	//getters and setters
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public Android() {
		super();
		
	}

	//parameterized constructor
	public Android(String version) {
		super();
		this.version = version;
	}
	
	
}
