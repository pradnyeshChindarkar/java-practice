
public class SearchInString {
    public static void main(String[] args) {
        String str = "Pradnyesh";
        char chtr = 'r';

        if (searchIn(str, chtr) && searchIn2(str, chtr)) {
            System.out.println("Character exists");
        }
        else{
            System.out.println("Does not exists");
        }

    }

    static boolean searchIn(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean searchIn2(String str,char c){
        for(char i: str.toCharArray()){
            if (i == c) {
                return true;
            }
        }
        return false;
    }
}
