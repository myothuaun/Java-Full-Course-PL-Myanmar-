package module27_exceptionHandling_userDefinedException;

public class NonIntResultException extends Exception {
	int a,b;
	public NonIntResultException(int i,int j) {
		a=i;
		b=j;
	}
	public String toString()
	{
		return "Result of " + a +" / " + b + " is non-integer";
	}

}
