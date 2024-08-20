package quan_ly_phuong_tien.sevire.oto;

import quan_ly_phuong_tien.model.Oto;

import java.util.ArrayList;
import java.util.List;

public class OtoSivire implements IOto {
    private static final List<Oto> otos= new ArrayList<Oto>();
    @Override
    public void themOto(Oto oto) {
        otos.add(oto);

    }

    @Override
    public void xoaOto(String bienKiemSoat) {
        otos.remove(bienKiemSoat);

    }

    @Override
    public List<Oto> hienThiOto() {
        return new ArrayList<>(otos);
    }

    @Override
    public Oto timKiemOto(String bienKiemSoat) {
        return otos.stream().filter(oto -> oto.getBienKiemSoat().equals(bienKiemSoat)).findFirst().orElse(null);
    }

    @Override
    public void chinhSuaPhuongTien(String bienKiemSoat) {


    }
}
