package bai2;

public class MoveAblecircle implements MoveAble{
    int radius;
    MovePoint a;

    public MoveAblecircle(int radius, MovePoint a) {
        this.radius = radius;
        this.a = a;
    }        

    @Override
    public void moveup() {
        a.y=a.y-a.yseed;
    }

    @Override
    public void movedown() {
       a.y=a.y+a.yseed;
    }

    @Override
    public void moveleft() {
       a.x=a.x-a.xseed; 
    }

    @Override
    public void moveright() {
        a.x=a.x-a.xseed;
    }

    @Override
    public String toString() {
        return "" + a.toString()+","+radius +"";
    }
    
    
}
