package module27_exceptionHandling_userDefinedException;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nume [] = {10,20,30,40,50,60};
		int deno [] = { 3, 0, 4, 6};
		for(int i = 0 ; i < nume.length;i++) {
			try {
				if((nume[i]%deno[i]) != 0) {
				throw new NonIntResultException(nume[i],deno[i]);
				
				}
				System.out.println(nume[i]+"/"+deno[i]+"="+nume[i]/deno[i]);
			}catch(ArithmeticException exe){
				System.out.println("Can't divideb by Zero!");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("No matching element found!");
			} catch (NonIntResultException exe) {
				// TODO Auto-generated catch block
				System.out.println(exe);
			}
	}
	}
}
