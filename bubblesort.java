public class bubblesort {

    public static void main(String[] args) {
        int[] array= {1,5,2,3,56,43,34};

        System.out.println("Lista antes de ser ordenada: ");
        printArray(array);

        bubblesorta(array);
        System.out.println("Lista ordenada: ");
        printArray(array);
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void bubblesorta(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j< n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }            
        }
    }
}