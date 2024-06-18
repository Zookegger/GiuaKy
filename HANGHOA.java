public abstract class HANGHOA {
    protected String mahang, tenhang;
    protected int gia;

    HANGHOA() {
        setMahang("");
        setTenhang("");
        setGia(0);
    }

    HANGHOA(String ma, String ten, int gia){
        setMahang(ma);
        setTenhang(ten);
        setGia(gia);
    }
    
    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
