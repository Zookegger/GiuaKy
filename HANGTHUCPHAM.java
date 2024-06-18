public class HANGTHUCPHAM extends HANGHOA {
    private String nsx, nhh;
    private float chietkhau;

    HANGDIENMAY(){
        super();
        setNSX("");
        setNHH("");
        setChietkhau(0.0f);
    }

    HANGDIENMAY(String mahang, String tenhang, int gia, String nsx, String nhh, float khuyenmai){
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
}
