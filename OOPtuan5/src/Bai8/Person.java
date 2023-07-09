package Bai8;

public abstract class Person {
	private String name;
	private String diaChi;
	
	public Person() {
	}

	public Person(String name, String diaChi) {
		this.name = name;
		this.diaChi = diaChi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
