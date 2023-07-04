package Bai6;

import java.time.LocalDate;

public class Ngay extends HoaDon{
	private int soNgay;
	
	public Ngay() {
	}
	
	public Ngay(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, int soNgay) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soNgay=soNgay;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	@Override
	double tinhThanhTien() {
		double tien=0;
		if(getSoNgay()>7)
			tien=7*getDonGia()+(getSoNgay()-7)*getDonGia()*80/100;
		else 
			tien=getDonGia()*getSoNgay();
		return tien;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
