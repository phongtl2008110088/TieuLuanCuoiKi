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
	System.out.println("1/Them hang vao dau danh sach\n");
	System.out.println("2/Them hang vao cuoi danh sach\n");
	System.out.println("Hay chon chuc nang ");
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
		System.out.println("Da them danh sach");
	} if (Them == 2) {
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
		System.out.println("Da them danh sach");
	}
}
public void xoaSanPham(Scanner scanner){
	System.out.println("Ban muon xoa loai hang nao?");
	System.out.println("1/xoa hang hoa dau danh sach");
	System.out.println("2/xoa hang hoa cuoi danh sach");
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
	System.out.println("trong");
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
int Max1 = 0;
double Max2 = 0;
if (head == null) {
	System.out.println("trong");
} else {
	while (current != null) {
		Max1 += current.data.SoLuong;
		Max2 += current.data.Gia; 
		current = current.next;
	}
}
System.out.println("Tong so luong hang hoa nhap kho: " +Max1);
System.out.println("Tong gia tri hang hoa nhap kho: " +Max2);     
}

void print(){
Node current;
current = head;
if (head==null) {
	System.out.println("Trong");
	return;
  } 
 }
}