import java.util.Random;

public class LotteryPicker{

        public static void main(String[] args){

                Random r = new Random();
                int num1 = r.nextInt(49)+1;
		int num2 = r.nextInt(49)+1;
		int num3 = r.nextInt(49)+1;
		int num4 = r.nextInt(49)+1;
		int num5 = r.nextInt(49)+1;
		int num6 = r.nextInt(49)+1;
                System.out.println( num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
        }
}







