import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int wordCount() {
        System.out.print("[+] Input your word: ");
        String word = new Scanner(System.in).nextLine();
        int count = 1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int wordCount = wordCount();
        System.out.println("Your length of your word is: " + wordCount);
        int[] arr = {14,5,3,6,8,5,3,77};
            int[] sorted = sort(arr);
            System.out.println("Your word is sorted in: " + Arrays.toString(sorted));

    }
}