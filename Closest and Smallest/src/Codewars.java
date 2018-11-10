import java.lang.Math;

class Codewars {
    public static int[][] closest(String strng) {

        String[] everyNum = strng.split(" ");
        StringBuilder tempWeights = new StringBuilder();
        int weights = 0;
        String temporary;
        String[] finalWeightsArray;
        String eachNum;

        int smallestDiff = 0;
        int indexSecond = 0;
        int indexFirst = 0;

        int value;

        int currentIndexSecond = 0;
        int currentIndexFirst = 0;

        int currentSmallestDiff = 0;



        for (int i = 0; i < everyNum.length; i++) {
            eachNum = everyNum[i];

            for (int j = 0; j < eachNum.length(); j++) {
                weights += Character.getNumericValue(eachNum.charAt(j));
            }
            tempWeights.append(Integer.toString(weights));
            tempWeights.append(' ');
            weights = 0;

        }
        temporary = tempWeights.toString();
        finalWeightsArray = temporary.split(" ");

        for (int k = 0; k < finalWeightsArray.length; k++) {
            int currentWeight = Integer.parseInt(finalWeightsArray[k]);

            for (int l = k; l < finalWeightsArray.length; l++) {
                if (l == 0) {
                    smallestDiff = Integer.parseInt(finalWeightsArray[k]);
                }
                if (l != finalWeightsArray.length - 1) {
                    value = Math.abs(Integer.parseInt(finalWeightsArray[l + 1]) - currentWeight);

                    if (value < smallestDiff) {
                        smallestDiff = value;
                        indexSecond = l + 1;//p-t +1
                        indexFirst = k;

                    } else if (value == smallestDiff) {
                        if (Integer.parseInt(finalWeightsArray[indexFirst]) > Integer.parseInt(finalWeightsArray[l + 1])) {
                            smallestDiff = value;
                            indexSecond = l + 1;
                            indexFirst = k;

                        }
                    }
                } else if (k != 0 && l == finalWeightsArray.length - 1) {
                    for (int m = 0; m < k; m++) {
                        value = Math.abs(Integer.parseInt(finalWeightsArray[m]) - currentWeight);
                        if (value < smallestDiff) {
                            smallestDiff = value;
                            indexSecond = m;
                            indexFirst = k;
                        }
                    }
                }
            }
            if (k == 0) {
                currentSmallestDiff = smallestDiff;
                currentIndexSecond = indexSecond;
                currentIndexFirst = indexFirst;
            }

            if (smallestDiff < currentSmallestDiff) {
                currentSmallestDiff = smallestDiff;
                currentIndexSecond = indexSecond;
                currentIndexFirst = indexFirst;

            } else if (smallestDiff == currentSmallestDiff) {
                if (Integer.parseInt(finalWeightsArray[indexSecond]) < Integer.parseInt(finalWeightsArray[currentIndexSecond])) {
                    currentSmallestDiff = smallestDiff;
                    currentIndexSecond = indexSecond;
                    currentIndexFirst = indexFirst;
                }
            }


        }
        if ((Integer.parseInt(finalWeightsArray[currentIndexSecond]) < Integer.parseInt(finalWeightsArray[currentIndexFirst]))) {
            int smallest = currentIndexSecond;
            int largest = currentIndexFirst;

            int[][] result = {{Integer.parseInt(finalWeightsArray[smallest]), smallest, Integer.parseInt(everyNum[smallest])}, {Integer.parseInt(finalWeightsArray[largest]), largest, Integer.parseInt(everyNum[largest])}};
            return result;


        } else if ((Integer.parseInt(finalWeightsArray[currentIndexSecond]) == Integer.parseInt(finalWeightsArray[currentIndexFirst]))) {
            if (currentIndexSecond < currentIndexFirst) {
                int smallest = currentIndexSecond;
                int largest = currentIndexFirst;
                int[][] result = {{Integer.parseInt(finalWeightsArray[smallest]), smallest, Integer.parseInt(everyNum[smallest])}, {Integer.parseInt(finalWeightsArray[largest]), largest, Integer.parseInt(everyNum[largest])}};
                return result;

            }else{
                int smallest = currentIndexSecond;
                int largest = currentIndexFirst;
                int[][] result = {{Integer.parseInt(finalWeightsArray[largest]), largest, Integer.parseInt(everyNum[largest])}, {Integer.parseInt(finalWeightsArray[smallest]), smallest, Integer.parseInt(everyNum[smallest])}};
                return result;
            }

        } else if((Integer.parseInt(finalWeightsArray[currentIndexSecond]) > Integer.parseInt(finalWeightsArray[currentIndexFirst]))) {
                int smallest = currentIndexFirst;
                int largest = currentIndexSecond;
                int[][] result = {{Integer.parseInt(finalWeightsArray[smallest]), smallest, Integer.parseInt(everyNum[smallest])}, {Integer.parseInt(finalWeightsArray[largest]), largest, Integer.parseInt(everyNum[largest])}};
                return result;
            }
        return null;
        }
}




