package bai1;

public class main {

    public static void main(String[] args) {
        MayBay mb = new MayBay();
        mb.setLoainhienlieu("dau");
        System.out.println("nhien lieu:" + mb.getLoainhienlieu());
        mb.catCanh();
        mb.haCanh();
        Phuongtiendichuyen p1 = new MayBay();
        System.out.println("vt may bay:" + p1.layVantoc());

        Oto ot = new Oto();
        ot.setLoainhienlieu("dau");
        System.out.println("nhien lieu:" + ot.getLoainhienlieu());
        Phuongtiendichuyen p2 = new Oto();
        System.out.println("vt oto:" + p2.layVantoc());

        Phuongtiendichuyen p3 = new XeDap();
        System.out.println("vt xe may:" + p3.layVantoc());

    }
}