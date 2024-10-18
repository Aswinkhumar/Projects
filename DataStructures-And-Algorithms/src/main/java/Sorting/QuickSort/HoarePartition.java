package Sorting.QuickSort;

public class HoarePartition {
    public static void main(String[] args) {
        int[] arr = {10,13,6,9,12,11,8};
        System.out.println("Mid index: " + hoarePartition(arr,0,arr.length-1));
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static int hoarePartition(int[] arr, int start, int end) {
        int partition = arr[start];
        int i=start-1; // keeping the starting of smaller element sub-array as start-1
        int j = end+1; // keeping the starting of larger element sub-array as end+1

        while(true){
            do{
                i++;
            }while (arr[i]<partition);
            do{
                j--;
            }while (arr[j] > partition);
            if(i>=j){
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
