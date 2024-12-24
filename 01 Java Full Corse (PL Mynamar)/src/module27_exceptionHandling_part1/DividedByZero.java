package module27_exceptionHandling_part1;

public class DividedByZero {
	public static void main(String [] args) {
		int nume [] = {10,20,30,40,50};
		int deno [] = {10,0,30,0};
		for(int i = 0 ; i < nume.length;i++) {
			try {
				System.out.println(nume[i]+"/"+deno[i]+"="+nume[i]/deno[i]);
			}catch(ArithmeticException ArrayIndexOutOfBoundsException){
				System.out.println("Can't divideb by Zero!");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("No matching element found!");
			}
//			finally {
//				System.out.println("Exit Try...Catch!");
//			}
			
		}
		
	}

}
