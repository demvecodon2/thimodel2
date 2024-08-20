package thu_vien.sevire;

import thu_vien.model.TapChi;
import thu_vien.model.ThuVien;

import java.util.ArrayList;
import java.util.List;

public class TapChiSivire implements IThuVienSivire<TapChi>{
    private final List<TapChi> tapChis;

    public TapChiSivire(List<TapChi> tapChis) {
        this.tapChis = tapChis;
    }
    @Override
    public void add(TapChi thuVien) {
        tapChis.add(thuVien);

    }
    @Override
    public List<ThuVien> getAll() {
        return new ArrayList<ThuVien>(tapChis);
    }
    @Override
    public TapChi timKiemTrongThuVien(String maTaiLieu) {
        return tapChis.get(tapChis.indexOf(maTaiLieu));
    }
}
