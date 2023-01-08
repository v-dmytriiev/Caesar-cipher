package caesar_cipher;

import java.util.Scanner;

public class caesarcipher {
        public static void textEncoding() {
            System.out.println("Write the text which you want to coded : ");
            Scanner readStringFromUsr = new Scanner(System.in);
            String textForEncoding = readStringFromUsr.nextLine();
            System.out.println("Enter the encryption kay : ");
            Scanner encryptionKay = new Scanner((System.in));
            int encryptKay = encryptionKay.nextInt();
            String[] wordsFromString = textForEncoding.split("\\s" + " ");
            for (String splitString : wordsFromString) {
                String wordsForEncoding = splitString.toUpperCase();
                char[] strToArray = wordsForEncoding.toCharArray();
                for (int words : strToArray) {
                    if (words > 120) {
                        int charCod = (words - encryptKay) % 120;
                        System.out.print((char) charCod);
                    } else if (words == 32) {
                        System.out.print((char) words);
                    } else {
                        int charCod = (words - encryptKay);
                        System.out.print((char) charCod);
                    }
                }
            }

        }

        public static void textDecoding() {
            System.out.println("Write the text which you want to Decoded : ");
            Scanner decodedText = new Scanner(System.in);
            String textForDecoded = decodedText.nextLine();
            System.out.println("Enter the encryption key : ");
            Scanner decodeKay = new Scanner((System.in));
            int kayForDecoded = decodeKay.nextInt();
            String[] wordsFromText = textForDecoded.split("\\s" + " ");
            for (String splitString : wordsFromText) {
                String wordsForCoded = splitString.toUpperCase();
                char[] strToArray = wordsForCoded.toCharArray();
                for (int Words : strToArray) {
                    if (Words > 120) {
                        int Number = (Words + kayForDecoded) % 120;
                        System.out.print((char) Number);
                    } else if (Words == 32) {
                        System.out.print((char) Words);
                    } else {
                        int Number = (Words + kayForDecoded);
                        System.out.print((char) Number);
                    }
                }
            }
        }
    public static void main(String[] args) {

        System.out.println("What you want to do - Coded or Decoded text?");
        System.out.println("Press 1 to encrypt text");
        System.out.println("Press 2 to decode the text");
        Scanner userChoice = new Scanner(System.in);
        String choice = userChoice.nextLine();

        if(choice.equals("1")) {
            textEncoding();
        } else if (choice.equals("2")) {
            textDecoding();
        }else
            System.out.println("Wrong parameter!");
    }

}

