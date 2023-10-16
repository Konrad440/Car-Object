public class Box {
    private double width;
    private double height;
    private  double length;

    /**
     *
     * @param width
     * @param height
     * @param length
     */
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    /**
     *
     * @param side returns a Box that is a Cube
     */
    Box(double side){
        this(side,side,side);
    }

    public Box() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     *
     * @return the volume of the Box
     */
    public double getVolume(){
        return (height * width * length);
    }
    public double getSurfaceArea(){
        return ((width * length + length * height + height * width)*2);
    }
    public void printBox(){
        if(width <= 0 || height <= 0 || length <= 0){
            System.out.println("Length must be greater than 0");
        } else {
            System.out.println("Length = " + length);
            System.out.println("Height = " + height);
            System.out.println("Width = " + width);
            System.out.println("Volume = " + getVolume());
            System.out.println("Surface area = " + getSurfaceArea());
        }
    }
}
