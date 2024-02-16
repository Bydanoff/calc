public class g {
    public static void main (String... av) {

        String s = "  --abc  678 .. Z";
        s = s.toUpperCase();

        System.out.println("End "+delNoDigOrLet(s));
    }

    private static String delNoDigOrLet (String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character .isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}