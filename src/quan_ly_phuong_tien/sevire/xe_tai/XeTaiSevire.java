package quan_ly_phuong_tien.sevire.xe_tai;

import quan_ly_phuong_tien.model.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiSevire implements IXeTai {
    List<XeTai> xeTais = new ArrayList<XeTai>();
    @Override
    public void themXeTai(XeTai xeTai) {
       xeTais.add(xeTai);


    }

    @Override
    public void xoaXeTai(String biemKiemSoat) {
        xeTais.remove(biemKiemSoat);

    }

    @Override
    public List<XeTai> hienThiXeTai() {
        return new ArrayList<>(xeTais);
    }

    @Override
    public XeTai timKiemXeTai(String biemKiemSoat) {
        return xeTais.stream().filter(xeTai -> xeTai.getBienKiemSoat().equalsIgnoreCase(biemKiemSoat)).findFirst().orElse(null);
    }

    @Override
    public ArrayList<XeTai> chinhSuaPhuongTien(List<XeTai> xeTaiList) {
        return new ArrayList<>(xeTaiList);

    }
}
