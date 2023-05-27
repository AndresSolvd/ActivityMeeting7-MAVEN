public class Main {
    public static void main(String[] args) {

        // iterate over the array and replace numbers divisible by 3, 5, or both
        for (int i = 0; i < 100; i++) {
            
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("Banana");
            } else if (i % 3 == 0) {
                System.out.println("Apple");
            } else if (i % 5 == 0) {
                System.out.println("Orange");                
            } else {
                System.out.println(i);
            }            
        }
    }
}