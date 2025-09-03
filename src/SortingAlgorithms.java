public class SortingAlgorithms {

    public int[] BubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
//                System.out.println("elements " + i + " and " + j + " values are " + array[i] + " and " + array[j]);
                if (array[i] > array[j]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
//                    System.out.printf("New State: i at %d = %d and j at %d = %d\n", i, array[i], j, array[j]);
                }
//                System.out.println("next");
            }
//            System.out.println("exit inner loop");
        }
        return array;
    }
}
