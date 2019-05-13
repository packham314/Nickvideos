
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 0;
		
		while (n <= 100) {
			System.out.println(n);
			n += 2;
		} 
		System.out.println("----------------------");
		
		int x = 100; 
		
		while (x-- >= 0){
			if (x % 3 == 0) {
				System.out.println(x);
			}
		}
		System.out.println("-----------------------");
		for (int m = 1; m < 100; m++)
			if( m % 2 == 1) {
				System.out.println("Every other number: " + m);
			}
		System.out.println("-----------------------");
		
		for (int j = 0; j < 100; j++) {
				if (j % 3 == 0 && j % 5 == 0) { 
					System.out.println("Hello World");
				} else if (j % 3 == 0) {
					System.out.println("Hello");
				} else if (j % 5 == 0) {
					System.out.println("World");
				} else { 
					System.out.println(j);
			
			}
		}

	}

}
