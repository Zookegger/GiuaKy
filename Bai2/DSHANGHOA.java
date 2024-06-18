import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DSHANGHOA {
    ArrayList<HANGDIENMAY> dsdienmay = new ArrayList<HANGDIENMAY>();
    ArrayList<HANGTHUCPHAM> dsthucpham = new ArrayList<HANGTHUCPHAM>();
    
    public DSHANGHOA() {
    }

    void themMHDienMay() {
        HANGDIENMAY dm = new HANGDIENMAY();
        dm.nhap();
        dsdienmay.add(dm);
    }

    void themMHThucPham() {
        HANGTHUCPHAM tp = new HANGTHUCPHAM();
        tp.nhap();
        dsthucpham.add(tp);
    }

    void xuatdsdienmay() {
        if (dsdienmay.isEmpty())
            System.out.println("Danh sach rong");
        else{
            Collections.sort(dsdienmay, new Comparator<HANGDIENMAY>() {
                @Override
                public int compare(HANGDIENMAY o1, HANGDIENMAY o2) {
                    return Double.compare(o1.getGiaban(), o2.getGiaban());
                }
            });
            for (HANGDIENMAY i : dsdienmay)
                i.xuat();
        }
    }

    void xuatdsthucpham() {
        if (dsthucpham.isEmpty())
            System.out.println("Danh sach rong");
        else{
            Collections.sort(dsthucpham, new Comparator<HANGTHUCPHAM>() {
                @Override
                public int compare(HANGTHUCPHAM o1, HANGTHUCPHAM o2) {
                    return Double.compare(o1.getGiaban(), o2.getGiaban());
                }
            });
            for (HANGTHUCPHAM i : dsthucpham)
                i.xuat();
        }
    }
}