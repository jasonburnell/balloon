package p1;

public class Main {

    public static void main(String[] args) {

        // Create an array of ballons
        Balloon[] thing = new Balloon[5];

        // build balloons
        thing[0] = new Balloon();
        System.out.println(thing[0]);
        thing[1] = new Balloon(12, "white");
        thing[2] = new Balloon(6, "yellow");
        thing[3] = new Balloon();

        // print the number of balloons made today
        System.out.printf("Number of balloons made = %d%n",
                Balloon.getQuantity());

        // Destroy a balloon
        Balloon.destruct(1, thing);


        // Show the Balloon's characteristics
        for (Balloon each : thing) {
            if (each != null)
                System.out.printf("Size = %d inches; color = %s%n",
                        each.getsize(), each.getcolor());
        }
    }
}

class Balloon {
    // Properties
    private int size;
    private String color;
    private static int quantity = 0;


    // Default constructor
    Balloon() {
        size = 10;
        color = "blue";
        quantity++;
    }

    // Custom constructor
    Balloon(int arg1, String arg2) {
        size = arg1;
        color = arg2;
        quantity++;
    }

    //return color of the object
    String getcolor() {
        return color;
    }

    // Return size of the object
    int getsize() {
        return size;

    }

    // Return the number of Balloons produced
   static int getQuantity () {
        return quantity;
    }

   static void destruct(int i, Balloon[] arg ) {
        arg[i] = null;
        quantity--;

    }

    @Override
    public String toString() {
        return "Balloon{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}