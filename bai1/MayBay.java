package bai1;

public class MayBay extends Phuongtiendichuyen {

    private String loainhienlieu;

    public MayBay() {
    }

    public MayBay(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    public MayBay(String loainhienlieu, String loaiphuongtien, Hangsanxuat hangsanxuat) {
        super(loaiphuongtien, hangsanxuat);
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoainhienlieu() {
        return loainhienlieu;
    }

    public void setLoainhienlieu(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }
    
    public void catCanh() {
        System.out.println("may bay cat canh");
    }

    public void haCanh() {
        System.out.println("may bay ha canh");
    }
    @Override
    public double layVantoc() {
        return 320;
    }

    void setLoainhienlieu(String dau) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}