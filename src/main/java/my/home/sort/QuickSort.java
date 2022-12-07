package my.home.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {


    public List<Integer> sortAtoZ(List<Integer> lstForSort) {
        if(lstForSort.size() < 2){
            return lstForSort;
        }
        var pivot = lstForSort.get(0);
        var greater  = lstForSort.stream().filter(v -> v > pivot).toList();
        var less  = lstForSort.stream().filter(v -> v < pivot).toList();

        var sortedLst = new ArrayList<Integer>();

        sortedLst.addAll(sortAtoZ(less));
        sortedLst.add(pivot);
        sortedLst.addAll(sortAtoZ(greater));

        return sortedLst;
    }
    


}
