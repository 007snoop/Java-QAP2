public class MyLine {
    // attributes
    private MyPoint begin;
    private  MyPoint end;

    // constructors
    public MyLine( int x1, int y1, int x2, int y2 ) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // getters
    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }
    public double getLength() {
        return begin.distance(end);
    }
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(xDiff, yDiff);
    }
    // setters
    public void setBegin(MyPoint begin) {
            this.begin = begin;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }

  @Override
    public String toString() {
      return "My Line [Begin=" + begin + ", end=" + end + "]";
  }

}


