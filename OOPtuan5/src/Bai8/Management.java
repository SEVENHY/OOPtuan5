package Bai8;

import java.util.ArrayList;
import java.util.List;

public class Management {
	private List<Person> ds;
	public Management() {
		this.ds=new ArrayList<Person>();
	}
	public void them(Person e) {
		this.ds.add(e);
	}
	public void xoa(String name) {
		for (Person person : ds) {
			if(person.getName()==name)
				this.ds.remove(person);
		}
	}
	public void xuat() {
	}
}
