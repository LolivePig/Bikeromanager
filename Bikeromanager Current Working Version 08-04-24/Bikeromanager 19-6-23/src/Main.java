//PROBLEM LIST AS OF 30/03/2024:
//-MiscMenu: Miscellaneous graphs for displaying number of people taking part per session etc. aren't working; page
//           shows up as completely blank; wanted to use 2D graphics to make bar charts
//-SessionsMenu: SessionsMenu is serving as the testbed for all other pages, where both RidersMenu and then BikesMenu
//               were modelled after it with changes to fit their respective information, currently roadblocked here
//               because I have spent about 2 hours trying to work out how to read tables into their respective
//               textfiles (notice the blank "SessionsFile.txt")
//-Main: Subcases for searching for components of a class need setting up and integrating as GUI, but I realised there
//       isn't much point writing them unless I can test them (relies on textfile reading)
//-Subpages: Can't open subpages again after closing (flook said he would look into it, I also have, I've found nothing)
//-I'm not sure how to assign members to individual sessions they took part in, but it doesn't seem necessary if I only
// need to be able to see how much money a session generates; instead can use 3 variables of "members who paid" to add
// £5, "nonmembers who paid" to add £7, and "nonpayers" to add £0 but be part of the total count of people taking part,
// and use (members x membership fee) + (number of sessions attended x ((members x member fee) +
// (non-members x non-member fee))) to calculate total revenue, subtract (members x membership fee) and divide by
// (number of total sessions) to find revenue per session
//-I've only just realised that all classes for each object (Bike, BikesToBuild, Rider, Session, SessionLeader) are
// actually all redundant according to what I've coded so far, I'm not sure whether to use them unless it's absolutely
// necessary in order to fix the textfile reading problem
//-If the program needs more complexity, I have the idea of adding an undo button for each subpage by saving the current
// value of a field before the user changes it, allowing them to go back if they changed it accidentally
//-Unable to customise the pages with images (wanted to use a picture of a BMXer on the track mid-jump or something
// similar on MainMenu in the background with adjusted opacity if possible, though this hasn't worked before because
// it's said the page was "decorated")

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program running");

        MainMenu mainMenu = new MainMenu();
        MainMenu.main();

        boolean chosen = false;
        Scanner scanner = new Scanner(System.in);
        while (!chosen) {
            System.out.println("Which category do you want to search in? Enter:\nB for bikes\nR for riders\nS for sessions");
            String search = scanner.nextLine();
            switch (search.toLowerCase()) { // 5/3/24 keep creating subcases for each search

                case "b" -> {
                    chosen = true;
                    System.out.println("Bikes chosen. What do you want to search for? Enter:\nN for number plate\nS for size\nB for brand\nM for make\nC for colour\nW for washed\nP for operational\nE for extra info");
                    search = scanner.nextLine();
                    switch(search.toLowerCase()) {
                        case "n" -> {
                            System.out.println("Enter the number plate you want to search for. (1-999)");
                            //int plateNumber = scanner.nextInt();
                            //int bikeNumber = 1
                            //for (int i = 0; i < bikes[].length(); i++) {
                            //  if (bikes[i].getNumberPlate() == plateNumber) {
                            //      bikeNumber++;
                            //      System.out.println("Bike number " + bikeNumber + " is a " + bikes[i].getColour() + " " + bikes[i].getSize()
                            //      + "-sized " + bikes[i].getBrand() + " " + bikes[i].getMake() + " with number plate " +
                            //      bikes[i].getNumberPlate() + ". Extra notes about this bike say: " + bikes[i].getExtraInfo()
                            //  }
                            //}
                        }
                        case "s" -> {
                            System.out.println("Enter the size you want to search for. (Micro Mini to Expert XL)");
                            //String size = scanner.nextLine();
                            //int bikeNumber = 1
                            //for (int i = 0; i < bikes[].length(); i++) {
                            //  if (bikes[i].getSize() == size.toLowerCase()) {
                            //      bikeNumber++;
                            //      System.out.println("Bike number " + bikeNumber + " is a " + bikes[i].getColour() + " " + bikes[i].getSize()
                            //      + "-sized " + bikes[i].getBrand() + " " + bikes[i].getMake() + " with number plate " +
                            //      bikes[i].getNumberPlate() + ". Extra notes about this bike say: " + bikes[i].getExtraInfo()
                            //  }
                            //}
                        }

                        case "b" -> {
                            System.out.println("Enter the brand you want to search for. (e.g. Haro");
                            //String brand = scanner.nextLine();
                            //int bikeNumber = 1
                            //for (int i = 0; i < bikes[].length(); i++) {
                            //  if (bikes[i].getBrand() == brand.toLowerCase()) {
                            //      bikeNumber++;
                            //      System.out.println("Bike number " + bikeNumber + " is a " + bikes[i].getColour() + " " + bikes[i].getSize()
                            //      + "-sized " + bikes[i].getBrand() + " " + bikes[i].getMake() + " with number plate " +
                            //      bikes[i].getNumberPlate() + ". Extra notes about this bike say: " + bikes[i].getExtraInfo()
                            //  }
                            //}
                        }
                        case "m" -> {
                            System.out.println("Enter the make you want to search for. (e.g. Blackout)");
                            //String make = scanner.nextLine();
                            //int bikeNumber = 1
                            //for (int i = 0; i < bikes[].length(); i++) {
                            //  if (bikes[i].getMake() == make.toLowerCase()) {
                            //      bikeNumber++;
                            //      System.out.println("Bike number " + bikeNumber + " is a " + bikes[i].getColour() + " " + bikes[i].getSize()
                            //      + "-sized " + bikes[i].getBrand() + " " + bikes[i].getMake() + " with number plate " +
                            //      bikes[i].getNumberPlate() + ". Extra notes about this bike say: " + bikes[i].getExtraInfo()
                            //  }
                            //}
                        } //keep setting up in advance code other cases
                        case "w" -> System.out.println("WIP4");
                        case "c" -> System.out.println("WIP5");
                        case "o" -> System.out.println("WIP6");
                        case "e" -> System.out.println("WIP7");
                        //keep making cases for each component
                        default -> {
                            System.out.println("Invalid choice. Returning to main selection.");
                            chosen = false;
                        }
                    }
                }

                case "r" -> {
                    chosen = true;
                    System.out.println("Riders chosen. What do you want to search for? Enter:\n");

                }

                case "s" -> {
                    chosen = true;
                    System.out.println("Sessions chosen. What do you want to search for? Enter:\n");

                }

                default -> {
                    System.out.println("Invalid choice.");
                }
            };
        }
    }
}

//-Sessions (name, date, time, skill level, included genders, race session or skill session, session leader)
//-Riders (name, member or non-member, skill level, bike size, age, gender, has paid for the session yet, uses own bike and kit or club’s)
//-Bikes (size, operational or not, brand, make, colour, acceptable tyre pressure or not, acceptably tight chain or not, state of brakes, washed or not, has wheels, has cranks, has seat, has handlebars, has handlebar grips, has fork)
//-Bikes to be built (brand, make) and spare bike parts (part of bike, manufacturer)