import java.util.Scanner;

public class HANGTHUCPHAM extends HANGHOA {
    private String nsx, nhh;
    private float chietkhau;

    Scanner sc = new Scanner(System.in);

    public HANGTHUCPHAM (){
        super();
        this.nsx = "00/00/0000";
        this.nhh = "00/00/0000";
        this.chietkhau = 0.0f;
    }

    public HANGTHUCPHAM(String mahang, String tenhang, int gia, String nsx, String nhh, float chietkhau){
        super(mahang, tenhang, gia);
        this.nsx = nsx;
        this.nhh = nhh;
        this.chietkhau = chietkhau;
    }

    public String getNSX() {
        return this.nsx;
    }

    public void setNSX(String nsx) {
        this.nsx = nsx;
    }

    public String getNHH() {
        return this.nsx;
    }

    public void setNHH(String nhh) {
        this.nhh = nhh;
    }

    public float getChietkhau() {
        return chietkhau;
    }

    public void setChietkhau(float chietkhau) {
        this.chietkhau = chietkhau;
    }

    public double getGiaban() {
        return ((double)super.gia) + ((double)this.chietkhau); 
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap ngay san xuat: ");
        setNSX(sc.nextLine());
        System.out.print("Nhap ngay het han: "); 
        setNHH(sc.nextLine());
        System.out.print("Nhap chiet khau: ");
        setChietkhau(sc.nextFloat());
        sc.nextLine();
    }
        
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ngay san xuat: " + getNSX());
        System.out.println("Ngay het han: " + getNHH()); 
        System.out.println("Chiet khau: " + (getChietkhau() * 100) + "%"); 
        System.out.println("Gia ban: " + getGiaban());
        System.out.println("");
    }
}
