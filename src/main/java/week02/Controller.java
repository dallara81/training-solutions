package week02;

import java.util.Scanner;

public class Controller {

    private Office office = new Office();

    public void readOffice() {

        System.out.println("Kérem a tárgyalók számát > ");
        Scanner scanner = new Scanner(System.in);

        int numberOfMeetingRooms =  scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfMeetingRooms; i++) {
            System.out.println("Kérem a nevet > ");
            String name = scanner.nextLine();

            System.out.println("Kérem a szélességet > ");
            int width = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Kérem a hosszúságot > ");
            int length = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);
        }

        System.out.println(office.getMeetingRooms());

    }

    public void printMenu() {
        System.out.println("1) Tárgyalók sorrendje\n" +
                "2) Tárgyalók sorrendje visszafelé\n" +
                "3) Páros tárgyalók\n" +
                "4) Terület szerint\n" +
                "5) Keresés teljes név alapján\n" +
                "6) Keresés névtöredék alapján\n" +
                "7) Keresés terület alapján");
    }

    public void runMenu() {
        System.out.println("Kérem, válasszon a menüből > ");
        Scanner scanner = new Scanner(System.in);
        int menuItem = scanner.nextInt();
        scanner.nextLine();

        if (menuItem == 1) {
            office.printNames();
        }

        if (menuItem == 7) {
            System.out.println("Legkisebb méret > ");
            int area = scanner.nextInt();
            scanner.nextLine();

            office.printAreasLargerThan(area);
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }

}