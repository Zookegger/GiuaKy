import java.util.Scanner;

public class HANGDIENMAY extends HANGHOA {
    private int thoigianbaohanh;
    private float khuyenmai;
    private int congsuat;

    Scanner sc = new Scanner(System.in);

    public HANGDIENMAY(){
        super();
        setThoigianbaohanh(0);
        setKhuyenmai(0.0f);
        setCongsuat(0);
    }

    public HANGDIENMAY(String mahang, String tenhang, int gia, int tgbh, float khuyenmai, int congsuat){
        super(mahang, tenhang, gia);
        setThoigianbaohanh(tgbh);
        setKhuyenmai(khuyenmai);
        setCongsuat(congsuat);
    }

    public int getThoigianbaohanh() {
        return thoigianbaohanh;
    }

    // Setter for thoigianbaohanh
    public void setThoigianbaohanh(int thoigianbaohanh) {
        this.thoigianbaohanh = thoigianbaohanh;
    }

    // Getter for khuyenmai
    public float getKhuyenmai() {
        return khuyenmai;
    }

    // Setter for khuyenmai
    public void setKhuyenmai(float khuyenmai) {
        this.khuyenmai = khuyenmai;
    }

    // Getter for congsuat
    public int getCongsuat() {
        return congsuat;
    }

    // Setter for congsuat
    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }

    public double getGiaban() {
        return ((double)super.gia) + ((double)this.khuyenmai); 
    }

    public void nhap() { 

        System.out.print("Nhap ma hang: ");
        super.setMahang(sc.nextLine());
        System.out.print("Nhap ten hang: ");
        super.setTenhang(sc.nextLine());
        System.out.print("Nhap gia: ");
        super.setGia(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap thoi gian bao hanh (thang): ");
        setThoigianbaohanh(sc.nextLine());
        System.out.print("Nhap khuyen mai: "); 
        setKhuyenmai(sc.nextFloat());
        sc.nextLine();
        System.out.print("Nhap cong suat: ");
        setCongsuat(sc.nextInt());
        sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma hang: " + getMahang());
        System.out.println("Ten hang: " + getTenhang());
        System.out.println("Gia: " + getGia());
        System.out.println("Thoi gian bao hanh: " + getThoigianbaohanh() + " Thang");
        System.out.println("Cong suat: " + getCongsuat()); 
        System.out.println("Khuyen mai: " + getKhuyenmai());
        System.out.println("Gia ban: " + getGiaban());
    }
}
