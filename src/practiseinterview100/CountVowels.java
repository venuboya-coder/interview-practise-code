package practiseinterview100;

public class CountVowels {
    public static void main(String[] args) {
        String input = "automationcode";
        int count = 0;

        for(char c : input.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c) != -1){
                count++;
            }
        }
        System.out.println("Number of vowels in the string " +input+ " is: " + count);
    }
}
