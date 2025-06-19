package ex_09_SwitchCase;

import java.util.Scanner;

public class Lab033_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

//        String browser = args[0];
//        System.out.println(browser);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Browser name");
        String browser= scanner.next().toLowerCase();

        switch(browser)
        {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("Login to page");
                System.out.println("TC 1 runs");

                break;

            case "firefox":
                System.out.println("Strating the firefox");
                System.out.println("TC1 runs");
                break;

            case "edge":
                System.out.println("Starting the edge");
                System.out.println("TC2 runs");
                break;

            default:
                System.out.println("No idea, which browser is this");
        }

    }
}
