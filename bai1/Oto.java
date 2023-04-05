package bai1;

public class Oto extends Phuongtiendichuyen {
    private String loainhienlieu;

    public Oto() {
    }

    public Oto(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    public Oto(String loainhienlieu, String loaiphuongtien, Hangsanxuat hangsanxuat) {
        super(loaiphuongtien, hangsanxuat);
        this.loainhienlieu = loainhienlieu;
    }

    public Oto(String loainhienlieu, String loaiphuongtien, Hangsanxuat hangsanxuat, String tenHangsanxuat, String tenQuocgia) {
        super(loaiphuongtien, hangsanxuat, tenHangsanxuat, tenQuocgia);
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoainhienlieu() {
        return loainhienlieu;
    }

    public void setLoainhienlieu(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoaiphuongtien() {
        return loaiphuongtien;
    }

    public void setLoaiphuongtien(String loaiphuongtien) {
        this.loaiphuongtien = loaiphuongtien;
    }

    public Hangsanxuat getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(Hangsanxuat hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }
    
    
    @Override
    double layVantoc() {
        return 80;
    }

    void setLoainhienlieu(String dau) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
