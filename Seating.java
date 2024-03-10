//Seating Arrangement of 66 Students in a Classroom
import java.util.*;

public class Seating {
    public static void main(String[] args) {
        // 66 Students {36-Boys and 30-Girls}
        Integer[] boysArray = {1,2,3,6,18,19,20,21,24,26,27,28,33,34,35,37,38,39,41,
                      42,43,44,46,47,48,49,51,52,53,54,55,56,57,63,65,66};
        ArrayList<Integer> boys = new ArrayList<>();
        Collections.addAll(boys, boysArray);

        Integer[] girlsArray = {4,5,7,8,9,10,11,12,13,14,15,16,17,22,23,25,
                       29,30,31,32,36,40,45,50,58,59,60,61,62,64};
        ArrayList<Integer> girls = new ArrayList<>();
        Collections.addAll(girls, girlsArray);

        // Define the size of finalArray based on your loop constraints
        int finalArray[][] = new int[6][12];

        // Populate finalArray
        for (int i = 0; i < 6; i++) {
		    for (int j = 0; j < 4; j++) {
            	if (!boys.isEmpty()) {
                int randomIndex = getRandomIndex(boys.size());
                finalArray[i][j] = boys.get(randomIndex);
                boys.remove(randomIndex); // Remove the assigned student from the list
            	}
		    }
		    for (int j = 4; j < 8; j++) {
            	if (i < 4 && !boys.isEmpty()) {
                int randomIndex = getRandomIndex(boys.size());
                finalArray[i][j] = boys.get(randomIndex);
                boys.remove(randomIndex); // Remove the assigned student from the list
            	}
			    else {
                int randomIndex = getRandomIndex(girls.size());
                finalArray[i][j] = girls.get(randomIndex);
                girls.remove(randomIndex); // Remove the assigned student from the list
            	}
		    }
		    for (int j = 8; j < 12; j++) {
            	if (!girls.isEmpty()) {
                int randomIndex = getRandomIndex(girls.size());
                finalArray[i][j] = girls.get(randomIndex);
                girls.remove(randomIndex); // Remove the assigned student from the list
            	}
        	}
	}

        // Print finalArray for visualization
        System.out.println("*************************** BLACK BOARD **************************");
        System.out.println("^ ^ ^ ^ ^ ^  ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^");
        System.out.println("              BOYS          BOYS(1-4)/GIRLS(5-6)      GIRLS  ");
        for (int i = 0; i < 6; i++) {
            System.out.print(i+1 + "-->" + "\t");
            for (int j = 0; j < 12; j++) {
                System.out.print(finalArray[i][j] + "\t");
                if (j == 3 || j == 7) { // Add tab space after the 2nd column
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // Method to get a random index from the list
    public static int getRandomIndex(int size) {
        Random rand = new Random();
        return rand.nextInt(size);
    }
}
