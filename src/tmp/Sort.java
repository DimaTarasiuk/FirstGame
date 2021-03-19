package tmp;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int lastNum = Integer.MIN_VALUE;
        boolean flagGrowSeq = true;
        Scanner parser = new Scanner(userInput.nextLine());
        while (parser.hasNextInt()){
            int tmp = parser.nextInt();
            if (lastNum >= tmp){
                flagGrowSeq = false;
                break;
            }
            lastNum = tmp;
        }
        if (flagGrowSeq)
            System.out.println("Bingo!");
    }
}
