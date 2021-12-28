package Tieuluancuoiki;

public class Node {
    public static final String MaHang = null;
    HangHoa data;
    Node next;

    public Node(){
        data =  null;
        next = null;
    }

    public Node(HangHoa HangHoa){
        data = HangHoa;
        next = null;
    }

    public Node(HangHoa HangHoa, Node node){
        data = HangHoa;
        next = node;
    }
}
