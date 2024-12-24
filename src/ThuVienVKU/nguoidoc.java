package ThuVienVKU;

public class nguoidoc extends nguoi {
    private String masinhvien;
    private String ngaymuon;
    private String ngaytra;

    public nguoidoc(String hoten,String sodienthoai,String email,String masinhvien,String ngaymuon,String ngaytra){
        super(hoten,sodienthoai,email);
        this.masinhvien=masinhvien;
        this.ngaymuon=ngaymuon;
        this.ngaytra=ngaytra;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public void print(){
        System.out.println("Họ tên: "+hoten);
        System.out.println("Mã sinh viên: "+masinhvien);
        System.out.println("Ngày mượn: "+ngaymuon);
        System.out.println("Ngày trả: "+ngaytra);
    }

}
