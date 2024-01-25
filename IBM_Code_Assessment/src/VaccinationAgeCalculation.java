import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class VaccinationAgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aadhar ="2341567854";
		Scanner sc = new Scanner(System.in);
		String dateStr = "8/3/1999";
		
//		SimpleDateFormat sdf = new SimpleDateFormat("3/12/1972");
//		Date d = sdf.parse(dateStr);
		
		String combodity = "yes";
		
		String[] s = dateStr.split("/");
		//System.out.println(Arrays.toString(s));
		
		int year = 2023- Integer.parseInt(s[2]);
		
		
		int mon = Integer.parseInt(s[1]);
		int date = Integer.parseInt(s[0]);
		if(mon>=3) {
			if(date>=8) {
				System.out.println(year);
			}else if(date<8){
				System.out.println(year-1);
			}
		}else if(mon<3) {
			if(date<8) {
				System.out.println(year-1);
			}
		}

	}

}
