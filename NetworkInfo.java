import java.net.Socket;

public class NetworkInfo{
    public static void getNetworkInfo(){
        System.out.println("\n\n*****Network Information*****\n");
        NetworkInfo.getConexionStatus();
        

        }

    public static void getConexionStatus(){

        String Web = "www.tecmilenio.mx";
        int puerto = 80;

        try {
                Socket s = new Socket(Web, puerto) ;
                if (s.isConnected()){
                    System.out.println("Conexion a " + Web + " a travez del puerto "+ puerto);
                }}

        catch (Exception e){
            System.err.println("No se pudo establecer conexion");

    }
    
}}