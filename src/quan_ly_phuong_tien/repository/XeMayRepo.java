package quan_ly_phuong_tien.repository;

import quan_ly_phuong_tien.model.XeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepo implements IPhuongTienRepository<XeMay>{
    private List<XeMay> xeMays;
    public XeMayRepo(List<XeMay> xeMays) {
        this.xeMays =new ArrayList<>();
    }


    @Override
    public void add(XeMay phuongTien) {
        xeMays.add(phuongTien);

    }

    @Override
    public void remove(String bienKiemSoat) {
        xeMays.removeIf(xeMay -> xeMay.getBienKiemSoat().equals(bienKiemSoat));

    }

    @Override
    public XeMay timKiemPhuongTien(String bienKiemSoat) {
        return xeMays.stream().filter(xeMay -> xeMay.getBienKiemSoat().equals(bienKiemSoat)).findFirst().orElse(null);
    }

    @Override
    public List getAll() {
        return new ArrayList<>(xeMays);
    }
}
