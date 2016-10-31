package com.capitalone.digitalmessagingsystem.stream.config.source;

/**
 * @author asv132 - Karthik Palanivelu on 9/19/16.
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.app.http.source.HttpSourceConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(HttpSourceConfiguration.class)
public class SourceApplication {
    // private String format = "yyyy-MM-dd HH:mm:ss";
    //
    // @Bean
    // @InboundChannelAdapter(value = Source.OUTPUT)
    // public MessageSource<String> timerMessageSource() {
    // return () -> new GenericMessage<>(new SimpleDateFormat(this.format).format(new Date()));
    // }
}