import java.util.Scanner;
public class ArrayManipulation {
    // Method to add a new element into a 2D array (array of array of String)
    public static String[][] add_element_2Darray(String[][] oldArray, String[]
            newElement) {
        int elements = oldArray.length;
        String[][] newArray = new String[elements+1][5];
        if(oldArray.length>0)
        {
            for(int i=0; i<elements; i++) {
                newArray[i] = oldArray[i];
            }
            newArray[elements] = newElement;
        } else
            newArray[0] = newElement;
        return newArray;
    }
    // Method to "transform" an array into an ArrayList (both containing String)
    public static ArrayList<String> Array2ArrayList(String[] array) {
        return new ArrayList<String>(Arrays.asList(array));
    }
    // Method to "transform" an ArrayList into an array (both containing String)
    public static String[] ArrayList2Array(ArrayList<String> strList) {
        String[] array = strList.toArray(new String[0]);
        return array;
    }
}
