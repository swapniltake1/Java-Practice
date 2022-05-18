package Interface;

public class multiply  implements Calculator {

	@Override
	public String services(int a, int b) {
		// TODO Auto-generated method stub
		// return String.valueOf(a*b);
		 int c=a*b;
			return "  " +c;
	
}
}