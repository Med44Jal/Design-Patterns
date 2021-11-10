package test.Proxy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hp
 */
public class InternetProxy implements ISP {

    private List<String> blockedSites = Arrays.asList("facebook", "youtube", "instagram");

    @Override
    public String ServerSite(String url) {
        if (blockedSites.contains(url)) {
            return "You should not be in " + url + "!! GO TO WORK !!";
        }

        return new Inwi().ServerSite(url);
    }

}
