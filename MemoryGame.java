import java.util.*;

public class MemoryGame {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int level = 1;

        System.out.println("🎮 Memory Game");

        while (true) {
            int number = rand.nextInt(900) + 100; // 3-digit number

            System.out.println("Memorize this number: " + number);

            Thread.sleep(3000); // wait 3 seconds

            // Clear screen effect (not perfect but works)
            System.out.println("\n\n\n\n\n\n\n\n\n\n");

            System.out.print("Enter the number: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("✅ Correct! Level up!");
                level++;
            } else {
                System.out.println("❌ Wrong! Game Over.");
                System.out.println("You reached Level: " + level);
                break;
            }
        }
    }
}