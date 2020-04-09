public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    private int sum12 = side1 + side2;
    private int sum23 = side2 + side3;
    private int sum13 = side1 + side3;
    public Triangle(){

    }

    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void checkSide() throws  IllegalTriangleException{
        if (side1 <= 0 || side2 <= 0 || side3 <= 0){
            throw new IllegalTriangleException();
        } else if (sum12 > side3 || sum23 > side1 || sum13 > side2){
            throw new IllegalTriangleException();
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
