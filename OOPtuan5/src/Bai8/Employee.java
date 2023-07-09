package Bai8;

public class Employee extends Person{
	private double heSoLuong;
	
	public Employee() {
	}

	public Employee(String name, String diaChi, double heSoLuong) {
		super(name, diaChi);
		this.heSoLuong=heSoLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public void tinhLuong() {

	}
	
	
}
