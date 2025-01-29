package day2stackqueuehashmap.stackandqueueproblems.circulartour;

public class FindStart {
    public int findStartingPoint(Pump[] pumps){
        int start = 0;    // Index of starting pump
        int surplus = 0;  // Tracks the current fuel surplus
        int deficit = 0;  // Stores total fuel shortage

        for (int i = 0; i < pumps.length; i++) {
            surplus += pumps[i].petrol - pumps[i].distance; // Calculate surplus at each pump

            // If surplus becomes negative, current journey fails
            if (surplus < 0) {
                start = i + 1;       // Start at next pump
                deficit += surplus;  // Storing shortage of petrol
                surplus = 0;         // Resetting surplus for the new start
            }
        }

        // If total fuel available is enough to cover total distance, return start
        if (surplus + deficit >= 0){
            return start;
        }
        return -1;
    }
}
