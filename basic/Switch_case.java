import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int day=sc.nextInt();
		switch(day) {
		case '1':
			System.out.println("monday");
			break;
		case '2':
			System.out.println("tuesday");
			break;
		case '3':
			System.out.println("wedday");
			break;
		case '4':
			System.out.println("thrusday");
			break;
		case '5':
			System.out.println("Friday");
			break;
		default:
			System.out.println("weekend");
		}

	}

}
