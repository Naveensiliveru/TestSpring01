package in.ashokit.bean;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); // Ensure correct file path
            // Your bean logic here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
