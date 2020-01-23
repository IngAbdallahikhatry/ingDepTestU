package Entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ram")
public class Ram {

    @Value("${Capacity}")
    private int Capacity;
    @Value("${Type}")
    private String type;

    public int getCapacity() {
        return Capacity;
    }

    public String getType() {
        return type;
    }
}
