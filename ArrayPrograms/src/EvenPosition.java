public class EvenPosition {
    public static void main(String[] args) {
        //Initialize
        int[] array = new int[] {1,2,3,4,5};
        System.out.println("element of give array present or even position: ");
        // Loop through the array by incrementing value of i by 2 i +2
        for(int i = 1; i < array.length; i = i + 2){
            System.out.println(array[i]);
        }
    }
}
