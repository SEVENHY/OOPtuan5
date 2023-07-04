package Bai6;

import java.time.LocalDate;

public abstract class HoaDon {
	private String maHD;
	private LocalDate ngayHD;
	private String tenKH;
	private String maPhong; 
	private double donGia;
	
	public HoaDon() {
	}

	public HoaDon(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia) {
		this.maHD = maHD;
		this.ngayHD = ngayHD;
		this.tenKH = tenKH;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public LocalDate getNgayHD() {
		return ngayHD;
	}

	public void setNgayHD(LocalDate ngayHD) {
		this.ngayHD = ngayHD;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	abstract double tinhThanhTien();
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
