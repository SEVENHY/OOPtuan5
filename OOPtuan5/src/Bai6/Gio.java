package Bai6;

import java.time.LocalDate;

public class Gio extends HoaDon{
	private int soGio;
	
	public Gio() {
	}

	public Gio(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, int soGio) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soGio=soGio;
	}


	public int getSoGio() {
		return soGio;
	}

	public void setSoGio(int soGio) {
		if(soGio>=30)
			System.out.println("Khong hop le");
		else
			this.soGio = soGio;
	}

	@Override
	double tinhThanhTien() {
		double tien=0;
		if(getSoGio()>24)
			tien=24*getDonGia();
		else 
			tien=getDonGia()*getSoGio();
		return tien;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
