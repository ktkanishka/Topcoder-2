
public class Time {

	/**
	 * @param args
	 */
	
	public String whatTime(int seconds) {
		int minutes,second,hours;
		
		if(seconds == 0) {
			return new String("0:0:0");
		} else {
			hours = seconds / 3600;
			seconds = seconds % 3600;
			
			minutes = seconds / 60;
			seconds = seconds % 60;
			
			return new String(hours+":"+minutes+":"+seconds);
		}
		
 	}
	
	public static void main(String[] args) {
		Time t = new Time();
		System.out.println(t.whatTime(34));
		System.out.println(t.whatTime(56));
		System.out.println(t.whatTime(0));
		System.out.println(t.whatTime(2));
		System.out.println(t.whatTime(123));
		System.out.println(t.whatTime(677));
		

	}

}
