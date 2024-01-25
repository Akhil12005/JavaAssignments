public class SimpleMessage {
    // Method to print a message
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Creating an instance of the MessagePrinter class
        SimpleMessage messagePrinter = new SimpleMessage();

        // Calling the printMessage method to print a message
        messagePrinter.printMessage("Hello There, Lenin Java Batch - 33");
    }
}