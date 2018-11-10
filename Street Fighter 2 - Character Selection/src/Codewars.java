import java.util.ArrayList;

public class Codewars{
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
        int columns = fighters[0].length;
        int currentIndex = 0;
        ArrayList<String> hoveredFighters = new ArrayList<>();

        for(int k = 0; k < moves.length; k++){
            if(moves[k] == "left"){
                if(position[1] == 0)
                    position[1] = columns-1;
                else
                    --position[1];
                hoveredFighters.add(fighters[position[0]][position[1]]);
                currentIndex++;

             }else if(moves[k] == "right"){
                if(position[1] == columns-1)
                    position[1] = 0;
                else
                    ++position[1];
                hoveredFighters.add(fighters[position[0]][position[1]]);
                currentIndex++;

            }else if(moves[k] == "up") {
                if(position[0] == 0)
                    hoveredFighters.add(fighters[position[0]][position[1]]);
                else {
                    --position[0];
                    hoveredFighters.add(fighters[position[0]][position[1]]);
                }
                currentIndex++;
            }else if(moves[k] == "down") {
                if (position[0] == 1)
                    hoveredFighters.add(fighters[position[0]][position[1]]);
                else {
                    ++position[0];
                    hoveredFighters.add(fighters[position[0]][position[1]]);
                }
                currentIndex++;
            }
      }
        String[] resultArray = hoveredFighters.toArray(new String[currentIndex]);
        return resultArray;
    }
}

