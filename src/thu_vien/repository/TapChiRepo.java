package thu_vien.repository;

import thu_vien.model.TapChi;
import thu_vien.model.ThuVien;

import java.util.ArrayList;
import java.util.List;

public class TapChiRepo implements ThuVienRepo<TapChi>{
    private final List<TapChi> tapChis;

    public TapChiRepo(List<TapChi> tapChis) {
        this.tapChis = tapChis;
    }

    @Override
    public void add(TapChi thuVien) {
        tapChis.add(thuVien);

    }

    @Override
    public List<ThuVien> getAll() {
        return new ArrayList<>(tapChis);
    }

    @Override
    public TapChi timKiemTrongThuVien(String maTaiLieu) {
        return tapChis.get(tapChis.indexOf(maTaiLieu));
    }
}
