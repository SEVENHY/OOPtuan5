package Bai7;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa{
	private String nhaSX;
	private LocalDate ngayNhap;
	
	public HangSanhSu() {
	}

	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuong, String nhaSX, LocalDate ngayNhap) {
		super(maHang, tenHang, donGia, soLuong);
		this.ngayNhap=ngayNhap;
		this.nhaSX=nhaSX;
	}

	public String getNhaSX() {
		return nhaSX;
	}

	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
