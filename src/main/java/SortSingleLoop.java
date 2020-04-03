public class SortSingleLoop {

    public static void main(String[] args) {
        int[] a = {102, 132, 767, 6767, 234, 312, 43, 6};

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {

                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i = -1;
            }
        }

        for (int num : a) {
            System.out.println(num);

        }
    }
}