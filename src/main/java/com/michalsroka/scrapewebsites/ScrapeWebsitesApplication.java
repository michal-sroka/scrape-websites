package com.michalsroka.scrapewebsites;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ScrapeWebsitesApplication {

    /**
     *  Can be run with: java -jar target/scrape-websites-0.0.1-SNAPSHOT.jar com.michalsroka.scrapewebsites.ScrapeWebsitesApplication
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ScrapeWebsitesApplication.class, args);

        log.info("Hello world :)");
    }


}
