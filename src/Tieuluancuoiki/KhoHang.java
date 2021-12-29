package Tieuluancuoiki;

import java.util.Date;
import java.util.Scanner;

public class KhoHang{
Node head = null;
Node tail = null;
HangHoa hangHoa;
HangHoa headHangHoa;
public KhoHang(){
}
boolean isEmpty(){
boolean empty =true;
if (head == null) {
	empty = true;
} else {
	empty = false;
}
return empty;
}
	public void themSanPham(Scanner scanner){
	System.out.println("Ban muon them loai hang nao ?\n");
	int Them = scanner.nextInt();
	System.out.println("Vui long chon loai hang\n ");
		System.out.print("1/ Đien may\n");
        System.out.print("2/ Sanh Su\n");	
        System.out.print("3/ Thuc Pham\n");
        System.out.print(" Lua chon:");
		int loaiHang = scanner.nextInt();
		
		if (loaiHang == 1) {
			DienMay cur = headDienMay;
			while (cur != null) {
				if (cur.next == null) {
					DienMay itemMoi = new DienMay();
					itemMoi.ma = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}else if (loaiHang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.next == null) {
					SanhSu itemMoi = new SanhSu();
					itemMoi.ma = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}else if (loaiHang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.next == null) {
					ThucPham itemMoi = new ThucPham();
					itemMoi.ma = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}
	}
		
	int NhapId(Scanner scanner, int loaihang) {
		
		System.out.print("Hay nhap ID hang: ");
		int id = scanner.nextInt();
		
		if (loaihang == 1) {
			DienMay cur = headDienMay;
			while (cur != null) {
				if (cur.ma == id) {
					System.out.println("Id nay da co mat trong kho");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.ma == id) {
					System.out.print("Id nay da co mat trong kho");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.ma == id) {
					System.out.print("Id nay da co mat trong kho");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		return id;
	}
public void xoaSanPham(Scanner scanner){
	System.out.println("Ban muon xoa loai hang nao\n?");
	System.out.println("1/xoa dau danh sach\n");
	System.out.println("2/xoa cuoi danh sach\n");
	System.out.println("Hay chon chuc nang ");
	int Xoa = scanner.nextInt();
	
	while (Xoa == 1) { 
			if(head == null){
				System.out.println("Danh sach trong");
				return;
			}
			head = head.next;
			System.out.println("Da xoa danh sach");
		}
	if (Xoa == 2) 
			if (isEmpty()) {
				
			}
			Node temp;
			temp = head;
			while (temp !=null) {
			   if (temp.next == tail) {
				   tail = temp;
				   tail.next = null;
			   } 
			   temp = temp.next;
			   System.out.println("Da xoa danh sach");
			}
		}
public void inTTSanPham() {
Node current = head;
if (head == null) {
	System.out.println("Danh Sach Trong");
} else {
	while (current != null) {
		current.data.inThongTin();
		current = current.next;
	}
}
}
void timSanPham(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Hay nhap loai hang hoa can tim: ");
	String loaiCanTim = sc.nextLine();
	Node current = head;
	while(current != null){
		if(current.data.Loai.equals(loaiCanTim)){
			System.out.println("Hang hoa da duoc tim : ");
			current.data.inThongTin();               
		}
		current = current.next;
	}
	System.out.println("Khong co san pham ");
}
void thongKeSanPham(Scanner scanner){
Node current = head;
int TongSoLuong = 0;
int TongGiaTri = 0;
if (head == null) {
	System.out.println("Danh Sach Trong");
} else {
	while (current != null) {
		TongSoLuong += current.data.SoLuong;
		TongGiaTri += current.data.Gia; 
		current = current.next;
	}
}
System.out.println("Tong so luong hang hoa nhap kho: " +TongSoLuong);
System.out.println("Tong gia tri hang hoa nhap kho: " +TongGiaTri);     
}

void print(){
Node current;
current = head;
if (head==null) {
	System.out.println("Danh Sach Trong");
	return;
  } 
 }
}