package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;

public class Helper {
    public static boolean isNullOrEmpty(String value) {
        if(value == null || value.isEmpty())
            return true;
        return false;
    }
    public static boolean validateInt(int i) {
        if(i<=0 || i>1000)
            return false;
        return true;
    }
    public static boolean validateDouble(double d) {
        if(d <= 0.0 || d > 1000000.0)
            return false;
        return true;
    }
    public static boolean isValidEmail(String email){

        EmailValidator validator =  EmailValidator.getInstance();
        if(validator.isValid(email)){
            return true;
        }else{
            return false;
        }
    }
    public static LocalDate getDateOfBirth(String id ) {
        int year = Integer.parseInt(id.substring(0, 4));
        int month = Integer.parseInt(id.substring(4, 6));
        int day = Integer.parseInt(id.substring(6, 8));
        LocalDate date = LocalDate.of(year,month,day);
        return date;
    }
}
