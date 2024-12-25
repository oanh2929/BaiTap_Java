package muabanxe;

public class xe {
    private String tenxe;
    private String masoxe;
    private String masothue;
    private double giatien;
    private String ngaynhap;
    private boolean trangthai;

    public xe(String tenxe,String masothue,String masoxe,String ngaynhap,double giatien,boolean trangthai){
        this.tenxe=tenxe;
        this.masothue=masothue;
        this.masoxe=masoxe;
        this.ngaynhap=ngaynhap;
        this.giatien=giatien;
        this.trangthai=false;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public String getMasoxe() {
        return masoxe;
    }

    public void setMasoxe(String masoxe) {
        this.masoxe = masoxe;
    }

    public String getMasothue() {
        return masothue;
    }

    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public void print(){
        System.out.println("Tên xe:"+tenxe);
        System.out.println("Giá:"+giatien);
        System.out.println("Trạng thái:"+(trangthai?"Đã bán":"Chưa bán"));
    }
}
