import java.io.*;

public class UMUC_InputDemo {
	public static void main(String[] args) throws IOException {
		int a;
		double b;

		BufferedReader stdin = new BufferedReader (
			new InputStreamReader (System.in));
		System.out.print ("Type the value of a (integer): ");
		a = Integer.parseInt (stdin.readLine());

		System.out.print ("Type the value of b (double): ");
		b = Double.parseDouble (stdin.readLine());

		System.out.println ("a is: " + a);
		System.out.println ("b is: " + b);
	}
}
