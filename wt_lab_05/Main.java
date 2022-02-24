import java.util.Scanner;

public class Main {
    public void getVal(int arr[][], int num) {
        Scanner SC = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.println("Enter value: ");
                arr[i][j] = SC.nextInt();
            }
        }
        SC.close();
    }

    void print(int arr[][], int num) {
        System.out.println("For left diagonal: ");
        int greatest_1028 = arr[0][0], smallest_1028 = arr[0][0];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    if (arr[i][j] > greatest_1028)
                        greatest_1028 = arr[i][j];
                    else if (arr[i][j] < smallest_1028)
                        smallest_1028 = arr[i][j];
                }
            }
        }
        System.out.println("Greatest Element: " + greatest_1028);
        System.out.println("Smallest Element: " + smallest_1028);
        System.out.println("For right diagonal: ");
        greatest_1028 = 0;
        smallest_1028 = arr[0][num - 1];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if ((i + j) == (num - 1)) {
                    if (arr[i][j] > greatest_1028)
                        greatest_1028 = arr[i][j];
                    else if (arr[i][j] < smallest_1028)
                        smallest_1028 = arr[i][j];
                }
            }
        }
        System.out.println("Greatest Element: " + greatest_1028);
        System.out.println("Smallest Element: " + smallest_1028);

    }

    void display(int arr[][], int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix: ");
        int num_1028 = SC.nextInt();
        int a_1028[][] = new int[num_1028][num_1028];
        Main obj = new Main();
        obj.getVal(a_1028, num_1028);
        obj.display(a_1028, num_1028);
        obj.print(a_1028, num_1028);
        SC.close();
    }
}