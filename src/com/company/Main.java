package com.company;

public class Main {
private static Notepad notepad = new Notepad();

    public static void main(String[] args) {
        System.out.println("To enter help menu type 'help + enter'");
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
        var strType = InputUtils.askString("Type");
        var type = RecordType.valueOf(strType);
        notepad.createRecord(type);
    }


    private static void showHelp() {
        System.out.println("All commands: \n list - views a list of all records \n create - makes a new record in the list \n -- BOOK - creates record book \n -- PERSON - creates record person \n" +
                " -- NOTE - creates record sticky note \n -- ALARM - creates record recurring alarm \n -- REMINDER - creates record reminder \n -- PET - creates record pet \n help - calls help menu \n exit - terminates the program");
    }
}
