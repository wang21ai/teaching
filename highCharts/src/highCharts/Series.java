package highCharts;

import java.util.ArrayList;

public class Series {
	private String name;
	private ArrayList<Integer> data = new ArrayList<>();
	public Series() {
	}
	
	public Series(String name, ArrayList<Integer> data) {
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
