package thu_vien.model;

public abstract class ThuVien {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;
    public ThuVien(String id, String name, int age) {
        this.maTaiLieu = id;
        this.tenNhaXuatBan = name;
        this.soBanPhatHanh = soBanPhatHanh;
    }



    public String getMaTaiLieu() {
        return maTaiLieu;
    }
    public void getMaTaiLieu(String id) {
        this.maTaiLieu = id;
    }
    public String getName() {
        return tenNhaXuatBan;
    }
    public void setName(String name) {
        this.tenNhaXuatBan = name;
    }
    public int soBanPhatHanh() {
        return soBanPhatHanh;
    }
    public void soBanPhatHanh(int age) {
        this.soBanPhatHanh = age;
    }
    @Override
    public String toString() {
        return "Sach [id=" + maTaiLieu + ", name=" + tenNhaXuatBan + ", age=" + soBanPhatHanh + "]";
    }
}
