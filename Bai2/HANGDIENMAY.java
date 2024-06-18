import java.util.Scanner;

public class HANGDIENMAY extends HANGHOA {
    private int thoigianbaohanh;
    private float khuyenmai;
    private int congsuat;

    Scanner sc = new Scanner(System.in);

    public HANGDIENMAY(){
        super();
        this.thoigianbaohanh = 0;
        this.khuyenmai = 0.0f;
        this.congsuat = 0;
    }

    public HANGDIENMAY(String mahang, String tenhang, int gia, int tgbh, float khuyenmai, int congsuat){
        super(mahang, tenhang, gia);
        this.thoigianbaohanh = tgbh;
        this.khuyenmai = khuyenmai;
        this.congsuat = congsuat;
    }

    public int getThoigianbaohanh() {
        return this.thoigianbaohanh;
    }

    // Setter for thoigianbaohanh
    public void setThoigianbaohanh(int thoigianbaohanh) {
        this.thoigianbaohanh = thoigianbaohanh;
    }

    // Getter for khuyenmai
    public float getKhuyenmai() {
        return this.khuyenmai;
    }

    // Setter for khuyenmai
    public void setKhuyenmai(float khuyenmai) {
        this.khuyenmai = khuyenmai;
    }

    // Getter for congsuat
    public int getCongsuat() {
        return this.congsuat;
    }

    // Setter for congsuat
    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }

    public double getGiaban() {
        return ((double)super.gia) + ((double)this.khuyenmai); 
    }

    @Override
    public void nhap() { 
        super.nhap();
        System.out.print("Nhap thoi gian bao hanh (thang): ");
        setThoigianbaohanh(sc.nextInt());
        System.out.print("Nhap khuyen mai (0-1): "); 
        setKhuyenmai(sc.nextFloat());
        sc.nextLine();
        System.out.print("Nhap cong suat: ");
        setCongsuat(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thoi gian bao hanh: " + getThoigianbaohanh() + " Thang");
        System.out.println("Cong suat: " + getCongsuat()); 
        System.out.println("Khuyen mai: " + (getKhuyenmai() * 100) + "%");
        System.out.println("Gia ban: " + getGiaban());
        System.out.println("");
    }
}
