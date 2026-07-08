package StringTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ques4 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(ruleKey=="color");

        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));

        System.out.println(countMatches(items, ruleKey, ruleValue));

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> list : items) {
            if (ruleKey == "type" && list.get(0).equals(ruleValue)) {
                count++;
            } else if (ruleKey == "color" && list.get(1).equals(ruleValue)) {
                count++;
            } else if (ruleKey == "name" && list.get(3).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
