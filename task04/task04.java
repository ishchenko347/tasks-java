
// +Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class task04 {

    public static void main(String args[]) {
        int n = 3;
        hanoi(n, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char with, char some, char on) {
        if (n == 1) {
            System.out.println("Moving disk from: " + with + " To: " + on);
            return;
        }
        hanoi(n - 1, with, on, some);
        System.out.println("Moving disk from: " + with + " To: " + on);
        hanoi(n - 1, some, with, on);
    }
}