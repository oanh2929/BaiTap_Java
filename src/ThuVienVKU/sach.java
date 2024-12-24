package ThuVienVKU;

public class sach {
    private String tensach;
    private String masach;
    private boolean trangthai;

    public sach(String tensach,String masach,boolean trangthai){
        this.tensach=tensach;
        this.masach=masach;
        this.trangthai=trangthai;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public void print(){
        System.out.println("Tên saách: "+tensach);
        System.out.println("Mã sách: "+masach);
        System.out.println("Trạng thái: "+(trangthai?"Đã mượn":"Còn lại trong thư viện"));
    }
}
