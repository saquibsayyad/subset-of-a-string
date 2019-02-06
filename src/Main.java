public class Main {

    public static void main(String[] args) {
        String input = "abc";
        Main.combinations(input, new StringBuffer(), 0);

    }


    private static void combinations(String input, StringBuffer buff, int pos) {
        for(int i=pos; i<input.length();++i) {
            buff.append(input.charAt(i));
            System.out.println(buff);
            combinations(input, buff, i +1);
            buff.deleteCharAt(buff.length()-1);
        }
    }
}
