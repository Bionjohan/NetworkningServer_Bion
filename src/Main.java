/* SERVER - may be enhanced to work or multiple clients */
import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        ServerSocket server = null;
        Socket client;

        //Standard port nummer vi ska använda
        int portnummer = 55050;
        if (args.length >= 1){
            portnummer = Integer.parseInt(args[0]);
        }

        //Skapa socker för servern
        try {
            server = new ServerSocket(portnummer);
        } catch (IOException ie){
            System.out.println("Kan inte öppna socket." + ie);
            System.exit(1);
        }

        //wait for the 
    }
}