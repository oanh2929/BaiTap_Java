package OnTap_4;

public class Sach {
    private String idSach;
    private String tenSach;
    private String tacGia;
    private int soLuongSach;
    private int soLuongDaMuon;

    public Sach(String idSach,String tenSach, String tacGia,int soLuongSach) {
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.soLuongSach = soLuongSach;
        this.soLuongDaMuon = 0; //mặc định
    }

    public String getIdSach(){
        return idSach;
    }

    public void setIdsach(String idSach) {
        this.idSach = idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoLuongSach() {
        return soLuongSach;
    }

    public void setSoLuongSach(int soLuongSach) {
        this.soLuongSach = soLuongSach;
    }


    public int getSoLuongDaMuon() {
        return soLuongDaMuon;
    }

    public void setSoLuongDaMuon(int soLuongDaMuon) {
        this.soLuongDaMuon = soLuongDaMuon;
    }


    public void capNhatSoLuongMuon(int soLuongConLai) {
        if (soLuongDaMuon + soLuongConLai <= soLuongSach) {
            soLuongDaMuon += soLuongConLai;
        } else {
            System.out.println("Không đủ sách để mượn.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Sach{"+"id sách="+idSach+",Tên sách: "+tenSach+", Tác giả:"+tacGia+",soLuongConLai="+(soLuongSach-soLuongDaMuon)+",Tổng số lượng: "+soLuongSach+'}';
    }
}
