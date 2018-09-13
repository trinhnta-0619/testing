package HinhHoc;

public class RunTest {
	public static void main (String[] args) {
		HinhChuNhat hcn = new HinhChuNhat(1,6);
		hcn.Display();
		
		HinhHoc hv = new HinhVuong(2);
		hv.Display();
		
		HinhTron ht = new HinhTron(3);
		ht.Display();
	}

}
