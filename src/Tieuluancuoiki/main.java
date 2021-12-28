package Tieuluancuoiki;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    static Scanner bienNhap = new Scanner(System.in);
	public static KhoHang kho = new KhoHang();
	public static void main(String[] args) {
        Date a = new Date();
		
		DienMay headDM = new DienMay(1, "1", 1, a);
		SanhSu headSS = new SanhSu(2, "2", 2, a);
		ThucPham headTP = new ThucPham(3, "3", 3, a);
		    
		DienMay DM1 = new DienMay(4, "4", 4, a);
		headDM.next = DM1;
		SanhSu SS1 = new SanhSu(5, "5", 5, a);
		headSS.next = SS1;
		ThucPham TP1 = new ThucPham(6, "6", 6, a);
		headTP.next = TP1;
		
		DienMay DM2 = new DienMay(7, "7", 7, a);
		DM1.next = DM2;
		SanhSu SS2 = new SanhSu(8, "8", 8, a);
		SS1.next = SS2;
		ThucPham TP2 = new ThucPham(9, "9", 9, a);
		TP1.next = TP2;

     Scanner sc = new Scanner(System.in);
		int key;
		while (true){
        	System.out.println("------------MENU---------");
            System.out.println("1)  Them hang			");
            System.out.println("2)  Xoa hang 	");
            System.out.println("3)  In thong tin hang hoa ");
            System.out.println("4)  Tim hàng theo loai");
            System.out.println("5)  Thong ke hang hoa 	");
            System.out.println("6)  Thoat         		");
            System.out.println("-------------------------");
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

public static void ThemHang(KhoHang kho) {
    kho.themSanPham(bienNhap);
}
public static void XoaHang(KhoHang kho) {
    kho.xoaSanPham(bienNhap);
}
public static void TimTheoLoai(KhoHang kho) {
    kho.timSanPham();
}
public static void in(KhoHang kho) {
    kho.inTTSanPham();
}
public static void ThongKe(KhoHang kho) {
    kho.thongKeSanPham(bienNhap);
}

}
