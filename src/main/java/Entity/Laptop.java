package Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop {
    private String name;
    @Autowired
    private Processor processor;

    @Autowired
    private Ram ram;

    public Laptop() {

    }

    public Ram getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getName() {
        return name;
    }
}
