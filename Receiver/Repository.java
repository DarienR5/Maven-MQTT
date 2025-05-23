package Receiver;


public class Repository {
    private static Repository instance;

    private int x;
    private int y;

    private Repository() {
        // private constructor to prevent external instantiation
    }

    public static Repository getInstance() {
        if (instance == null) {
            synchronized (Repository.class) {
                if (instance == null) {
                    instance = new Repository();
                }
            }
        }
        return instance;
    }

    // Set coordinates (called by PongPanel)
    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
        publishCoordinates();
    }

    // Getters if needed
    public int getX() { return x; }
    public int getY() { return y; }

    // Method to send data to publisher
    private void publishCoordinates() {
        coordinate coord = new coordinate(x, y);
        MqttPublisher.publishCoordinate(coord);
    }
}

