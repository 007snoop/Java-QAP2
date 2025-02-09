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
    // get int array of XY
    public int[] getXY() {
        return new int[]{x,y};
    }

    // setters

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
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
// addding comments for commit hhhh