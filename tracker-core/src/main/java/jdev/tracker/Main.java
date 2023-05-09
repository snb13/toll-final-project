package jdev.tracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jdev on 07.03.2017.
 */
public class Main {
    public static void main(String... args) throws Exception {

        ApplicationContext context = new AnnotationConfigApplicationContext(CoordsContext.class);

/*        for (int i=0; i<5; i++) {
            System.out.println("Main.main say Hello!!!!");
            PointDTO point = new PointDTO();
            point.setLat(45);
            System.out.println(point.toJson());
            Thread.sleep(1000);
        }*/
    }
}
