package my.home.search;

import java.util.List;
import java.util.Objects;

public class BinarySearch {

    public Integer searchInList(List<Integer> inputList, Integer desired) {

        int low = 0;
        int high = inputList.size() - 1;
        int count = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            Integer guess = inputList.get(mid);
            System.out.println("mid = [" + mid + "] = " + guess);

            if (guess.equals(desired)) {
                return mid;
            } else if (guess > desired) {
                high = high - 1;
            } else {
                low = mid + 1;
            }
            count++;
            System.out.println("progonov = " + count);
        }

        return null;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String testFieldParent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinarySearch that = (BinarySearch) o;
        return Objects.equals(testFieldParent, that.testFieldParent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testFieldParent);
    }

    public Integer searchInList(List<Integer> lst, int iskomoe) {
        int min = 0;
        int max = lst.size() - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            int guess = lst.get(mid);

            if (guess == iskomoe) {
                return mid;
            } else if (guess < mid) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }

        }


        return null;
    }
}
