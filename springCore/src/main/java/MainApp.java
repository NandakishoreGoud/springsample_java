import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cts1 on 12/10/17.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context   = new ClassPathXmlApplicationContext("/home/cts1/eclipse-nandakishore/springCore/src/Bean.xml");
        HelloSpring objA = (HelloSpring) context.getBean("point1");

        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloSpring objB = (HelloSpring) context.getBean("point1");
        objB.getMessage();
    }
}

