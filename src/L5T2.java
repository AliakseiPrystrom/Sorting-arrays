import java.util.Arrays;
import java.util.Random;
public class L5T2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[]mass=new int[10];
        for (int i=0;i<mass.length;i++){
            mass[i]= random.nextInt(20);
        }
        System.out.println(Arrays.toString(mass));
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
    }
}
