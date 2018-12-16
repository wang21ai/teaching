package charts;

import java.util.ArrayList;

public class DeptPerson {
	private String name;
	private ArrayList<Integer> data = new ArrayList<>();
	public DeptPerson() {
		// TODO Auto-generated constructor stub
	}
	
	
	public DeptPerson(String name, ArrayList<Integer> data) {
		super();
		this.name = name;
		this.data = data;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getData() {
		return data;
	}

	public void setData(ArrayList<Integer> data) {
		this.data = data;
	}
	
	
}
