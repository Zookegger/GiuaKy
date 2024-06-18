public class HANGDIENMAY extends HANGHOA {
    private int thoigianbaohanh;
    private float khuyenmai;
    private int congsuat;

    HANGDIENMAY(){
        super();
        setThoigianbaohanh(0);
        setKhuyenmai(0.0f);
        setCongsuat(0);
    }

    HANGDIENMAY(String mahang, String tenhang, int gia, int tgbh, float khuyenmai, int congsuat){
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
}
