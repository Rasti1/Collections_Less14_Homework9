package project.view;

import java.util.Scanner;

public class AppView {
    public void getInfo(){

        System.out.println("List of users: ");

    }

    public int getSearchElement() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput index of user for search: ");
        return sc.nextInt();

    }
}
