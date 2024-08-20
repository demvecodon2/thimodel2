package thu_vien.sevire;

import thu_vien.model.Sach;
import thu_vien.model.ThuVien;

import java.util.ArrayList;
import java.util.List;

public class SachSivire implements IThuVienSivire<Sach> {
    private final List<Sach> sachs = new ArrayList<>();
    @Override
    public void add(Sach thuVien) {
        sachs.add(thuVien);

    }

    @Override
    public List<ThuVien> getAll() {
        return new ArrayList<>(sachs);
    }

    @Override
    public Sach timKiemTrongThuVien(String maTaiLieu) {
        return sachs.get(sachs.indexOf(maTaiLieu));
    }
}
