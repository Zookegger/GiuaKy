import java.util.Scanner;

public abstract class HANGHOA {
    protected String mahang, tenhang;
    protected long gia;

    Scanner sc = new Scanner(System.in);

    public HANGHOA() {
        this.mahang = "";
        this.tenhang = "";
        this.gia = 0;
    }

    public HANGHOA(String ma, String ten, int gia){
        this.mahang = ma;
        this.tenhang = ten;
        this.gia = gia;
    }
    
    public String getMahang() {
        return this.mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return this.tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public long getGia() {
        return this.gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public void nhap() {
        System.out.print("Nhap ma hang: ");
        setMahang(sc.nextLine());
        System.out.print("Nhap ten hang: ");
        setTenhang(sc.nextLine());
        System.out.print("Nhap don gia: ");
        setGia(sc.nextLong());
    }
    
    public void xuat() {
        System.out.println("Ma hang: " + getMahang());
        System.out.println("Ten hang: " + getTenhang());
        System.out.println("Don gia: " + getGia());
    }
}
