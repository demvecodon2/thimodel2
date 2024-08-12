package quan_ly_tai_khoan.sevire;

import quan_ly_tai_khoan.controller.TheQuanLy;
import quan_ly_tai_khoan.model.TaiKhoan;


import java.util.List;

public class TaiKhoanServiceImpl implements TaiKhoanService {
    private TheQuanLy theQuanLy;

    public TaiKhoanServiceImpl(TheQuanLy theQuanLy) {
        this.theQuanLy = theQuanLy;
    }

    @Override
    public void addTaiKhoan(TaiKhoan taiKhoan) {
        theQuanLy.add();
    }

    @Override
    public void deleteTaiKhoan(String maThe) {
        theQuanLy.delete();
    }

    @Override
    public TaiKhoan getTaiKhoanByMa(String maTaiKhoan) {
        return null;
    }

    @Override
    public List<TaiKhoan> getAllTaiKhoan() {
        return List.of();
    }


}
