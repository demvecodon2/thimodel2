package thu_vien.repository;

import thu_vien.model.Bao;
import thu_vien.model.ThuVien;

import java.util.ArrayList;
import java.util.List;

public class BaoRepo implements ThuVienRepo<Bao>{
    private final List<Bao> baos;

    public BaoRepo(List<Bao> baos) {
        this.baos = baos;
    }

    @Override
    public void add(Bao thuVien) {
        baos.add(thuVien);

    }
    @Override
    public List<ThuVien> getAll() {
        return new ArrayList<>(baos);
    }

    @Override
    public Bao timKiemTrongThuVien(String maTaiLieu) {
        return baos.get(baos.indexOf(maTaiLieu));
    }
}
