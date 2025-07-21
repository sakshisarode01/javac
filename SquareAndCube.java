package square;
  class SQC{
	void insert(long num)
	{
		long Square=num*num;
		long Cube=num*num*num;
		System.out.println("Square is:"+Square);
		System.out.println("Cube is:"+Cube);
	}
	}
public class SquareAndCube {
	public static void main(String[] args)
	{
	SQC s1=new SQC();
	s1.insert(5000);
}
}
