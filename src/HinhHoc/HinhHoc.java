package HinhHoc;

public abstract class HinhHoc {
	protected float a;
	protected float b;
	
	public HinhHoc() {
		
	}
	
	public HinhHoc (float a) {
		this.a = a;
	}
	
	public HinhHoc (float a, float b) {
		this.a = a;
		this.b = b;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
	
	public float chuvi (float a, float b) {
		return a*b;
	}
	
	public float dientich (float a, float b) {
		return (a+b)*2;
	}
	
	public abstract void Display();
}
