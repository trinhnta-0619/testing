package HinhHoc;

public class HinhChuNhat extends HinhHoc {
	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
	}
	
	public HinhChuNhat(float a, float b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	public float chuvi(float a, float b) {
		// TODO Auto-generated method stub
		return super.chuvi(a, b);
	}
	
	public float dientich(float a, float b) {
		// TODO Auto-generated method stub
		return super.dientich(a, b);
	}
	@Override
	public void Display() {
		System.out.println("Hinh chu nhat co canh a = " +a +", b = "+b);
		System.out.println("------Chu vi hinh chu nhat la: "+ chuvi(a,b));
		System.out.println("------Dien tich hinh chu nhat la: "+ dientich(a,b));
	}

}
