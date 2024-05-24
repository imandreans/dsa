package Array;

// import java.util.Arrays;
class Array {
    public static void main(String[] args) {

        int arr[] = { 4, 13, 15, 17, 17, 19, 6 };

        // Random rand = new Random();
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = rand.nextInt(20);
        // }

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // System.out.print("Traversal 2: ");
        // for (int i : arr) {
        // System.out.print(i + ",");
        // }

        // System.out.print(Arrays.toString(arr));
        // System.out.print(Arrays.toString(bubblesort(arr)));
        // System.out.println();

        // int[] sorted = bubblesort(arr);
        // System.out.println(binarysearch(sorted, 19));
    }

    public static int[] bubblesort(int[] args) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < args.length - 1; i++) {
                if (args[i] > args[i + 1]) {
                    swapped = true;
                    int temp = args[i];
                    args[i] = args[i + 1];
                    args[i + 1] = temp;
                }
            }
        }
        return args;
    }

    public static String binarysearch(int[] args, int key) {
        int low = 0;
        int high = args.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == args[mid]) {
                return key + " is Found";
            } else if (key < args[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return key + " is not Found";
    }
}