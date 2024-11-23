package OnTap_1;

public class Sach {
    private String tenSach;
    private String maSach;
    private boolean trangThai;// true: da muon; false: chưa muon

    public Sach(String tenSach, String maSach, boolean trangThai){
        this.tenSach = tenSach;
        this.maSach = maSach;
        this.trangThai = trangThai;
    }

    public String getTenSach(){
        return tenSach;
    }

    public void setTenSach(String tenSach){
        this.tenSach=tenSach;
    }

    public String getMaSach(){
        return maSach;
    }

    public void setMaSach(String maSach){
        this.maSach=maSach;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai){
        this.trangThai=trangThai;
    }


}
