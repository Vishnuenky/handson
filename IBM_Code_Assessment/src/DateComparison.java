import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateComparison {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		//compare two dates
		
		String date1="7/3/2003";
		String date2="07/3/2003";
		SimpleDateFormat sfd = new SimpleDateFormat("dd/mm/yyyy");
		Date d1 = sfd.parse(date1);
		Date d2 = sfd.parse(date2);
		
		System.out.println(d1);
		
		if(d1.compareTo(d2)<0) {
			System.out.println("Date1 is lesser than Date2");
		}else if(d1.compareTo(d2)>0) {
			System.out.println("Date1 is greater than Date2");
		}else if(d1.compareTo(d2)==0) {
			System.out.println("Date1 is equal to Date2");
		}
		
		
		//Find whether the given date is existing between the range
		String start_date="7/3/2003";
		String end_date="07/3/2003";
		String current_date = "4/6/2012";
		
		Date sDate = sfd.parse(start_date);
		Date eDate = sfd.parse(end_date);
		Date cDate = sfd.parse(current_date);
		
		if(cDate.compareTo(sDate)>=0 && cDate.compareTo(eDate)<=0 ) {
			System.out.println("Current Date lies within the given date range");
		}else {
			System.out.println("Current Date doesnot lies within the given date range");
		}
		
		
		
		// Find age from DOB
		String birth = "16/11/1999";
		Date dob = sfd.parse(birth);
		
		Calendar date_of_birth = Calendar.getInstance();
		date_of_birth.setTime(dob);
		
		Calendar todays_date = Calendar.getInstance();
		todays_date.setTime(new Date());
		
		int age = todays_date.get(Calendar.YEAR) - date_of_birth.get(Calendar.YEAR);
		
		System.out.println(age);
		
		
		//else
		
		LocalDate today = LocalDate.now();
		LocalDate db = LocalDate.of(1999, 11, 16);
		
		System.out.println(Period.between(db, today).getYears());//this is given perfect age
		
		
		
		
		//Arrange Date in ascending order
		String[] str = {"28/09/1991","12/12/1972","24/05/1978","08/03/1999"};
		String temp="";
		
		List<Date> j = new ArrayList<Date>();
		
		
		
		for(int i=0;i<str.length;i++) {
			Date a = sfd.parse(str[i]);  //String s=sfd.format(a); --to print date in particular format
			
			j.add(a);
		}
		
		
		System.out.println(j);
		
		
		/*
		 * for(int i=0;i<str.length;i++) { for(int j=1;j<str.length;j++) { Date dd =
		 * sfd.parse(str[i]); Date dtemp = sfd.parse(str[j]); if(dd.compareTo(dtemp)<0)
		 * { temp=str[i]; str[i]=str[j]; str[j]=temp; } } }
		 */
		
		

	}

}
