package jdev.tracker.services;

import jdev.dto.PointDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CoordsPeekService {

    @Scheduled(fixedDelay = 1_000)
    void put() throws InterruptedException {
        Random rand = new Random();
        PointDTO coords = new PointDTO();
        coords.setLat(-180 + rand.nextDouble(360));
        coords.setLon(-90 + rand.nextDouble(180));
        coords.setAutoId("new plate num");
        coords.setTime(System.currentTimeMillis());
        CoordsStoreService.log.info("New coords inserted " + coords);
        storeService.queue.put(coords.toString());
    }
    @Autowired
    private CoordsStoreService storeService;


}
