import java.util.*;

public class start{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter six strings");
        int [] str = new int[6];

        for(int i = 0; i < str.length;i++){
            str [i] = in.nextInt();
        }
        System.out.println(Arrays.toString(str));
    }
}