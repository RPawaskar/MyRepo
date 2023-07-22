package com.qspiders.trello.genericutility;

import java.time.LocalDateTime;
/**
 * This class will be used for Java Capabilities.
 * @author SCSE15
 *
 */
public class JavaUtility {
/**
 * 	This method will be used to capture the current date and time of the machine under execution.
 * The time Stamp will be used as the file name for the screenshots.
 * @return SytemDateAndTime
 */
	public String timeStamp() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}
}
