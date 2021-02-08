package marsaint.arshiva;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> places = new LinkedList<String>();

        addAndSortInOrder(places, "Thailand");
        addAndSortInOrder(places, "Penang");
        addAndSortInOrder(places, "Kelantan");
        addAndSortInOrder(places, "Sarawak");
        addAndSortInOrder(places, "Johor");
        addAndSortInOrder(places, "Perlis");
        addAndSortInOrder(places, "Singapore");
        addAndSortInOrder(places, "Kedah");
        addAndSortInOrder(places, "Sabah");
        addAndSortInOrder(places, "Apalah");
        addAndSortInOrder(places, "Japan");
        addAndSortInOrder(places, "Butterworth");

        System.out.println("================");
        printPlace(places);

        addAndSortInOrder(places, "Butterworth");
        printPlace(places);

        visit(places);

    }

    public static void printPlace(LinkedList<String> linkedList) {
        Iterator<String> iteratorPlaces = linkedList.iterator();
        while(iteratorPlaces.hasNext()) {
            System.out.println("place is: " + iteratorPlaces.next());
            System.out.println("------");
        }
    }

    public static void printPlaceForLoop(LinkedList<String> linkedList) {
        for (int i=0; i<linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }

    public static boolean addAndSortInOrder(LinkedList<String> linkedList, String newPlace) {

        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {

            int orderComparison = stringListIterator.next().compareTo(newPlace);
            if(orderComparison == 0) {
                System.out.println("same place, add place cancelled");
                return false;

            } else if(orderComparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newPlace);
                String currentPlace = linkedList.get(stringListIterator.nextIndex());
                System.out.println(newPlace + " is before " + currentPlace);
                return true;

            } else if(orderComparison < 0) {
                String currentPlace = linkedList.get(stringListIterator.nextIndex());
                System.out.println(newPlace + " is next after " + currentPlace);
            }
        }
        stringListIterator.add(newPlace);
        return true;
    }

    private static void visit(LinkedList<String> places) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = places.listIterator();

        if(places.isEmpty()) {
            System.out.println("no place to visit, list is empty");
            return;
        } else {
            System.out.println("visiting city: " + listIterator.next()); // visit next city
            printMenu();
        }

        while(!quit) {
            int actionChoice = scanner.nextInt();
            scanner.nextLine();
            switch (actionChoice) {
                case 0:
                    System.out.println("Menu:");
                    printMenu();
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("next city found");
                        System.out.println("visiting: " + listIterator.next());
                    } else {
                        System.out.println("edge of the world");
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("previous city found");
                        System.out.println("visiting: " + listIterator.previous());
                    } else {
                        System.out.println("beginning of the world");
                    }
                    break;
                default:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("this is the fucking menu");
    }
}
