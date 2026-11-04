
public class AmbitodeVariable {
	
	int x = 7;
	
	public void main (String[] args) {
		
		int y = 6;
		System.out.println(x);
		System.out.println(y);
		
		{
			int z = 8;
			int x = 3;
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			
		}
		{
			int z = -8;
			int x = 4;
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			
		}
		
		System.out.println(x);
		System.out.println(y);
	}
}

