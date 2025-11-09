import java.util.Scanner;

public class sortingList {

    void sortIntValues(int a[],int n){
        for (int i = 0; i < n-1 ; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }

            }
        }

    }

    void sortStringValues(String a[],int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if((a[i].compareTo(a[j]))>0){
                    String temp = a[i];
                    a[i] =a[j];
                    a[j]= temp;
                }

            }

        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        sortingList sort = new sortingList();
        int n;
        int choice;
        do {
            System.out.println("Menu:\n 1.sorting of integer array\n 2.sorting of string array\n 3.exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice){
                case 1 :
                    System.out.print("Enter total number of values: ");
                    n = in.nextInt();
                    int a[] = new int[n];
                    System.out.print("Enter "+n+" values : ");
                    for (int i = 0; i < n; i++) {
                        a[i] = in.nextInt();
                    }
                    sort.sortIntValues(a,n);
                    System.out.print("Array of sorted values : ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i]+" ");
                    }
                    System.out.println();
                    break;
                case 2 :
                    System.out.println("Enter total number of values : ");
                    n=in.nextInt();
                    String b[] = new String[n];
                    System.out.print("Enter "+n+" values : ");
                    for (int i = 0; i < n; i++) {
                        b[i] = in.next();
                    }
                    sort.sortStringValues(b,n);
                    System.out.print("Array of sorted values : ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(b[i]+" ");
                    }
                    System.out.println();
                    break;
                case 3 :
                    System.out.println("Thank You....!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }while(choice!=3);
    }
}
