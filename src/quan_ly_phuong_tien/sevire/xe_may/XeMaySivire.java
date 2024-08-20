package quan_ly_phuong_tien.sevire.xe_may;

import quan_ly_phuong_tien.model.XeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMaySivire implements IXeMay {
    List<XeMay> xemays=new ArrayList<XeMay>();
    @Override
    public void themXeMay(XeMay xeMay) {
        xemays.add(xeMay);

    }

    @Override
    public void xoaXeMay(String bienKiemSoat) {
        xemays.remove(bienKiemSoat );

    }

    @Override
    public List<XeMay> hienThiXeMay() {
        return new ArrayList<>(xemays);
    }

    @Override
    public XeMay timKiemXeMay(String bienKiemSoat) {
        return xemays.stream().filter(xeMay -> xeMay.getBienKiemSoat().equals(bienKiemSoat)).findFirst().orElse(null);
    }
}
