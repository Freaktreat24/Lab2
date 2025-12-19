import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

    double volume() {
        return length * width * height;
    }
}

public class volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        double length = sc.nextDouble();

        System.out.println("Enter width:");
        double width = sc.nextDouble();

        System.out.println("Enter height:");
        double height = sc.nextDouble();

        Box b = new Box();
        b.length = length;
        b.width = width;
        b.height = height;

        double vol = b.volume();
        System.out.println("Volume = " + vol);

        sc.close();
    }
}

