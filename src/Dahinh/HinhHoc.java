package Dahinh;

import java.util.Scanner;

public class HinhHoc {

    void hienthititle(){
        System.out.println("\n******Tính diện tích, chu vi******\n");
    }
    void hienthidientich(){

        System.out.print("*Diện tích là: ");
    }
    void hienthichuvi(){

        System.out.print("*Chu vi là: ");
    }
    float nhapdulieu() {

        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Cảnh báo: Gía trị nhập phải là chữ số");
            System.exit(0);
            return 0;
        }
    }
}
