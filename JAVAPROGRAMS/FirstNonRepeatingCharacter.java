package JAVAPROGRAMS;
public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeating(String str) {
        int[] count = new int[256]; 

        for (char c : str.toCharArray()) {
            count[c]++;
        }

        for (char c : str.toCharArray()) {
            if (count[c] == 1) {
                return c;
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        String str = "swiss";
        char result = findFirstNonRepeating(str);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There is no non-repeating character.");
        }
    }
}
