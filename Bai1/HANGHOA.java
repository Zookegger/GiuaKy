public abstract class HANGHOA {
    protected String mahang, tenhang;
    protected int gia;

    public HANGHOA() {
        setMahang("");
        setTenhang("");
        setGia(0);
    }

    public HANGHOA(String ma, String ten, int gia){
        setMahang(ma);
        setTenhang(ten);
        setGia(gia);
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

    public int getGia() {
        return this.gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
