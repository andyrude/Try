package codechef;

public class QuickSort {

    public static void main(String[] args) {

        int[] array = {17,41,5,22,54,6,29,3,13}; // initial input
        array = quickSort(0, array.length-1,array);

        for (int i =0; i< array.length; i++){
            System.out.println(array[i]); // print the response
        }

    }

    /**
     * The main quickSort method
     * */
    public static int[] quickSort(int start, int end, int[] array){

        if(start < end){
            // keep in mind that once we have the partition, pivot is already in the correct sorted position
            int partition = partitionPoint(start,end,array); // find the correct position for the pivot

            quickSort(start, partition-1, array); // recursively call the quick sort for the left had side of the pivot
            quickSort(partition+1, end,array);  // sort right hand side of the pivot
        }
        return array;
    }

    public static int partitionPoint(int start, int end, int[] array){

        int pivot = array[end]; // choose the last element as pivot
        int swapPosition = start;
        for(int i=start; i<= end - 1; i++){
            /**
             * if value at i is less than pivot,
             * swap the ith position with the swapPosition and incriment the swapPosition to next element.
             */
            if(array[i] <= pivot){
                swapElements(swapPosition, i, array);
                swapPosition ++;
            }
        }
        /* At the end swap the pivot with the swapposition.
        This will move the pivot element to sorted position */
        swapElements(swapPosition,end,array);
        return swapPosition;
    }

    /**
     * Swap the element in the position
     */
    public static void swapElements(int position1, int position2, int[] array){
        int temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }
}