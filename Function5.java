
public class Function5 extends Function
{
	@Override
	public double fnValue(double x) {
		return 1/ Math.sin(x);
	}
	
	public String toString() {
		return "1 / sin(x)";
	}
}
