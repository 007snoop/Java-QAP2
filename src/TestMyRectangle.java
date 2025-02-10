public class TestMyRectangle {
    public static void main(String[] args){

        MyPoint p1 = new MyPoint(4,6);
        MyPoint p2 = new MyPoint(10,12);
        MyRectangle rect1 = new MyRectangle(p1,p2);

        System.out.println(rect1);
    }
}
