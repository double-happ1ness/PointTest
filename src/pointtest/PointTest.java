package pointtest;

public class PointTest {
    int pointxCoordinate;
    int pointyCoordinate;
    public PointTest(int xCoordinate, int yCoordinate){
    pointxCoordinate = xCoordinate;  
    pointyCoordinate = yCoordinate;} 
    public String toString() {
     return ("(" + pointxCoordinate + ", " + pointyCoordinate + ")");
}
    public static void main(String[] args){
        int xCoordinate=Input.getInteger("xCoordinate: ");
        int yCoordinate=Input.getInteger("yCoordinate: ");
        PointTest Point = new PointTest(xCoordinate, yCoordinate);
        System.out.println(Point);  


    }
}
