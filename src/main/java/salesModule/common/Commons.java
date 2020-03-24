package salesModule.common;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Commons {

	public static Date currentDate() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		return calendar.getTime();
	}

}
