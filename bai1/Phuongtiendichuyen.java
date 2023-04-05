package bai1;

public abstract class Phuongtiendichuyen extends Hangsanxuat {
    protected String loaiphuongtien;
    protected Hangsanxuat hangsanxuat;

    public Phuongtiendichuyen() {
    }

    public Phuongtiendichuyen(String loaiphuongtien, Hangsanxuat hangsanxuat) {
        this.loaiphuongtien = loaiphuongtien;
        this.hangsanxuat = hangsanxuat;
    }

    public Phuongtiendichuyen(String loaiphuongtien, Hangsanxuat hangsanxuat, String tenHangsanxuat, String tenQuocgia) {
        super(tenHangsanxuat, tenQuocgia);
        this.loaiphuongtien = loaiphuongtien;
        this.hangsanxuat = hangsanxuat;
    }
    
    public String latTenhangsanxuat(){
        return super.getTenHangsanxuat();
    
    }
    public void batDau(){
        
    }
    public void tangToc(){
        
    }
    public void dungLai(){
        
    }
    abstract double layVantoc();
    
}