package caesar_cipher;

import java.util.Scanner;

public class СaesarСipher {
    public static void main(String[] args) {

        System.out.println("What you want to do - Coded or Decoded text?");
        System.out.println("Press 1 to encrypt text");
        System.out.println("Press 2 to decode the text");
        Scanner Userchoice = new Scanner(System.in);
        String Choice = Userchoice.nextLine();

        switch (Choice) {
            case "1":
                System.out.println("Write the text which you want to coded : ");
                Scanner ReadStringfromUsr = new Scanner(System.in);
                String Textforcoded = ReadStringfromUsr.nextLine();
                System.out.println("Enter the encryption key : ");
                Scanner Encryptionkey = new Scanner((System.in));
                int Encryptkay = Encryptionkey.nextInt();
                String[] WordsfromString = Textforcoded.split("\\s" + " ");
                for (String splitString : WordsfromString) {
                    String Wordsforcoded = splitString.toUpperCase();
                    char[] strToArray = Wordsforcoded.toCharArray();
                    for (int Words : strToArray) {
                        if (Words > 120) {
                            int o = (Words - Encryptkay) % 120;
                            System.out.print((char) o);
                        } else if (Words == 32) {
                            System.out.print((char) Words);
                        } else {
                            int o = (Words - Encryptkay);
                            System.out.print((char) o);
                        }
                    }
                }
                break;
            case "2":
                System.out.println("Write the text which you want to Decoded : ");
                Scanner Decodedtext = new Scanner(System.in);
                String Textfordecoded = Decodedtext.nextLine();
                System.out.println("Enter the encryption key : ");
                Scanner Decodekay = new Scanner((System.in));
                int Kayfordecodet = Decodekay.nextInt();
                String[] Wordsfromtext = Textfordecoded.split("\\s" + " ");
                for (String splitString : Wordsfromtext) {
                    String Wordsforcoded = splitString.toUpperCase();
                    char[] strToArray = Wordsforcoded.toCharArray();
                    for (int Words : strToArray) {
                        if (Words > 120) {
                            int Number = (Words + Kayfordecodet) % 120;
                            System.out.print((char) Number);
                        } else if (Words == 32) {
                            System.out.print((char) Words);
                        } else {
                            int Number = (Words + Kayfordecodet);
                            System.out.print((char) Number);
                        }
                    }
                }
                break;
            default:
                System.out.println("Wrong parameter!");
        }

    }
}

