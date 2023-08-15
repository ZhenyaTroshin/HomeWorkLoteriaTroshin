
import java.util.Random;
public class Loteria {
    public static void main(String[] args){
        Random random = new Random();
        int pcNumber = random.nextInt(10);

        int i = 1;
        for (; i <= 3; i++){
            int tryNumber = random.nextInt(10);
            if (pcNumber == tryNumber){
                System.out.println("WOW YOU WIN!,pc number =" + pcNumber + "count tries = " + i );
                break;
            }

        }
        if (i > 3){
            System.out.println("YOU LOSE), pc number was = " + pcNumber);
        }


    }
}
