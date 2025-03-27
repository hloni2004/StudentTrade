package za.ac.cput.util;

public class ProductHelper {
    public static boolean isNullOrEmpty(String s) {
        if (s.isEmpty()|| s == null)
            return true;
        return false;
    }

    public static boolean isValidPrice(double price) {
        return price > 0;
    }
    public static boolean isValidStatus(String status) {
        return status.equalsIgnoreCase("Available") || status.equalsIgnoreCase("Sold");
    }
}
