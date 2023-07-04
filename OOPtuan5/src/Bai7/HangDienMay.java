package Bai7;

public class HangDienMay extends HangHoa{
	private int thoiGianBH;
	private int congSuat;
	
	public HangDienMay() {
	}

	public HangDienMay(String maHang, String tenHang, double donGia, int soLuong, int thoiGianBH, int congSuat) {
		super(maHang, tenHang, donGia, soLuong);
		this.thoiGianBH = thoiGianBH;
		this.congSuat = congSuat;
	}

	public int getThoiGianBH() {
		return thoiGianBH;
	}

	public void setThoiGianBH(int thoiGianBH) {
		this.thoiGianBH = thoiGianBH;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
