package algorithms;

public class StringUtils {


    public static boolean areCircularPermuted (String s1, String s2) {

        //mare
        //rema

        if (s1.length()!=s2.length()){
            return false;
        }
        String s = s1+s2; //marerema
        s1+=s1;

        return s1.contains(s2);
    }
}
