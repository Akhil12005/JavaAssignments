public class TrafficLight {
    // Attributes
    private String color;
    private int duration;

    // Constructor
    public TrafficLight(String Color, int Duration) {
        this.color = Color;
        this.duration = Duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
        System.out.println("Traffic light changed to " + newColor + " for " + newDuration + " seconds.");
    }

    // Method to check if the traffic light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the traffic light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Method to print current status of the traffic light
    public void printStatus() {
        System.out.println("Traffic Light Status:");
        System.out.println("Color: " + color);
        System.out.println("Duration: " + duration + " seconds");
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating an instance of the TrafficLight class using the constructor
        TrafficLight trafficLight1 = new TrafficLight("red", 30);

        // Printing initial status of the traffic light
        trafficLight1.printStatus();

        // Changing the color of the traffic light
        trafficLight1.changeColor("green", 45);

        // Checking if the traffic light is red or green
        System.out.println("Is the traffic light red? " + trafficLight1.isRed());
        System.out.println("Is the traffic light green? " + trafficLight1.isGreen());

        // Printing updated status of the traffic light
        trafficLight1.printStatus();
    }
}