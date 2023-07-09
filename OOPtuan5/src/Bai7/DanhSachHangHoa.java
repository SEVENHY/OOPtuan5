package Bai7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DanhSachHangHoa {
	private List<HangHoa> ds;
	
	public DanhSachHangHoa() {
		this.ds=new ArrayList<HangHoa>();
	}
	
	public void themHH(HangHoa e) {
		this.ds.add(e);
	}
	
	public void xuat() {
		for (HangHoa hangHoa : ds) {
			System.out.println(hangHoa.toString());
		}
	}
	
	public void xuatTungLoai() {
		System.out.println("Danh sach hang hoa thuc pham: ");
		for (HangHoa hangHoa : ds) {
			if(hangHoa instanceof ThucPham)
				System.out.println(hangHoa);
		}
		System.out.println("Danh sach hang hoa dien may: ");
		for (HangHoa hangHoa : ds) {
			if(hangHoa instanceof HangDienMay)
				System.out.println(hangHoa);
		}
		System.out.println("Danh sach hang hoa sanh su: ");
		for (HangHoa hangHoa : ds) {
			if(hangHoa instanceof HangSanhSu)
				System.out.println(hangHoa);
		}
	}
	
	public void timHang(String n) {
		for (HangHoa hangHoa : ds) {
			if(hangHoa.getMaHang().equals(n))
				System.out.println(n.toString());
		}
	}
	
//	public void sapXepTen() {
//		
//	}
//	
//	public void sapXepSoLuong() {
//		
//	}
	
	public void xuatKhoBan() {
		for (HangHoa hangHoa : ds) {
			if(hangHoa instanceof ThucPham && hangHoa.getSoLuong()>0 && ((ThucPham)hangHoa).getNgayHH().isBefore(LocalDate.now()))
				System.out.println(hangHoa.toString());
		}
	}
}
