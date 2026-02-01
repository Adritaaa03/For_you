import java.util.Scanner;

public class TestProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("💌 Welcome to your Open When Digital Letters 💌");
        System.out.println("---------------------------------------------");
        System.out.println("1. Open when you miss me 💕");
        System.out.println("2. Open when you are sad 😔");
        System.out.println("3. Open when you are happy 😊");
        System.out.println("4. Open when you can’t sleep 🌙");
        System.out.println("5. Exit");

        System.out.print("\nEnter your choice: ");
        choice = sc.nextInt();

        System.out.println("\n---------------------------------------------");

        switch (choice) {
            case 1:
                System.out.println("💖 Open When You Miss Me 💖");
                System.out.println("Hey love,");
                System.out.println("If you're missing me right now, just know that");
                System.out.println("I’m probably missing you even more ❤️");
                System.out.println("Close your eyes and imagine me hugging you tight 🫂");
                break;

            case 2:
                System.out.println("🌧 Open When You Are Sad 🌧");
                System.out.println("My love,");
                System.out.println("Bad days happen, but you are stronger than you think 💪");
                System.out.println("I believe in you and I’m always proud of you ❤️");
                break;

            case 3:
                System.out.println("🌈 Open When You Are Happy 🌈");
                System.out.println("Seeing you happy makes my heart so full 🥰");
                System.out.println("Never stop smiling, because your smile is my favorite ❤️");
                break;

            case 4:
                System.out.println("🌙 Open When You Can’t Sleep 🌙");
                System.out.println("It’s late and you should be resting 😴");
                System.out.println("Imagine me saying goodnight and wishing you sweet dreams 💫");
                System.out.println("I love you endlessly ❤️");
                break;

            case 5:
                System.out.println("Goodbye love 💕 Take care!");
                break;

            default:
                System.out.println("Invalid choice 😅 Please try again!");
        }

        sc.close();
    }
}