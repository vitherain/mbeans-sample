package cz.herain.tutorial.mbeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

/**
 * Created by Vit Herain on 27/10/2016.
 */
@ManagedResource(
        objectName = "cz.herain.tutorial.mbeans.jmx:name=MyMBean",
        description = "Pokusna MBeana.")
@Component
public class MyMBean {

    private Logger logger = LoggerFactory.getLogger(MyMBean.class);

    private String attrib = "POKUSNY ATRIBUT";

    @ManagedAttribute
    public String getAttrib() {
        return attrib;
    }

    @ManagedAttribute
    public void setAttrib(final String attrib) {
        this.attrib = attrib;
    }

    @ManagedOperation(description = "Pokusna operace pres MBeanu")
    @ManagedOperationParameters({@ManagedOperationParameter(
            name = "parametrJedna",
            description = "Tohle je parametr, pro ktery jsem lepsi nazev nenasel")})
    public synchronized void mojeOperace(final String parametrJedna) {
        logger.info("Jsem v mojeOperace() a hodnota parametru je {}. Hodnota attrib je {}", parametrJedna, attrib);
    }
}
