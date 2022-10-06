package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Room livingRoom1 = new Room(3, 2, 4);
        Room bedRoom1 = new Room(1, 2, 2);
        Room bathRoom1 = new Room(1, 1, 1);
        ArrayList<Room> a = new ArrayList<>();
        a.add(livingRoom1);
        a.add(bedRoom1);
        a.add(bathRoom1);

        Building building = new Building(a,1, 1, false);
        int result = countLampsInBuilding(building);
        System.out.println(result);
    }




    public static int countLampsInBuilding(Building b) {
        int sum =0;

        for (int i = 0; i < b.getRooms().size(); i++) {
            sum += b.getRooms().get(i).getNumberOfLamps();

        }
        return sum;
    }

    public static boolean isNormal(Building b) {

        if (b.getNumberOfFloors() > b.getRooms().size()) {
            return true;
        }

        else {
            System.out.println("this is an odd building");
            return false;

        }

    }

}
