package quan_ly_phuong_tien.repository;

import quan_ly_phuong_tien.model.Oto;
import quan_ly_phuong_tien.model.PhuongTien;

import java.util.ArrayList;
import java.util.List;

public class OtoRepo implements IPhuongTienRepository<Oto>{
    private final List<Oto> otos;

    public OtoRepo(List<Oto> otos) {
        this.otos = otos;
    }

    @Override
    public void add(Oto phuongTien) {
        otos.add(phuongTien);
    }

    @Override
    public void remove(String bienKiemSoat) {
        otos.remove(bienKiemSoat);

    }

    @Override
    public Oto timKiemPhuongTien(String bienKiemSoat) {
        return otos.get(otos.indexOf(bienKiemSoat));
    }

    @Override
    public List<Oto> getAll() {
        return new ArrayList<>(otos);
    }
}
