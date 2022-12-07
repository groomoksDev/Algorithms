package my.home;

import my.home.search.BinarySearch;
import my.home.sort.QuickSort;
import my.home.sort.SelectionSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Algorithms {

    public static void main(String[] args) {
        SpringApplication.run(Algorithms.class);
        binartSearchStart(10, 8);
        selectionSort(Arrays.asList(4, 2, 5, 1, 7, 9, 8, 3, 6));
        quickSort(Arrays.asList(4, 2, 5, 1, 7, 9, 8, 3, 6));

//        selectionSort(Stream.iterate(4000, x -> x - 10).limit(400).toList());
//        quickSort(Stream.iterate(4000, x -> x - 10).limit(400).toList());
    }


    private static void binartSearchStart(Integer elementCount, Integer elementForSearch) {
        BinarySearch bs = new BinarySearch();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < elementCount; i++) {
            lst.add(i);
        }
        System.out.println("elemnt nomer [" + bs.searchInList(lst, elementForSearch) + "]");
    }

    private static void selectionSort(List<Integer> lstForSort) {
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("--------------------------------------------------------------------");
        var startTime = System.nanoTime();
        System.out.println("Start selectionSort " + startTime);
        System.out.println("result of sorting " + selectionSort.sortAtoZ(new ArrayList<>(lstForSort)));
        var endTime = System.nanoTime();
        System.out.println("End selectionSort " + getMilli(startTime, endTime));


    }


    private static void quickSort(List<Integer> lstForSort) {
        QuickSort quickSort = new QuickSort();
        System.out.println("--------------------------------------------------------------------");
        var startTime = System.nanoTime();
        System.out.println("Start quickSort " + startTime);
        System.out.println("result of sorting " + quickSort.sortAtoZ(new ArrayList<>(lstForSort)));
        var endTime = System.nanoTime();
        System.out.println("End quickSort " + getMilli(startTime, endTime));
    }

    private static double getMilli(long startTime, long endTime) {
        return (double) (endTime - startTime) / 10000000;
    }
}
