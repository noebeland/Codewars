public class Codewars{

    public static String camelCase(String str) {
        StringBuilder newString = new StringBuilder();
        String answerString;


        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            char chNext;

            if(i == 0 && ch != ' ') {
                ch = Character.toUpperCase(ch);
                newString.append(ch);

            }else if(ch == ' ' && i != str.length() -1) {

                chNext = Character.toUpperCase(str.charAt(i + 1));
                if(chNext == ' '){
                    continue;
                }else{
                    newString.append(chNext);
                    ++i;
                }


            }else
                newString.append(ch);

        }


        answerString = newString.toString();
        answerString = answerString.replaceAll("\\s+","");
        return answerString;
    }

}