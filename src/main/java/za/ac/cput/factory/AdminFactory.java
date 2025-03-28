package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
import za.ac.cput.util.AdminHelper;

public class AdminFactory {


    public static Admin createAdmin(int adminID, String name, String email, String password) {
       if (AdminHelper.isNullorEmpty(name)||AdminHelper.isNullorEmpty(password)||AdminHelper.isNullorEmpty(email)){
           return null;
       }
       if (!AdminHelper.isValidEmail(email)){
           return null;
       }
       return new Admin.Builder().setAdminID(adminID).setName(name).setEmail(email).setPassword(password).build();





    }


}
