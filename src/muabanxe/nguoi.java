package muabanxe;

public class nguoi {
    protected String hoten;
    protected String sodienthoai;
    protected String socancuoc;

    public nguoi(String hoten,String sodienthoai, String socancuoc){
        this.hoten=hoten;
        this.sodienthoai=sodienthoai;
        this.socancuoc=socancuoc;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getSocancuoc() {
        return socancuoc;
    }

    public void setSocancuoc(String socancuoc) {
        this.socancuoc = socancuoc;
    }

    public void print(){
        System.out.println("Họ tên: "+hoten);
        System.out.println("Số điện thoại: "+sodienthoai);
        System.out.println("Số căn cước: "+socancuoc);
    }
}
