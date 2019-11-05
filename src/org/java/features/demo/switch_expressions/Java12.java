package org.java.features.demo.switch_expressions;

import java.time.LocalDate;

/**
 * preview in JDK 12
 *
 */
public class Java12 {
    public static void main(String[] args) {
        System.out.println(dayName(LocalDate.now().getDayOfWeek().getValue()));
        System.out.println(workDayType(LocalDate.now().getDayOfWeek().getValue()));
    }
    
    private static String dayName(int day) {
        return switch (day) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            
            default -> throw new IllegalArgumentException("Invalid day");
        };
    }
    
    private static String workDayType(int day) {
        return switch (day) {
            case 0, 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            
            default -> throw new IllegalArgumentException("Invalid day");
        };
    }
}
