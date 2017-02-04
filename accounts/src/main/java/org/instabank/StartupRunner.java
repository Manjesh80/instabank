package org.instabank;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * Created by aadhya on 2/4/2017.
 */
public class StartupRunner implements CommandLineRunner {

    protected final Log logger = LogFactory.getLog(getClass());

/*    @Autowired
    private DataSource dataSource;

    @Autowired
    private CustomerRepository customerRepository;*/

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Jai Ganesh");
        /*logger.info(dataSource.toString());
        logger.info(customerRepository.count());*/
    }

    @Scheduled(initialDelay = 1000, fixedRate = 300000)
    public void run() {
        logger.info("Current time: " + LocalDateTime.now().toString());
    }
}
