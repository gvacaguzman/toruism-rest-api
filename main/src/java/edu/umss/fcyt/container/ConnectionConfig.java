package edu.umss.fcyt.container;

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Configuration
@EnableAutoConfiguration
@PropertySource(value = "file:connection.properties", ignoreResourceNotFound = true)
public class ConnectionConfig {

}