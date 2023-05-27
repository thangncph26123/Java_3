
package luyen_tap_2;

public class KhachHang {
    private int id;
    private String ten;
    private String diaChi;
    private String email;
    private int tuoi;
    private boolean gioiTinh;

    public KhachHang() {
    }

    public KhachHang(int id, String ten, String diaChi, String email, int tuoi, boolean gioiTinh) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.email = email;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
}
