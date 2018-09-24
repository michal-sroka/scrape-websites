package com.michalsroka.scrapewebsites;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScrapeTheNet  implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        main(args);
    }

    public static void main(String[] args) {

        log.info("Hello World, I am scraping.");
    }


    public String getSomeData() {
       return "Here is your data";
    }

}
