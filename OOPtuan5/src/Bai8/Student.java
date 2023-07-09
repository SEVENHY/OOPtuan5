package Bai8;

public class Student extends Person{
	private double diem1;
	private double diem2;
	
	public Student() {
	}

	public Student(String name, String diaChi, double diem1, double diem2) {
		super(name, diaChi);
		this.diem1=diem1;
		this.diem2=diem2;
	}

	public double getDiem1() {
		return diem1;
	}

	public void setDiem1(double diem1) {
		this.diem1 = diem1;
	}

	public double getDiem2() {
		return diem2;
	}

	public void setDiem2(double diem2) {
		this.diem2 = diem2;
	}
	public double diemTB() {
		return (diem1+diem2)/2;
	}
	public void danhGia() {
//		if(diem1<5 || diem2<5)
//				System.out.println("thi lai");
//		else if(diem1>5 && diem2>5 && diemTB()<6.5)
//			System.out.println("thi tot nghiep");
//		else 
//			System.out.println("lam luan van");
		if(diem1>5 && diem2>5) {
			if(diemTB()>6.5)
				System.out.println("lam luan van");
			else
				System.out.println("thi tot nghiep");
			
		}
		else 
			System.out.println("thi lai");
	}
	
	@Override
	public String toString() {
		String s=super.toString()+diemTB();
		return s;
	}
}
