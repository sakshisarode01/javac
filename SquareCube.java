package squareandcube;

class SqCb {
    void insert(long num) 
    {
        long Square = num * num;
        long Cube = num * num * num;
        System.out.println("Square is: " + Square);
        System.out.println("Cube is: " + Cube);
    }
}
public class SquareCube {
 public static void main(String[] args) {
SqCb S1=new SqCb();
S1.insert(5000);
	 }
}
