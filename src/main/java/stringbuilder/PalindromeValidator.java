package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindromeMy(String world) {
        if (world == null) {
            throw new IllegalArgumentException("A szöveg nem lehet null!");
        }
        world = world.toLowerCase().trim();
        if (world.equals("")) {
            return true;
        }
        for (int i = 0; i < (world.length() / 2 + 1); i++) {
            if (world.charAt(i) == world.charAt(world.length() - 1 - i)) {
                continue;
            }
            return false;
        }
        return true;
    }

    public boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("A szöveg nem lehet null!");
        }
        text = text.trim();
        StringBuilder sb = new StringBuilder(text);
        return text.equalsIgnoreCase(sb.reverse().toString());
    }

}