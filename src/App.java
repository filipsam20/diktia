import ithakimodem.*;

public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        int k;
        Modem modem = new Modem();
        modem.setSpeed(1000);
        modem.setTimeout(8000);
        modem.open("ithaki");
        for(;;){
            try {
                k = modem.read();
                if(k == -1){
                    break;
                }
                System.out.print((char)k);
            } catch (Exception x) {
                break;
            }
        }
        String s = "AT\r";
        int c;

        for(;;){
            try {
                modem.write(s.getBytes());
                if(c == -1){
                    break;
                }
                c = modem.read();
                System.out.print(k);
                
            } catch (Exception e) {
                //TODO: handle exception
                break;
            }
        }
        
        modem.close();
    }
}
