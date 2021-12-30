package Tieuluancuoiki;

import java.util.Date;
import java.util.Scanner;

public class HangHoa {
    String Loai;
    String Id;
	String Ten;
	double Gia;
    int SoLuong;
	HangHoa next;
	Scanner sc = new Scanner(System.in);

	HangHoa(){
		
	}
	
	HangHoa(String _Loai, String _Maid, String _ten, double _Gia,int _SoLuong){
        Loai = _Loai;
		Id = _Maid;
		Ten = _ten;
	    Gia = _Gia;
        SoLuong = _SoLuong;

	}
	
	public void nhapThongTin(Scanner scanner) {
        System.out.print("Loai hang hoa: ");
        Loai = sc.nextLine();
		
		System.out.print("Nhap ma sang pham: ");
		Id = sc.nextLine();

		System.out.print("Nhap ten san pham: ");
		Ten = sc.nextLine();
		
		System.out.print("Nhap gia san pham: ");
		Gia = sc.nextFloat();

        System.out.print("So luong hang hoa ton kho: ");
        SoLuong = sc.nextInt();
	}
	
	public void inThongTin() {
        System.out.println("--------------------");
        System.out.println("Loai hang: " + Loai);
		System.out.println("ten hang: " + Ten);
		System.out.println("Ma hang : " + Id);
		System.out.println("Gia : " + Gia);
        System.out.println("So luong hang hoa : " + SoLuong);
        System.out.println("----------------------------");
		 
	}
	
	public String GetName() {
		System.out.println(Ten);
		return Ten;
	}
}
