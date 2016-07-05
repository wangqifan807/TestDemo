package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Long beginTime  = sdf.parse("2008-12-12").getTime();
			Long endTime  = sdf.parse("2008-12-21").getTime(); 
			System.out.println(beginTime>endTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
