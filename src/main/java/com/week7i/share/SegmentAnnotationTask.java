package com.week7i.share;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Lazy(value=false)

public class SegmentAnnotationTask {

    @Scheduled(cron = "*/1 * * * * ?")//每隔1秒执行一次
    public void segment(){
        System.out.println("spring  scheduled task annocation!");
    }
}
