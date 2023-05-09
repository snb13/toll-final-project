package jdev.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
public class CoordsSendService {

    @Scheduled(fixedDelay = 2000)
    void take() throws InterruptedException {
        CoordsStoreService.log.info("Taking Coords...");
//        CoordsStoreService.log.info("Coordinates sent to server  " + storeService.queue.poll(500, TimeUnit.MILLISECONDS));
        CoordsStoreService.log.info("Coordinates sent to server  " + storeService.queue.take());

    }

/*    @Autowired
    private CoordsPeekService peekService;*/

    @Autowired
    private CoordsStoreService storeService;
}
