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
		System.out.println("Ban muon them vao vi tri nao");
        System.out.println("1/ Them hang vao dau danh sach");
        System.out.println("2/ Them hang vao cuoi danh sach");
        System.out.println("Lua chon ");
        int Them = scanner.nextInt();
        
        
        while (Them == 1) {// thêm đầu
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
            System.out.println("da them hang hoa");    
        } if (Them == 2) { // thêm cuối
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
            System.out.println("da them hang hoa");
        }
    }
	public void xoaSanPham(Scanner scanner){
	System.out.println("Ban muon xoa loai hang nao?");
	System.out.println("1/ xoa hang hoa dau danh sach");
	System.out.println("2/ xoa hang hoa cuoi danh sach");
	System.out.println("Lua chon ");
	int Xoa = scanner.nextInt();
	
	while (Xoa == 1) {  //Xóa đầu
				if(isEmpty() == true){
            	System.out.println("Danh sach rong.");
           		 return;
        }
        // Giá trị của Node được Node head trỏ đến sẽ được gán vào Node head.
        		head = head.next;
    }
	if (Xoa == 2) //Xóa cuối
		if (isEmpty()) {
		System.out.println("Danh sach rong.");
	}
		Node current = head;
	while (current !=null) {
		// Nếu Node current trỏ đến Node tail thì Node current sẽ gán vào Node tail và Node tail sẽ trỏ đến Node rỗng.
	   if (current.next == tail) {
		   tail = current;
		   tail.next = null;
	   } 
	   current = current.next;
	}
}
    public void inTTSanPham(){
    Node current;
    current = head;
    if (head==null) {
        System.out.println("Danh Sach Trong");
        return;
      } 
     }
	public void timSanPham(){
		Scanner sc = new Scanner(System.in);
                System.out.print("Hay nhap loai hang hoa can tim: ");
                String loaiCanTim = sc.nextLine();
                Node current = head;
                while(current != null){
                    if(current.data.Loai.equals(loaiCanTim)){
                        System.out.println("Loai hang hoa can tim: ");
                        current.data.inThongTin();               
                    }
                    current = current.next;
                }
                System.out.println("khong có loai hang hoa can tim");
            }
   public void thongKeSanPham(Scanner scanner){
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
}