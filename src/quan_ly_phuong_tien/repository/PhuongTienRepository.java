package quan_ly_phuong_tien.repository;


import quan_ly_phuong_tien.model.PhuongTien;

import java.util.ArrayList;
import java.util.List;

public abstract class PhuongTienRepository<T extends PhuongTien> implements IPhuongTienRepository<T> {
    protected List<T> phuongTiens;
    @Override
    public void add(T phuongTien) {
        phuongTiens.add(phuongTien);

    }

    @Override
    public void remove(String bienKiemSoat) {
phuongTiens.remove(phuongTiens.indexOf(bienKiemSoat));
    }

    @Override
    public T timKiemPhuongTien(String bienKiemSoat) {
        for (T phuongTien : phuongTiens) {
            if (phuongTien.getBienKiemSoat().equals(bienKiemSoat)) {
                return phuongTien;
            }
        }
        return null;
    }

    @Override
    public List getAll() {
        return new ArrayList<>(phuongTiens);
    }
}
