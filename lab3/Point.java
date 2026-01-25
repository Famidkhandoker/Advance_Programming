public class Point {
    private int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Point(){

    }
    public int getX(int x){
        return x;
    }
    public int getY(int y){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public  String toString() {
        return "(" + x + "," + y + ")";
    }
    public double distance(Point p2){
        int dx = this.x - p2.x;
        int dy =this.y -p2.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
}
