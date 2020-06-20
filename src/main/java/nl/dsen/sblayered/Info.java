package nl.dsen.sblayered;

import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class Info implements InfoContributor {
    @Override
    public void contribute(org.springframework.boot.actuate.info.Info.Builder builder) {
        String build = getClass().getPackage().getImplementationVersion();
        builder.withDetail("APP_BUILD", build);
    }
}
