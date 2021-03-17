package Controllers;

import Models.Services;
import Models.Villa;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRegex {
    private Pattern pattern;
    private Matcher matcher;
    public static final String REGEX_ID = "^SV+(VL|HO|RO)+[0-9]{4}$";
    public static final String REGEX_NAME_SERVICE = "^[A-Z]\\w+$";
    public static final String REGEX_AREA_USED = "^[3-9]\\d.\\d+";
    public static final String REGEX_NUMBER_OF_PEOPLE = "^(1|2)[0-9]";
    public static final String REGEX_ACCOMPANIED_SERVICE = "^(massage |karaoke|food|car)";
    public static final String REGEX_NUMBER_FLOOR= "^[1-40]";
    public static final String REGEX_BIRTHDAY= "^((0)[1-9]|(1|2)[0-9]|(3)(0|1))(/|.)((0)[0-9]|(1)[0-2](/|.)((1)(9)[0-9][0-9]|(2)(0)[0][0-3])$";


    boolean checkId(String string,String regex){
        pattern=Pattern.compile(regex);
        matcher=pattern.matcher(string);
        return  matcher.matches();
    }
    boolean checkNameService(String string,String regex) {
     pattern=Pattern.compile(regex);
     matcher=pattern.matcher(string);
     return matcher.matches();
    }
}
