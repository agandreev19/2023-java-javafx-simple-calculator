public class StringManipulator {
    public String Reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String Truncate(String s, int length) {
        if (s == null || length < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        if (s.length() <= length) {
            return s;
        }
        return s.substring(0, length);
    }
}