
import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("1. Nhap vao ds Dien may");
        System.out.println("2. Xuat ds Dien may ra");
        System.out.println("3. Nhap vao ds Thuc pham");
        System.out.println("4. Xuat ds Thuc pham ra");
        System.out.println("0. Thoat");
        System.out.print("Chon: ");
    }
    public static void main(String[] args) {
        int option;
        DSHANGHOA ds= new DSHANGHOA();
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 0:
                    break;    
                case 1:
                    ds.themMHDienMay();
                    break;    
                case 2:
                    ds.xuatdsdienmay();
                    break;    
                case 3:
                    ds.themMHThucPham();
                    break;    
                case 4:
                    ds.xuatdsthucpham();
                    break;    
                default: 
                    System.out.println("Nhap sai lua chon!");
                    break;
            }
        } while (option != 0);
        
    }
}
