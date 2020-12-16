package com.company;

public class Main {
private static Notepad notepad = new Notepad();

    public static void main(String[] args) {
	    boolean running = true;
	    while (running) {
	        var cmd = InputUtils.askString("Enter command");
	        switch (cmd) {
                case "list":
                    listRecords();
                    break;
                case "create":
                    createRecord();
                    break;
                case "help":
                    showHelp();
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
        System.out.println("Good bye!");
    }

    private static void listRecords() {
        notepad.listRecords();
    }

    private static void createRecord() {
        notepad.createRecord();
    }

    private static void showHelp() {
        System.out.println("This is very helpful help. \n All commands: \n list \n create \n help \n exit");
    }
}
