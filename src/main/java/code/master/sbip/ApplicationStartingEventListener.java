package code.master.sbip;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import java.util.Date;

public class ApplicationStartingEventListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(final ApplicationStartedEvent applicationStartingEvent) {
        System.out.println(new Date(applicationStartingEvent.getTimestamp()));
    }
}
