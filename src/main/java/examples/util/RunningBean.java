package examples.util;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by serhii on 27.01.15.
 */
@Component
public class RunningBean {

    @Async
    public void keepRunning(){
        while (true)
        ;
    }
}
