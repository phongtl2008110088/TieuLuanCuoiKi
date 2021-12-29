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
		System.out.println("Chon Vi Tri Them Hang");
		System.out.println("1/ Them vao dau danh sach");
		System.out.println("2/ Them vao cuoi danh sach");
		System.out.println("Lua chon  ");
	int Them = scanner.nextInt();
	
	while (Them == 1) {
		HangHoa hangHoa = new HangHoa();
		Node newNode = new Node(hangHoa);
		newNode.data.NhapThongTin(scanner);
		if (isEmpty()==true) {
			head = newNode;
			tail = newNode;
		}else{
			newNode.next = head;
			head  = newNode;  
		} 
		System.out.println("Da them vao danh sach");    
	}
	 if (Them == 2) { 
		HangHoa hangHoa = new HangHoa();
		Node newNode = new Node(hangHoa);
		newNode.data.NhapThongTin(scanner);
		if (isEmpty()==true) {
			head = newNode;
			tail = newNode;
		}else{
			tail.next = newNode;
			tail  = newNode;          
		}
		System.out.println("Da them vao danh sach");
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
	public void timSanPham(){
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