package test.Proxy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hp
 */
public class Client {

    public static void main(String[] args) {
        List<String> sites = Arrays.asList("facebook", "apple", "youtube", "instagram");
        
        ISP internet = new InternetProxy();
        
        for(String i:sites){
            System.out.println(internet.ServerSite(i));
        }
    }
}
