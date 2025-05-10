public class Main {
    public static void main(String[] args) {
        // Task 1
        int count = 1;
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count++;
            }
        }

        for (int[] ints : array){
            for (int anInt : ints){
                System.out.print(anInt + " ");
            }
        }

    }
}