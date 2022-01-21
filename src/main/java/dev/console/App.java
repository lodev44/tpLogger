package dev.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService;

public class App {

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	LOG.info("Bonjour SLf4J !");
	LOG.info("Implémentation Logback");
	AppService testLogAppService = new AppService();
	testLogAppService.executer("paramTest");
    }

}
