package OnTap_3;

public class BenhNhan extends Person {
    private String idbenhNhan;
    private String idbenh;
    private String idsoPhong;
    private String ngayNhapVien;
    private String ngayXuatVien;
    private boolean daXuatVien;
    private String idbacSi;

    public BenhNhan(String ten, int namSinh, String diaChi,String idbenhNhan, String idbenh, String idsoPhong, String ngayNhapVien, String ngayXuatVien){
        super(ten,namSinh,diaChi);
        this.idbenhNhan=idbenhNhan;
        this.idbenh=idbenh;
        this.idsoPhong=idsoPhong;
        this.ngayNhapVien=ngayNhapVien;
        this.ngayXuatVien="";
        this.daXuatVien=false;
        this.idbacSi=idbacSi;
    }

    public String getIdbenhNhan(){
        return idbenhNhan;
    }

    public void setIdbenhNhan(String idbenhNhan) {
        this.idbenhNhan = idbenhNhan;
    }

    public String getIdbenh(){
        return idbenh;
    }

    public void setIdbenh(String idbenh) {
        this.idbenh = idbenh;
    }

    public String getIdsoPhong(){
        return idsoPhong;
    }

    public void setIdsoPhong(String idsoPhong) {
        this.idsoPhong = idsoPhong;
    }

    public String getNgayNhapVien(){
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVienVien) {
        this.ngayNhapVien=ngayNhapVien;
    }

    public String getNgayXuatVien(){
        return ngayXuatVien;
    }


    public void setNgayXuatVien(String ngayXuatVien) {
        if(ngayXuatVien.compareTo(ngayNhapVien)<0){
            System.out.println("Ngày xuất viện không thể trước ngày nhập viện.");
            this.ngayXuatVien=ngayXuatVien;
            this.daXuatVien=true;
        }
    }

    public boolean isDaXuatVien(){
        return daXuatVien;
    }

    public String getIdbacSi() {
        return idbacSi;
    }

    public void setIdbacSi(String idbacSi) {
        this.idbacSi = idbacSi;
    }



    public void thayDoiBacSi(String idbacSi){
        this.idbacSi=idbacSi;
    }

    public void doiPhong(String idsoPhong){
        this.idsoPhong=idsoPhong;
    }

    @Override
    public String toString() {
        return super.toString() +"ID Bệnh nhân"+idbenhNhan+"ID Bệnh: "+idbenh+"ID Số Phòng: "+idsoPhong+"Ngày nhập viện: "+ngayNhapVien+", Ngày xuất viện: " + (daXuatVien ? ngayXuatVien : "Chưa xuất viện") +
                ", ID Bác sĩ đảm nhiệm: " + idbacSi;
    }
}
