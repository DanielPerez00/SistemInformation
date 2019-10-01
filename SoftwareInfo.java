
public class SoftwareInfo{
    public static void getSoftwareInfo(){
        System.out.println("\n\n*****Software Information*****\n ");
        SoftwareInfo.getSistemaOperativo(); 
        SoftwareInfo.getJavaVersion();
        SoftwareInfo.getUserName(); 
    
         
         }

    public static void getSistemaOperativo(){
        String SistemaOperativo = System.getProperty("os.name");
        String SO = String.format("-Sistema Operativo: %s", SistemaOperativo);

        System.out.println(SO);}
    
    public static void getJavaVersion(){
        String JavaVersion = System.getProperty("java.version");
        String JV = String.format("-Version de Java: %s", JavaVersion);

        System.out.println(JV);}

    public static void getUserName(){
        String UserName = System.getProperty("user.name");
        String UN = String.format("-Nombre de Usuario: %s", UserName);

        System.out.println(UN);}

    }