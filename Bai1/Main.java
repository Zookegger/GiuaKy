import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HANGDIENMAY a = new HANGDIENMAY();
        HANGTHUCPHAM b = new HANGTHUCPHAM();

        a.nhap();
        a.xuat();

        System.out.println("");

        b.nhap();
        b.xuat();
    }
}
