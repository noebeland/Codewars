public class Codewars{

    public static String encrypt(final String text, final int n) {

        StringBuilder encryptedText = new StringBuilder();
        String returnEncryptedString;
        StringBuilder evenNumber = new StringBuilder();

        if(n <= 0){
            return text;
        }

        for(int i = 0; i <text.length(); i++){
            char ch = text.charAt(i);
            if(i % 2 != 0){
                encryptedText.append(ch);
            }else{
                evenNumber.append(ch);
            }
        }
        encryptedText = encryptedText.append(evenNumber);
        returnEncryptedString = encryptedText.toString();

        return encrypt(returnEncryptedString, n-1);
    }

    public static String decrypt(final String encryptedText, final int n) {

        StringBuilder decryptedText = new StringBuilder();
        String returnDecryptedText;

        if(n <= 0){
            return encryptedText;
        }

        int lengthOfDecryptedText = encryptedText.length();
        int halfLength = lengthOfDecryptedText / 2;

        for(int i = 0; i < halfLength; i++){

            decryptedText.append(encryptedText.charAt(halfLength + i));
            decryptedText.append(encryptedText.charAt(i));
        }
        if(lengthOfDecryptedText % 2 == 1){
            decryptedText.append(encryptedText.charAt(lengthOfDecryptedText -1));

        }

        returnDecryptedText = decryptedText.toString();
        return decrypt(returnDecryptedText, n-1);

    }

}