class Solution {
    // Number of days in each month for a non-leap year
    private final int[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int daysBetweenDates(String date1, String date2) {
        // Calculate total days from base year (1900) for both dates
        int days1 = daysFrom1900(date1);
        int days2 = daysFrom1900(date2);

        // Return the positive difference between the two counts
        return Math.abs(days1 - days2);
    }

    // Helper method to count total days from 1900-01-01 to the given date
    private int daysFrom1900(String date) {
        // Extract year, month, and day from string (Format: YYYY-MM-DD)
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int totalDays = 0;

        // 1. Add days for all full years from 1900 up to the target year
        for (int y = 1900; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }

        // 2. Add days for all full months in the current year
        for (int m = 1; m < month; m++) {
            totalDays += DAYS_IN_MONTH[m];
            // Add 1 extra day if it is February of a leap year
            if (m == 2 && isLeapYear(year)) {
                totalDays += 1;
            }
        }

        // 3. Add remaining days of the current month
        totalDays += day;

        return totalDays;
    }

    // Helper method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}