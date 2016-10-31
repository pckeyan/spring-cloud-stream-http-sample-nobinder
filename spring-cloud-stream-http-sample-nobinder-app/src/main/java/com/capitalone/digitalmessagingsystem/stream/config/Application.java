package com.capitalone.digitalmessagingsystem.stream.config;

/**
 * @author asv132 - Karthik Palanivelu on 9/21/16.
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.aggregate.AggregateApplicationBuilder;

import com.capitalone.digitalmessagingsystem.stream.config.sink.SinkApplication;
import com.capitalone.digitalmessagingsystem.stream.config.source.SourceApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new AggregateApplicationBuilder().from(SourceApplication.class)
                .to(SinkApplication.class).args().run(args);
    }
}