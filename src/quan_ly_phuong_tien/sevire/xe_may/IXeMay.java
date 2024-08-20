package quan_ly_phuong_tien.sevire.xe_may;

import quan_ly_phuong_tien.model.XeMay;
import quan_ly_phuong_tien.model.XeTai;

import java.util.List;

public interface IXeMay {
    void themXeMay(XeMay xeMay);
    void xoaXeMay(String bienKiemSoat);
    List<XeMay> hienThiXeMay();
    XeMay timKiemXeMay(String bienKiemSoat);
}
