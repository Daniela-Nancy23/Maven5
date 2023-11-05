package fr.exia;

public class DAOHelloWorld implements IModel {
    private static DAOHelloWorld instance = null;
    private final String fileName = "HelloWorld.txt";
    private String helloWorldMessage = null;

    private DAOHelloWorld() {
    }

    public static DAOHelloWorld getInstance() {
        if (instance == null) {
            instance = new DAOHelloWorld();
        }
        return instance;
    }

    private void setInstance(DAOHelloWorld instance) {
        DAOHelloWorld.instance = instance;
    }

    public void readFile() {
        // Code pour lire le fichier et assigner le message à helloWorldMessage
    }

    public String getHelloWorld() {
        if (helloWorldMessage == null) {
            readFile();
        }
        return helloWorldMessage;
    }

    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
}


