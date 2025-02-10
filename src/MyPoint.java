public class MyPoint {
    // attributes
    private int x;
    private int y;

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    // getters
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    // setters

    // method to calc distance from MyPoint Object
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}