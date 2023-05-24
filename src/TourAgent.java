import java.util.Scanner;

public class TourAgent implements Strategy {
    public Items items;
    public ItemTour itemTour;

    public TourAgent(Items items, ItemTour itemTour) {
        this.items = items;
        this.itemTour = itemTour;
    }

    @Override
    public void Init() {
        System.out.println("You`re welcome in TourAgent Page!");
        System.out.println("What do you want to do?");
        System.out.println("1 - choose *hot* tour\n2 - sale for customer \n3 - exit.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int flag = 1;
        while (flag==1) {
            switch (n) {
                case 1:
                    System.out.println("Choose hot tour: ");
                    int tourId = in.nextInt();
                    itemTour.FindTourById(tourId);
                    itemTour.SetHot(tourId);
                    break;
                case 2:
                    System.out.println("Which customer will has sale?");
                    int clientId = in.nextInt();
                    items.FindClientById(clientId);
                    System.out.println("Write sale:");
                    int ssale = in.nextInt();
                    items.SetSale(clientId, ssale);
                    break;
                case 3:
                    System.out.println("Have a nice day!");
                    flag = 0;
                    break;
                    default:
                    System.out.println("Please choose number from 1 to 3.");
            }
        }
    }
}
