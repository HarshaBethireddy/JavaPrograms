// TC ---> O(n*n!), SC ---> O(n)
public class Permutations {
    public static void getPermutations(char[] arr, int fi) {
        if (fi == arr.length) {
            System.out.println(arr);
            return;
        }
        for (int i = fi; i < arr.length; i++) {
            swap(arr, i, fi);
            getPermutations(arr, fi + 1);
            swap(arr, i, fi);
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abc";
        getPermutations(str.toCharArray(), 0);
    }
}