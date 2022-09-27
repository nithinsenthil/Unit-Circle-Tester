import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] test = selector(3);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }


    public static String[] selector(int length) {
        String[] rv = new String[length];
        Random r = new Random();
        String[] trig = {"sin", "cos", "tan"};
        String[] options = {"0", "π/6", "π/4", "π/3", "π/2", "2π/3", "3π/4", "5π/6", "π", "7π/6", "5π/4", "4π/3", "3π/2", "5π/3", "7π/4", "11π/6"};

        for (int i = 0; i < length; i++) {
            rv[i] = trig[r.nextInt(2)];
        }

        for (int i = 0; i < length; i++) {
            rv[i] += "(" + options[r.nextInt(15)] + ")";
        }

        return rv;
    } //End selector()

    public static boolean checker() {
        return true;
    } //End checker()
}