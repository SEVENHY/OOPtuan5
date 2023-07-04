package Bai6;
import java.time.LocalDate;
public class KiemTraHD {
	public static void main(String[] args) {
		DanhSachHoaDon ds=new DanhSachHoaDon();
		HoaDon gio1=new Gio("1",LocalDate.of(2023, 12, 24),"Nam","hd5",20000,15);
		HoaDon gio2=new Gio("2",LocalDate.of(2023, 12, 22),"Na","hd25",200002,315);
		HoaDon ngay1=new Ngay("3",LocalDate.of(20, 12, 30),"Hoa","23h",30000,18);
		ds.themHD(ngay1);
		ds.themHD(gio1);
		ds.themHD(gio2);
		
		System.out.println(ds.thongkeSoLuongHDTheoGio());
		System.out.println(ds.thongkeSoLuongHDTheoNgay());
	}
}
