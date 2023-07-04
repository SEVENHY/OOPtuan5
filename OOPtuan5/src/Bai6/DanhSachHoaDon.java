package Bai6;
import java.util.ArrayList;
import java.util.List;
public class DanhSachHoaDon {
	private List<HoaDon> ds;
	
	public DanhSachHoaDon() {
		this.ds=new ArrayList<HoaDon>();
	}
	
	public boolean themHD(HoaDon e) {
		int dem=0;
		for (HoaDon hoaDon : ds) {
			if(hoaDon.getMaHD().equals(e.getMaHD()))
				dem++;
		}
		if(dem==0) {
			this.ds.add(e);
			return true;
		}
		return false;
	}
	
	public void xuatDS() {
		for (HoaDon hoaDon : ds) {
			System.out.println(hoaDon);
		}
	}
	
	public int thongkeSoLuongHDTheoGio() {
		int soLuong=0;
		for (HoaDon hoaDon : ds) {
			if(hoaDon instanceof Gio)
				soLuong++;
		}
		return soLuong;
	}
	
	public int thongkeSoLuongHDTheoNgay() {
		int soLuong=0;
		for (HoaDon hoaDon : ds) {
			if(hoaDon instanceof Ngay)
				soLuong++;
		}
		return soLuong;
	}
	
	public double tinhTongThanhTien(int thang, int nam) {
		double tien=0;
		for (HoaDon hoaDon : ds) {
			tien+=hoaDon.tinhThanhTien();
		}
		return tien;
	}
}
