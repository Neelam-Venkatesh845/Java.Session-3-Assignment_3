import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter N value:");
		int N = sc.nextInt();
		double randomNumber = Math.random();
		int randomInt = (int) (N * randomNumber);
		System.out.println(randomInt);

	}

}
