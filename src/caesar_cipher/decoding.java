package caesar_cipher;

import java.util.Scanner;
public class decoding {
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
    }