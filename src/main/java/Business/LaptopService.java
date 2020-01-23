package Business;

import Entity.Caracteristic;
import Entity.Laptop;
import org.springframework.stereotype.Component;

@Component("lp_service")
public class LaptopService {

    public Caracteristic getCaracterstic(Laptop lp){
        return new Caracteristic(lp.getProcessor().getSpeed(), lp.getRam().getCapacity());
    }

}
