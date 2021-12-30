package Tieuluancuoiki;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    static Scanner bienNhap = new Scanner(System.in);
	public static KhoHang kho = new KhoHang();
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		int key;
		while (true){
        	System.out.println("___________MENU_________");
            System.out.println("1)  Them hang			");
            System.out.println("2)  Xoa hang 	");
            System.out.println("3)  In thong tin hang hoa ");
            System.out.println("4)  Tim hàng theo loai");
            System.out.println("5)  Thong ke hang hoa 	");
            System.out.println("6)  Thoat         		");
            System.out.print(" Hay chon chuc nang: ");
            key = sc.nextInt();
            switch(key){
        	case 1:	 ThemHang(kho);break;
            case 2:  XoaHang(kho);break;
            case 3:  in(kho);break;
            case 4:  TimTheoLoai(kho);break;
            case 5: ThongKe(kho);break;
            default: break;
        }

    }
}

public static void ThemHang(KhoHang khoHang) {
    kho.themSanPham(bienNhap);
}
public static void XoaHang(KhoHang khoHang) {
    kho.xoaSanPham(bienNhap);
}
public static void TimTheoLoai(KhoHang khoHang) {
    kho.timSanPham();
}
public static void in(KhoHang khoHang) {
    kho.inTTSanPham();
}
public static void ThongKe(KhoHang khoHang) {
    kho.thongKeSanPham(bienNhap);
}
}