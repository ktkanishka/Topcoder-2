public class BinaryCode {

	public String[] decode(String message) {
		String[] s = new String[2];
		String temp;
		Boolean flag = true;
		temp = "00";
		for(int i=0;i<message.length();i++){
			int val = Integer.parseInt(String.valueOf(message.charAt(i))) - (Integer.parseInt(String.valueOf(temp.charAt(temp.length()-2))) + Integer.parseInt(String.valueOf(temp.charAt(temp.length()-1))));
			if(val < 0 || val > 1)
			{
				flag = false;
				break;
			}
			
			temp = temp + String.valueOf(val);
		}
		if(flag == true) {
		s[0] = temp.substring(1, temp.length()-1);
		}
		else {
			s[0] = new String("NONE");
		}
		
		temp = "01";
		flag = true;
		for(int i=0;i<message.length();i++){
			int val = Integer.parseInt(String.valueOf(message.charAt(i))) - (Integer.parseInt(String.valueOf(temp.charAt(temp.length()-2))) + Integer.parseInt(String.valueOf(temp.charAt(temp.length()-1))));
			if(val < 0 || val > 1)
			{
				flag = false;
				break;
			}
			temp = temp + String.valueOf(val);
		}
		if(flag == true) {
			s[1] = temp.substring(1, temp.length()-1);;
		}
			else {
				s[1] = new String("NONE");
			}
		
		
		return s;
	}

}
