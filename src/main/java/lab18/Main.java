package lab18;
import java.util.Scanner;
public class Main {

        private Scanner scanner;
        private Card cardForUser1;
        private Card cardForUser2;

        public Main(){
            scanner = new Scanner(System.in);
            cardForUser1 = new Card(0);
            cardForUser2 = new Card(0);
        }

        public void addBalance(){
            Card currentCard = null;
            System.out.println("Press 1 to add money to card 1");
            System.out.println("Press 2 to add money to card 2");
            int select = scanner.nextInt();
            if(select == 1){
                System.out.println("Card for user 1 was selected");
                currentCard = cardForUser1;
            }else{
                System.out.println("Card for user 2 was selected");
                currentCard = cardForUser2;
            }
            System.out.println("Current balance of card is " + currentCard.getBalance());
            System.out.println("Please enter an amount in Dollars:");
            int amount = scanner.nextInt();
            currentCard.setBalance(amount*2);
            System.out.println("Your new current balance of card in credits is " + currentCard.getBalance());
        }

        public void start(){
            Boolean flag = true;
            while(flag) {

                System.out.println("Welcome to terminal, please select from options: ");
                System.out.println("Press 1 add money to a card");
                System.out.println("Press 5 to exit");

                int selection = scanner.nextInt();
                switch (selection) {
                    case 1:
                        addBalance();
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.out.println("You selected a unknown option.");
                }
            }

        }
        public static void main(String[] args) {
            Main main = new Main();
            main.start();

        }
    }





