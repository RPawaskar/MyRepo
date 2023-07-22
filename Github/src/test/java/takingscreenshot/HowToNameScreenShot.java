package takingscreenshot;

import java.time.LocalDateTime;

public class HowToNameScreenShot {
public static void main(String[] args) {
//	LocalDateTime nowMethodReturnType = LocalDateTime.now();
//	System.out.println(nowMethodReturnType);
//	String updateToStringType = nowMethodReturnType.toString();
//	System.out.println(updateToStringType);
//	String updatedString = updateToStringType.replace(':', '-');
//	System.out.println(updatedString);
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	System.out.println(timeStamp);
}
}
