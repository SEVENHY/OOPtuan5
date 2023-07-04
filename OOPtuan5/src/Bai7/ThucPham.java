package Bai7;

import java.time.LocalDate;

public class ThucPham extends HangHoa{
	private String nhaCungCap;
	private LocalDate ngayHH;
	private LocalDate ngaySX;
	
	public ThucPham() {
	}
	public ThucPham(String maHang, String tenHang, double donGia, int soLuong, String nhaCungCap, LocalDate ngayHH, LocalDate ngaySX) {
		super(maHang, tenHang, donGia, soLuong);
		this.ngayHH=ngayHH;
		this.ngaySX=ngaySX;
		this.nhaCungCap=nhaCungCap;
	}
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public LocalDate getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(LocalDate ngayHH) {
		this.ngayHH = ngayHH;
	}
	public LocalDate getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}
	@Override
	public String toString() {
		return "ThucPham [nhaCungCap=" + nhaCungCap + ", ngayHH=" + ngayHH + ", ngaySX=" + ngaySX + "]";
	}
	
	
}
