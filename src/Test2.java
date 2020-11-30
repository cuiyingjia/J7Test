public class Test2 {
    public static void main(String[] args) {
        Shape shape = new Quadrilateral();
        Quadrilateral quadrilateral = new Quadrilateral();
//        1.
//        Triangle triangle= (Triangle) shape;
//    2.
//        Triangle triangle = (Triangle) quadrilateral;
        shape = quadrilateral;

    }
}
