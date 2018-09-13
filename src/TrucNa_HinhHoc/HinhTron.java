package HinhHoc;

public class HinhTron {
	private float r;
	public HinhTron(float r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	
	public float chuvi(float r) {
		// TODO Auto-generated method stub
		return (float) (3.14*r*2);
	}

	public float dientich(float r) {
		// TODO Auto-generated method stub
		return (float) (3.14*r*r);
	}

	public void Display() {
		System.out.println("Hinh chu vi co r = "+r);
		System.out.println("------Chu vi hinh tron la: "+chuvi(r));;
		System.out.println("------Dien tich hinh tron la: "+dientich(r));
	}
}
