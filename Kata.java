import java.util.regex.*;   

public class Kata {
  public static boolean validPhoneNumber(String phoneNumber) {
    // TODO: Return whether phoneNumber is in the proper form
    /*
    \\( --- Start with an "("
    (\\d{3}) --- Followed by 3 digits
    \\) --- Have an ")"
    (\\s) --- Have an space
    (\\d{3}) --- Followed by 3 digits.
    (\\-) --- Have a "-" after numeric digits
    (\\d{4}) - Ends with four digits
    */
    Pattern p = Pattern.compile("\\((\\d{3})\\)(\\s)(\\d{3})(\\-)(\\d{4})");
      if (p.matcher(phoneNumber).matches()) {
          return true;
      } else {
          return false;
      }
  }
}