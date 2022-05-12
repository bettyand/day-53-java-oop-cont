import java.util.Scanner;

public class CounterApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Create counter starting at 0");
        Counter count0 = new Counter();
        System.out.println(count0);
        System.out.println("Increment");
        count0.increase();
        System.out.println(count0);
        System.out.println("Decrement");
        count0.decrease();
        System.out.println(count0);

        System.out.println("Create counter with given starting value");
        System.out.print("Enter value: ");
        int startVal = Integer.parseInt(in.nextLine());
        Counter countVal = new Counter(startVal);
        System.out.println(countVal);
        System.out.println("Enter value to increase by: ");
        int incrVal = Integer.parseInt(in.nextLine());
        countVal.increase(incrVal);
        System.out.println(countVal);
        System.out.println("Enter value to decrease by: ");
        int decrVal = Integer.parseInt(in.nextLine());
        countVal.decrease(decrVal);
        System.out.println(countVal);

        in.close();
    }
}
