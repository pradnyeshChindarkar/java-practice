package StringTut;

public class ques1 {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));

    }

    static String defangIPaddr(String address) {
        StringBuilder defaddr = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                defaddr.append("[.]");
            } else {
                defaddr.append(address.charAt(i));
            }
        }
        return defaddr.toString();
    }
}
