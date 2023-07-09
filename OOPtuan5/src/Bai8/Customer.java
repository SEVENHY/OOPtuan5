package Bai8;

public class Customer extends Person{
	private String tenCT;
	private double triGia;
	private String danhGia;
	
	public Customer() {
	}

	public Customer(String tenCT, double triGia, String danhGia) {
		this.tenCT = tenCT;
		this.triGia = triGia;
		this.danhGia = danhGia;
	}

	public String getTenCT() {
		return tenCT;
	}

	public void setTenCT(String tenCT) {
		this.tenCT = tenCT;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}
	

}
