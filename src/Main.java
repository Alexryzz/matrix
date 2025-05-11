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

        System.out.println();
        System.out.println("Task 2");
        // Task 2
        int count1 = 1;
        int[][] array1 = new int[5][5];
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < count1; j++) {
                array1[i][j] = 1;
            }
            count1++;
        }

        for (int[] ints : array1) {
            for (int anInt : ints){
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // Task 3
        System.out.println();
        System.out.println("Task 3");

        for(int[] ints : array1){
            for(int anInt : ints){
                if (anInt == 1){
                    System.out.print(anInt);
                }
                else {
                    break;
                }
            }
            System.out.println();
        }
    }
}