public class Main {
    public static void main(String[] args) {
        int [] arr = {45, 12, 89, 62, 73, 28, 33, 50, 69, 22};

        Util.sort(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
