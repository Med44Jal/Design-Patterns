package test.Proxy;

/**
 * @author hp
 */
public class Inwi implements ISP {

    @Override
    public String ServerSite(String url) {
        return String.format("https://%s.com", url);
    }

}
