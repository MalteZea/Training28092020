import java.util.Scanner;

public class Forgreninger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number between 1 and 6: ");
        int straw = input.nextInt();

        if (straw <= 4) {
            System.out.println("You drew a short straw");
        } else if (straw == 5) {
            System.out.println("You drew a special straw!");
        } else {
            System.out.println("You drew a long straw");
        }

        switch (straw) {
            case 1:
                System.out.println("Ouch");
                break;
            case 2:
                System.out.println("You jumped up!");
                break;
            case 3:
                System.out.println("You feel inspired");
                break;
            case 4:
                System.out.println("You should visit a doctor");
                break;
            case 5:
                System.out.println("Halleluja");
                break;
            case 6:
                System.out.println("You died, try again");
        }
    }
}
