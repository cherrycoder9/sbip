package code.master.sbip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbipApplication {

    public static void main(final String[] args) {
        final SpringApplication springApplication = new SpringApplication(SbipApplication.class);
        // 커스텀 이벤트 리스너 추가, 가변 인자를 받으므로 여러 개의 리스너를 한번에 등록할 수도 있음
        springApplication.addListeners(new ApplicationStartingEventListener());
        springApplication.run(args);
    }

}