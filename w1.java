public class Main {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] words = s.trim().split("\\s+"); 
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        String reversed = sb.toString();
        System.out.println(reversed);
