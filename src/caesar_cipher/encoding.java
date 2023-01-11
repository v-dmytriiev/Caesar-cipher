package caesar_cipher;

import java.util.Scanner;
public class encoding {
    public static void textEncoding(){

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

}
