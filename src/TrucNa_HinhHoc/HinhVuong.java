package HinhHoc;

public class HinhVuong extends HinhHoc {
	public HinhVuong(float a) {
		// TODO Auto-generated constructor stub
		this.a = a;
	}
	
	public float chuvi(float a) {
		// TODO Auto-generated method stub
		return a*4;
	}

	public float dientich(float a) {
		// TODO Auto-generated method stub
		return a*2;
	}
	
	@Override
	public void Display() {
		System.out.println("Hinh vuong co canh = "+a);
		System.out.println("------Chu vi hinh vuong la: "+chuvi(a));;
		System.out.println("------Dien tich hinh vuong la: "+dientich(a));
	}
}
