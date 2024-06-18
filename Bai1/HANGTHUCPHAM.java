public class HANGTHUCPHAM extends HANGHOA {
    private String nsx, nhh;
    private float chietkhau;

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
