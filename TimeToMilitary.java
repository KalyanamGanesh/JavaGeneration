// Given a time at 12-hour AM/PM format, convert it to military (24-hour) time.
// Note: Midnight is 12:00:00 AM on a 12-hour clock and 00:00:00 on a 24-hour clock. Noon is 12:00:00 PM on 12-hour clock and 12:00:00 on 24-hour clock
// And share GitHub link.

import java.util.Scanner;

public class TimeToMilitary {
    public static String timeToMilitary(String time12) {
        int hours = Integer.parseInt(time12.substring(0, 2));
        int minutes = Integer.parseInt(time12.substring(3, 5));
        int seconds = Integer.parseInt(time12.substring(6, 8));

        String AmPm = time12.substring(9);
        if (AmPm.equalsIgnoreCase("PM") && hours != 12) {
            hours += 12;
        } else if (AmPm.equalsIgnoreCase("AM") && hours == 12) {
            hours = 0;
        }
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in normal format like AM/PM:");
        String time12 = sc.nextLine();
        sc.close();
        String militaryTime = timeToMilitary(time12);
        System.out.println(militaryTime);
    }
}
