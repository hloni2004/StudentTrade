package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

public class AdminHelper {

public static boolean isNullorEmpty(String s){
    if (s==null||s.isEmpty()){
        return true;
    }
    return false;
    }
public static boolean isValidEmail(String e){
      EmailValidator validator= EmailValidator.getInstance();
        if(validator.isValid(e)){
            return true;
        }
         return false;


}
}
