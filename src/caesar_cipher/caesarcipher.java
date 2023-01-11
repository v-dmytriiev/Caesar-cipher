package caesar_cipher;

import java.util.Scanner;
public class caesarcipher {


    public static void main(String[] args) {

        System.out.println("What you want to do - Encoded or Decoded your text?");
        System.out.println("Press 1 to encoding text");
        System.out.println("Press 2 to decoding text");
        Scanner userChoice = new Scanner(System.in);
        String choice = userChoice.nextLine();

        if(choice.equals("1")) {
            encoding.textEncoding();
        } else if (choice.equals("2")) {
            decoding.textDecoding();
        }else
            System.out.println("Wrong parameter!");
    }

}

