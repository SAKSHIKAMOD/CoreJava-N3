package org.tnsif.hierarchicalinheritance;

public class AndroidVesion {
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AndroidVesion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AndroidVesion(String type) {
		super();
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + "]";
	}
	
}
