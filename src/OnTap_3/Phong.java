package OnTap_3;

import java.util.ArrayList;
import java.util.List;

public class Phong {
    private String Idphong;
    private String tenPhong;
    private int soLuongGiuong;
    private int soLuongBenhNhan;

    public Phong(String Idphong, String tenPhong, int soLuongGiuong, int soLuongBenhNhan){
        this.Idphong=Idphong;
        this.tenPhong=tenPhong;
        this.soLuongGiuong=soLuongGiuong;
        this.soLuongBenhNhan=soLuongBenhNhan;
    }

    // Thêm bệnh nhân
    public void themBenhNhan(String idBenhNhan) {
        if (soLuongBenhNhan < soLuongGiuong) {
            soLuongBenhNhan++;
        } else {
            System.out.println("Phòng đã đầy, không thể thêm bệnh nhân!");
        }
    }

    // Xóa bệnh nhân
    public void xoaBenhNhan(String idBenhNhan) {
        if(soLuongBenhNhan>0){
            soLuongBenhNhan--;
        } else {
            System.out.println("Phòng không có bệnh nhan.");
        }
    }

    // Hiển thị thông tin
    @Override
    public String toString() {
        return "ID Phòng: " + Idphong + ", Tên Phòng: " + tenPhong +
                ", Số lượng giường: " + soLuongGiuong +
                ", Danh sách bệnh nhân: " + soLuongBenhNhan;
    }


}
