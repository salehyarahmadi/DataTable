package ir.androidexception.datatable.utility;

public class Util {
    private static final String[] englishNumbers = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final String[] persianNumbers = new String[]{"۰", "۱", "۲", "۳", "۴", "۵", "۶", "۷", "۸", "۹"};

    public static String convertToPersianNumbers(String s){
        if(s!=null) {
            String tmp = s;
            tmp = tmp.replaceAll(englishNumbers[0], persianNumbers[0]);
            tmp = tmp.replaceAll(englishNumbers[1], persianNumbers[1]);
            tmp = tmp.replaceAll(englishNumbers[2], persianNumbers[2]);
            tmp = tmp.replaceAll(englishNumbers[3], persianNumbers[3]);
            tmp = tmp.replaceAll(englishNumbers[4], persianNumbers[4]);
            tmp = tmp.replaceAll(englishNumbers[5], persianNumbers[5]);
            tmp = tmp.replaceAll(englishNumbers[6], persianNumbers[6]);
            tmp = tmp.replaceAll(englishNumbers[7], persianNumbers[7]);
            tmp = tmp.replaceAll(englishNumbers[8], persianNumbers[8]);
            tmp = tmp.replaceAll(englishNumbers[9], persianNumbers[9]);
            return tmp;
        }
        else return "";
    }

    public static String convertToEnglishNumbers(String s){
        if(s!=null) {
            String tmp = s;
            tmp = tmp.replaceAll(persianNumbers[0], englishNumbers[0]);
            tmp = tmp.replaceAll(persianNumbers[1], englishNumbers[1]);
            tmp = tmp.replaceAll(persianNumbers[2], englishNumbers[2]);
            tmp = tmp.replaceAll(persianNumbers[3], englishNumbers[3]);
            tmp = tmp.replaceAll(persianNumbers[4], englishNumbers[4]);
            tmp = tmp.replaceAll(persianNumbers[5], englishNumbers[5]);
            tmp = tmp.replaceAll(persianNumbers[6], englishNumbers[6]);
            tmp = tmp.replaceAll(persianNumbers[7], englishNumbers[7]);
            tmp = tmp.replaceAll(persianNumbers[8], englishNumbers[8]);
            tmp = tmp.replaceAll(persianNumbers[9], englishNumbers[9]);
            return tmp;
        }
        else return "";
    }
}
