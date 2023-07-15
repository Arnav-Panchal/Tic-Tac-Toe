import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int array[]=new int[10];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i]=i;
        }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

