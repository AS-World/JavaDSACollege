package Training;

public class RevWords {
    public static String rev(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--) {
            str.append(s.charAt(i));
        }

        return str.toString();
    }
    public static void main(String[] args) {
        String s = "Hi I'm Ayush";
        StringBuilder str = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = 0; i < words.length-1; i++) {
            str.append(rev(words[i]));
            str.append(" ");
        }
        str.append(rev(words[words.length-1]));
        System.out.println(str.toString());
    }
}