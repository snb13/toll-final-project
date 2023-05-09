package jdev.tracker;

import jdev.tracker.services.CoordsPeekService;
import jdev.tracker.services.CoordsSendService;
import jdev.tracker.services.CoordsStoreService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@EnableScheduling
public class CoordsContext {

    @Bean
    public CoordsPeekService peekServ() {
        return new CoordsPeekService();
    }

    @Bean
    public CoordsSendService sendServ() {
        return new CoordsSendService();
    }

    @Bean
    public CoordsStoreService storeServ() {
        return new CoordsStoreService();
    }

    @Bean
    public TaskScheduler poolScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setThreadNamePrefix("poolScheduler");
        scheduler.setPoolSize(20);
        return scheduler;
    }

}
