
public class BoxDriver {

    public static void main(String[] args) {

        Box box1 = new Box();
        box1.setLength(5);
        box1.setWidth(6);
        box1.setHeight(7);

        Box box2 = new Box();
        box2.setLength(10);
        box2.setWidth(10);
        box2.setHeight(10);

//        for (Box box: new Box[]{box1}){
//            System.out.println("Box1 length is: " + box1.getLength());
//            System.out.println("Box1 width is: " + box1.getWidth());
//            System.out.println("Box1 height is: " + box1.getHeight());
//        }
//        for (Box box: new Box[]{box2}){
//            System.out.println("Box2 length is: " + box2.getLength());
//            System.out.println("Box2 width is: " + box2.getWidth());
//            System.out.println("Box2 height is: " + box2.getHeight());
//        }

//        box1.setLength(3);
//        box1.setWidth(4);
//        box1.setHeight(5);
//        for (Box box: new Box[]{box1}){
//            System.out.println("Box1 length is: " + box1.getLength());
//            System.out.println("Box1 width is: " + box1.getWidth());
//            System.out.println("Box1 height is: " + box1.getHeight());
//        }
//        System.out.println("GetVolume for box1 is: " + box1.getVolume());
//        System.out.println("GetSurface area is: " + box1.getSurfaceArea());
        box1.setLength(-5);
        box1.printBox();





    }
}
