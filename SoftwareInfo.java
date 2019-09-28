
public class SoftwareInfo{
    public static void getSoftwareInfo(){
        System.out.println("\n\n*****Software Information*****\n ");

        String SistemaOperativo = System.getProperty("os.name");
        String SO = String.format("-Sistema Operativo: %s", SistemaOperativo);

        System.out.println(SO);
       
        String java_version = System.getProperty("java.version");
        String version_message = String.format("-Version de Java: %s", java_version);

        System.out.println(version_message);

        String UserName = System.getProperty("user.name");
        String UN = String.format("-Nombre de Usuario: %s", UserName);

        System.out.println(UN);

        String SistemArch = System.getProperty("os.arch");
        String SA = String.format("-Arquitectura del Sistema: %s", SistemArch);

        System.out.println(SA);


        
    }
    
}