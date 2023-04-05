package bai2;

public class main {
    public static void main(String[] args) {
        MoveAble m=new MovePoint(10,52,8,24);
        
        
        m.moveup();
        
        m.movedown();
        
        m.moveleft();
        
        m.moveright();
        
        m.toString();
    }
}