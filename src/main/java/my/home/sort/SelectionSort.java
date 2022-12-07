package my.home.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public List<Integer> sortAtoZ(ArrayList<Integer> lstForSort) {
        List<Integer> result = new ArrayList<>();

        while (lstForSort.size() > 0) {
            int smallestIndex = findSmallest(lstForSort);
            result.add(lstForSort.get(smallestIndex));
            lstForSort.remove(smallestIndex);
        }
        return result;
    }

    private int findSmallest(List<Integer> lstForSort) {
        int smallest = lstForSort.get(0);
        int smallest_idx = 0;
        for (int i = 1; i < lstForSort.size(); i++) {
            if (lstForSort.get(i) < smallest) {
                smallest = lstForSort.get(i);
                smallest_idx = i;
            }
        }
        return smallest_idx;
    }

}
