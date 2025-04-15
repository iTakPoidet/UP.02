import java.util.ArrayList;

public class Calculations {
    static ArrayList<String> availablePeriods(String[] startTimes, int[] prodolzh, int Otrezok, String beginWorking, String endWorking) {
        ArrayList<int[]> busySlots = new ArrayList<>();

        int workingStart = timeToMinutes(beginWorking);
        int workingEnd = timeToMinutes(endWorking);

        for (int i = 0; i < startTimes.length; i++) {
            int start = timeToMinutes(startTimes[i]);
            int end = start + prodolzh[i];
            busySlots.add(new int[]{start, end});
        }

        ArrayList<String> freeIntervals = new ArrayList<>();

        for (int[] slot : busySlots) {
            int start = slot[0];
            int end = slot[1];

            if (workingStart + Otrezok <= start) {
                addFreeInterval(freeIntervals, workingStart, start - Otrezok);
            }
            workingStart = Math.max(workingStart, end);
        }


        if (workingStart + Otrezok <= workingEnd) {
            addFreeInterval(freeIntervals, workingStart, workingEnd);
        }

        return freeIntervals;
    }

    static void addFreeInterval(ArrayList<String> freeIntervals, int start, int end) {
        for (int i = start; i + 30 <= end; i += 30) {
            freeIntervals.add(minutesToTime(i) + "\t-\t" + minutesToTime(i + 30));
        }
    }

    static int timeToMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    static String minutesToTime(int minutes) {
        int hours = minutes / 60;
        int mins = minutes % 60;
        if (mins == 0) {
            return hours + ":00";
        } else {
            return hours + ":" + mins;
        }
    }
}