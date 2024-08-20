package quan_ly_phuong_tien.sevire.xe_tai;

import quan_ly_phuong_tien.model.XeTai;

import java.util.ArrayList;
import java.util.List;

public interface IXeTai {
    void themXeTai(XeTai xeTai);
    void  xoaXeTai(String biemKiemSoat);
    List<XeTai> hienThiXeTai();
    XeTai timKiemXeTai(String biemKiemSoat);
    ArrayList<XeTai> chinhSuaPhuongTien(List<XeTai> xeTaiList);
}
