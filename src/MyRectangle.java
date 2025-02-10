public class MyRectangle {
    // attributes
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // constructor
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;

    }

    // getters

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    @Override
    public String toString() {
        return "My Rectangle [top left =" + topLeft + ", bottom right = " + bottomRight + "]";
    }
}
