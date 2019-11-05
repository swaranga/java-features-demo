package org.java.features.demo.switch_expressions;

import java.time.LocalDate;

public class Java8 {
    public static void main(String[] args) {
        System.out.println(dayName(LocalDate.now().getDayOfWeek().getValue()));
        System.out.println(workDayType(LocalDate.now().getDayOfWeek().getValue()));
    }
    
    private static String dayName(int day) {
        String dayName = null;
        switch (day) {
            case 0: 
                dayName = "Monday";
                break;
            case 1: 
                dayName = "Tuesday";
                break;
            case 2: 
                dayName = "Wednesday";
                break;
            case 3: 
                dayName = "Thursday";
                break;
            case 4: 
                dayName = "Friday";
                break;
            case 5: 
                dayName = "Saturday";
                break;
            case 6: 
                dayName = "Sunday";
                break;
            
            default:
                throw new IllegalArgumentException("Invalid day");
        };
        
        return dayName;
    }
    
    private static String workDayType(int day) {
        String workDayType = null;
        switch (day) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                workDayType = "Weekday";
                break;
            case 6:
            case 7:
                workDayType = "Weekend";
                break;
            
            default: throw new IllegalArgumentException("Invalid day");
        };
        
        return workDayType;
    }
}
