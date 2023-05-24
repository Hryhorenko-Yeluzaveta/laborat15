import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int flag = 0;
        Items items = new Items();
        Client client1 = new Client(1, "Lizok", 0);
        Client client2 = new Client(1, "Nastya", 0);
        Client client3 = new Client(1, "Sonya", 0);

        items.AddClient(client1);
        items.AddClient(client2);
        items.AddClient(client3);

        ItemTour itemTour = new ItemTour();
        Tours tour1 = new Tours(1, "Shopping", 1200, null, client1);
        Tours tour2 = new Tours(2, "excursion", 800, null, client3);
        Tours tour3 = new Tours(3, "chill", 2000, null, client2);

        itemTour.AddTour(tour1);
        itemTour.AddTour(tour2);
        itemTour.AddTour(tour3);
        System.out.println("Main Menu");
        System.out.println("1 - Tour Agent Page\n2 - Customer Page\n3 - exit.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (flag == 0) {
            switch (n) {
                case 1:
                    Context context = new Context(new TourAgent(items, itemTour));
                    context.executeStrategy();
                    break;
                case 2:
                    Context context1 = new Context(new Customer(itemTour));
                    context1.executeStrategy();
                    break;
                case 3:
                    System.out.println("Good night!");
                    flag = 1;
                    break;
                default:
                    System.out.println("Please, only from 1 to 3");
            }
        }
    }

}