public class WeightSort {

    public static String orderWeight(String strng) {
        String [] myArrayString = strng.split(" ");
        int [] myArrayInteger = new int [myArrayString.length];
        for(int i = 0; i<myArrayString.length; i++){
            int mySum=0;
            for(int k = 0; k<myArrayString[i].length(); k++){
                String myCharacter = String.valueOf(myArrayString[i].charAt(k));
                mySum = mySum + Integer.parseInt(myCharacter);
            }
            myArrayInteger[i] = mySum;
        }
        int min = myArrayInteger[0];
        for(int i = 1; i < myArrayInteger.length; i++){
            if(myArrayInteger[i]<min){
                min=myArrayInteger[i];
            }
        }
        
        return null;
    }
}
