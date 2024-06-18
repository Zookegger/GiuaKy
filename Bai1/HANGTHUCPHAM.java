import java.util.Scanner;

public class HANGTHUCPHAM extends HANGHOA {
    private String nsx, nhh;
    private float chietkhau;

    Scanner sc = new Scanner(System.in);

    public HANGDIENMAY(){
        super();
        setNSX("");
        setNHH("");
        setChietkhau(0.0f);
    }

    public HANGDIENMAY(String mahang, String tenhang, int gia, String nsx, String nhh, float khuyenmai){
        super(mahang, tenhang, gia);
        setNSX(nsx);
        setNHH(nhh);
        setChietkhau(chietkhau);
    }

    public int getNSX() {
        return this.nsx;
    }

    // Setter for NSX
    public void setNSX(String nsx) {
        this.nsx = nsx;
    }

    public int getNHH() {
        return this.nsx;
    }

    // Setter for NSX
    public void setNHH(String nhh) {
        this.nhh = nhh;
    }

    // Getter for ChietKhau
    public float getChietkhau() {
        return chietkhau;
    }

    // Setter for ChietKhau
    public void setChietkhau(float chietkhau) {
        this.chietkhau = chietkhau;
    }

    public double getGiaban() {
        return ((double)super.gia) + ((double)this.chietkhau); 
    }


    public void nhap() {
        System.out.print("Nhap ma hang: ");
        super.setMahang(sc.nextLine());
        System.out.print("Nhap ten hang: ");
        super.setMahang(sc.nextLine());
        System.out.print("Nhap gia: ");
        super.setMahang(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ngay san xuat: ");
        setNSX(sc.nextLine());
        System.out.print("Nhap ngay het han: "); 
        setNHH(sc.nextLin());
        sc.nextLine();
        System.out.print("Nhap chiet khau: ");
        setChietkhau(sc.nextFloat());
        sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma hang: " + getMahang());
        System.out.println("Ten hang: " + getTenhang());
        System.out.println("Gia: " + getGia());
        System.out.println("Ngay san xuat: " + getNSX());

        System.out.println("Ngay het han: " + getNHH()); 
        System.out.println("Chiet khau: " + getChietkhau()); 
        System.out.println("Gia ban: " + getGiaban());
    }
}
