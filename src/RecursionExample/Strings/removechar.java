package RecursionExample.Strings;

public class removechar {
    public static void main(String[] args) {
        String s = "badapplehapps";
        remove("", s);
        System.out.println(removesameString(s));
        System.out.println(SkipsubString(s));
        System.out.println(SkipAppnotApple(s));
    }

    static void remove(String Processed, String Unprocessed) {
        if (Unprocessed.isEmpty()) {
            System.out.println(Processed);
            return;
        }
        char ch = Unprocessed.charAt(0);
        if (ch == 'a') {
            remove(Processed, Unprocessed.substring(1));
        } else {
            remove(Processed + ch, Unprocessed.substring(1));
        }
    }

    static String removesameString(String Unprocessed) {
        if (Unprocessed.isEmpty()) {
            return "";
        }
        char ch = Unprocessed.charAt(0);
        if (ch == 'a') {
            return removesameString(Unprocessed.substring(1));
        } else {
            return ch + removesameString(Unprocessed.substring(1));
        }
    }

    static String SkipsubString(String Unprocessed) {
        if (Unprocessed.isEmpty()) {
            return "";
        }

        if (Unprocessed.startsWith("apple")) {
            return SkipsubString(Unprocessed.substring(5));
        } else {
            return Unprocessed.charAt(0) + SkipsubString(Unprocessed.substring(1));
        }
    }
    static String SkipAppnotApple(String Unprocessed) {
        if (Unprocessed.isEmpty()) {
            return "";
        }

        if (Unprocessed.startsWith("app")&&!Unprocessed.startsWith("apple")) {
            return SkipAppnotApple(Unprocessed.substring(3));
        } else {
            return Unprocessed.charAt(0) + SkipAppnotApple(Unprocessed.substring(1));
        }
    }

}
