
public class HardwareInfo{
    public static void getHardwareInfo(){
        System.out.println("\n\n*****Hardware Information*****\n");
        HardwareInfo.getCpuInfo();
        HardwareInfo.getSistemArch();
        HardwareInfo.getMemoInfo();
    }

    public static void getCpuInfo(){
 }
 

   public static void getSistemArch(){
        String SistemArch = System.getProperty("os.arch");
        String SA = String.format("-Arquitectura del Sistema: %s", SistemArch);

        System.out.println(SA);
    }

    public static void getMemoInfo(){
        int dataSize = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Memoria maxima: "+ runtime.maxMemory() / dataSize + " MB");
        System.out.println("Memoria total: "+ runtime.totalMemory() / dataSize + " MB");
        System.out.println("Memoria libre: "+ runtime.freeMemory() / dataSize + " MB");
        System.out.println("Memoria usada: "+ (runtime.maxMemory() - runtime.freeMemory()) / dataSize + " MB");
    }
}