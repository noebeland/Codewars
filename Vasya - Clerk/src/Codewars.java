public class Codewars{

    public static String Tickets(int[] waitingLine) {

        int peopleInLine = waitingLine.length;

        int nbrBillet25 = 0;
        int nbrBillet50 = 0;
        int peopleBill;

        for (int i = 0; i < peopleInLine; i++) {
            peopleBill = waitingLine[i];

            switch (peopleBill) {
                case (25):
                    nbrBillet25++;
                    break;
                case (50):
                    if (nbrBillet25 >= 1) {
                        nbrBillet25--;
                        nbrBillet50++;
                    }else
                        return "NO";
                    break;

                case (100):
                    if (nbrBillet50 >= 1 && nbrBillet25 >= 1) {
                        nbrBillet50--;
                        nbrBillet25--;
                    }else if(nbrBillet25 >= 3){
                        nbrBillet25 -= 3;
                    }else
                        return "NO";
                    break;
            }
        }
        return "YES";
    }

}
