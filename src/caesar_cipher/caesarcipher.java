package caesar_cipher;

import java.util.Scanner;

public class caesarcipher {
        public static void textEncoding() {
            byte maxSymbols = 120;
            byte spaceFromTableASCII = 32;
            System.out.println("Write the text which you want to encoded : ");
            Scanner readStringFromUsr = new Scanner(System.in);
            String textForEncoding = readStringFromUsr.nextLine();
            System.out.println("Enter the key for encode : ");
            Scanner kayForEncode = new Scanner((System.in));
            int encodeKey = kayForEncode.nextInt();
            String[] wordsFromString = textForEncoding.split("\\s" + " ");
            for (String splitString : wordsFromString) {
                String wordsForEncoding = splitString.toUpperCase();
                char[] strToArray = wordsForEncoding.toCharArray();
                for (int words : strToArray) {
                    if (words > maxSymbols) {
                        int charCod = (words - encodeKey) % maxSymbols;
                        System.out.print((char) charCod);
                    } else if (words == spaceFromTableASCII) {
                        System.out.print((char) words);
                    } else {
                        int charCod = (words - encodeKey);
                        System.out.print((char) charCod);
                    }
                }
            }

        }

        public static void textDecoding() {
            byte maxSymbols = 120;
            byte spaceFromTableASCII = 32;
            System.out.println("Write the text which you want to Decoded : ");
            Scanner decodedText = new Scanner(System.in);
            String textForDecoded = decodedText.nextLine();
            System.out.println("Enter the kay for decode : ");
            Scanner keyForDecode = new Scanner((System.in));
            int decodeKey = keyForDecode.nextInt();
            String[] wordsFromText = textForDecoded.split("\\s" + " ");
            for (String splitString : wordsFromText) {
                String wordsForCoded = splitString.toUpperCase();
                char[] strToArray = wordsForCoded.toCharArray();
                for (int words : strToArray) {
                    if (words > maxSymbols) {
                        int charCod = (words + decodeKey) % maxSymbols;
                        System.out.print((char) charCod);
                    } else if (words == spaceFromTableASCII) {
                        System.out.print((char) words);
                    } else {
                        int charCod = (words + decodeKey);
                        System.out.print((char) charCod);
                    }
                }
            }
        }
    public static void main(String[] args) {

        System.out.println("What you want to do - Encoded or Decoded your text?");
        System.out.println("Press 1 to encoding text");
        System.out.println("Press 2 to decoding text");
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

