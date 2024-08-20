package quan_ly_phuong_tien.repository;

import quan_ly_phuong_tien.model.PhuongTien;
import quan_ly_phuong_tien.model.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepo implements IPhuongTienRepository{
    private List<XeTai> xeTaiList;
    public XeTaiRepo(List<XeTai> xeTaiList) {
        this.xeTaiList = xeTaiList;
    }
    @Override
    public void add(PhuongTien phuongTien) {
        xeTaiList.add((XeTai) phuongTien);

    }

    @Override
    public void remove(String bienKiemSoat) {
        xeTaiList.removeIf(xeTai -> xeTai.getBienKiemSoat().equals(bienKiemSoat));

    }

    @Override
    public PhuongTien timKiemPhuongTien(String bienKiemSoat) {
        return xeTaiList.stream().filter(xeTai -> xeTai.getBienKiemSoat().equals(bienKiemSoat)).findFirst().get();
    }

    @Override
    public List getAll() {
        return new ArrayList(xeTaiList);
    }
}
