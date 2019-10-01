import java.net.Socket;
import java.net.SocketException;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class NetworkInfo{
    public static void getNetworkInfo(){
        System.out.println("\n\n*****Network Information*****\n");
        NetworkInfo.getConexionStatus();
        NetworkInfo.getInterfacesInfo();
        

        }

    public static void getConexionStatus(){

        String Web = "www.tecmilenio.mx";
        int puerto = 80;

        try {
                Socket s = new Socket(Web, puerto) ;
                if (s.isConnected()){
                    System.out.println("Estatus de conexion: Conectado");
                }}

        catch (Exception e){
            System.err.println("Estatus de conexion: Desconectado");

    }}
    
public static void getInterfacesInfo()
{
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                printNetworkInterface(interfaces.nextElement());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private static void printNetworkInterface(NetworkInterface NI)
    {  byte[] MacAdress;
    
        try {
                MacAdress = NI.getHardwareAddress();

        } catch (Exception e) {
            System.out.println("Ocurrió un error al recuperar la información de la interfaz de red");
            return;
                }
        if (MacAdress == null) {
            return;
        }
        System.out.println("----------");
            System.out.println("  ID: " + NI.getIndex());
            System.out.println("NAME: " + NI.getDisplayName());
            System.out.println(" MAC: " + formatMACAddress(MacAdress));
    }

    private static String formatMACAddress(byte[] mac)
    {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			builder.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
		}
		return builder.toString();
    }
}