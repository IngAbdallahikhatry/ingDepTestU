import Business.LaptopService;
import Entity.Caracteristic;
import Entity.Laptop;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestContext.class)
public class LaptopServiceTest {

    @Autowired
    LaptopService service;
    @Autowired
    Laptop lp;

    @Test
    @DisplayName("Test getCaractersitic function")
    public void getCaractersticTest() {
        assertEquals(service.getCaracterstic(lp).getCapacity(), 70);
    }

}
