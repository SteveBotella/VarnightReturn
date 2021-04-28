package ui;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
    int controllerChoice = 0;

    public void getStart() {
        System.out.println("Welcome to Varnight Adventure");
        return ;
    }

    public void start() {
        System.out.println("Welcome to Varnight Adventure");
        this.controllerChoice = sc.nextInt();
        if (controllerChoice == 0) {
            System.out.println("Create New Character");
        } else {
            System.out.println("Quit Game");
        }
    }

}
