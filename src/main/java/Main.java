import Entity.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Laptop lp = (Laptop) ctx.getBean("laptop");

        System.out.println("The capacity is : "+lp.getRam().getCapacity());

    }
}
