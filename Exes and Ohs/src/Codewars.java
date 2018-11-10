public class Codewars {

    public static boolean getXO (String str) {

        int amountX = 0;
        int amountO = 0;

        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);

            switch(ch){
                case 'x':
                    amountX++;
                    break;
                case 'X':
                    amountX++;
                    break;
                case 'o':
                    amountO++;
                    break;
                case 'O':
                    amountO++;
                    break;
                default:
                    continue;
            }
        }
        if(amountX == amountO)
            return true;
        else
            return false;
    }
}