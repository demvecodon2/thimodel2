package thu_vien.model;

public class Sach extends ThuVien {
    private String tenTacGia;
    private int soTrang;


    public Sach(String maTaiLieu, String name, int age, String tenTacGia, int soTrang) {
        super(maTaiLieu, name, age);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }
    public String getTenTacGia() {
        return tenTacGia;
    }
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
    public int getSoTrang() {
        return soTrang;
    }
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    @Override
    public String toString() {
        return super.toString()+"sách (tên tác giả:"+tenTacGia+")"+"( số trang:"+soTrang;
    }
}
