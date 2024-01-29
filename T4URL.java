package laptrinhmang1.week4;
import java.net.URL;
public class T4URL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://fpll.poly.rdu.vn/goto.php?target=root_1&client_id=fpolyhn");
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("Path: "+url.getPath());
            System.out.println("Truy van: "+url.getQuery());
            System.out.println("Tham chieu: "+url.getRef());
        } catch (Exception e) {
        }
    }
}
