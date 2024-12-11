package OnTap_3;

import java.util.ArrayList;
import java.util.List;

public class Phong {
    private String Idphong;
    private String tenPhong;
    private int soLuongGiuong;
    private List<String>danhSachBenhNhan;

    public Phong(String idphong, String tenPhong, int soLuongGiuong, String soLuongBenhNhan){
        this.Idphong=Idphong;
        this.tenPhong=tenPhong;
        this.soLuongGiuong=soLuongGiuong;
        this.danhSachBenhNhan=new ArrayList<>();
    }

    // Thêm bệnh nhân
    public void themBenhNhan(String idBenhNhan) {
        if (danhSachBenhNhan.size() < soLuongGiuong) {
            danhSachBenhNhan.add(idBenhNhan);
        } else {
            System.out.println("Phòng đã đầy, không thể thêm bệnh nhân!");
        }
    }

    // Xóa bệnh nhân
    public void xoaBenhNhan(String idBenhNhan) {
        danhSachBenhNhan.remove(idBenhNhan);
    }

    // Hiển thị thông tin
    @Override
    public String toString() {
        return "ID Phòng: " + Idphong + ", Tên Phòng: " + tenPhong +
                ", Số lượng giường: " + soLuongGiuong +
                ", Danh sách bệnh nhân: " + danhSachBenhNhan;
    }


}
