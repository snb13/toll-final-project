package jdev.tracker.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

@Service
public class CoordsStoreService {

    static final Logger log = LoggerFactory.getLogger(CoordsPeekService.class);
    BlockingDeque<String> queue =  new LinkedBlockingDeque<>(100);

}
