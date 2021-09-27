import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int dogCount = 1;

        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(3);
        clock();
    }


    public static String pluralize(String animal, int numbers){

        if(numbers == 0 || numbers > 1){
            return animal + "s";
        }else{
            return animal;
        }
   }

    public static void flipNHeads(int n) {
        int primary = 0;
        int flips = 0;
        while (primary != n) {
            double number = Math.random();
            if (number < 0.5) {
                System.out.println("TaIlS");
                primary = 0;
                flips++;
            }
            if (number >= 0.5) {
                System.out.println("HeAdS");
                primary++;
                flips++;
            }
        }
        System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
    }
        public static void clock() throws InterruptedException{
            while (true) {
                LocalDateTime now = LocalDateTime.now();
                // int second = now.getSecond();
                Thread.sleep(1000);
                    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
            }
        }
    public static int[] reverse(int[] array) {
        int index = array.length -1 ;
        int looping = array.length/2;
        for(int i=0;i<looping;i++){
            int saved = array[i];
            array[i]= array[index-i];
            array[index-i]=saved;
        }
        return array;
    }
}
