package quan_ly_tai_khoan.sevire;

import quan_ly_tai_khoan.model.TaiKhoan;
import java.util.List;

public interface TaiKhoanService {
    void addTaiKhoan(TaiKhoan taiKhoan);
    void deleteTaiKhoan(String maTaiKhoan);
    TaiKhoan getTaiKhoanByMa(String maTaiKhoan);
    List<TaiKhoan> getAllTaiKhoan();
}
