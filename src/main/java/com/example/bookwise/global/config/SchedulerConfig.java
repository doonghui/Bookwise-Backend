package com.example.bookwise.global.config;


import com.example.bookwise.domain.book.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//        fixedRate: 작업 수행시간과 상관없이 일정 주기마다 메소드를 호출하는 것
//        fixedDelay는 (작업 수행 시간을 포함하여) 작업을 마친 후부터 주기 타이머가 돌아 메소드를 호출
//        initialDelay: 스케줄러에서 메소드가 등록되자마자 수행하는 것이 아닌 초기 지연시간을 설정
//        cron: Cron 표현식을 사용하여 작업을 예약



@Component
@RequiredArgsConstructor
@Slf4j
public class SchedulerConfig {

    private final BookService bookService;

    @Scheduled(cron = "${schedule.cron}")
    public void run() throws Exception {
        log.info("스케쥴러실행");

        bookService.createBookListByCategory("베스트","0","0","200");
        bookService.createBookListByCategory("청소년","10","20","200");
        bookService.createBookListByCategory("청년","20","40","200");
        bookService.createBookListByCategory("장년","50","60","200");

    }
}
