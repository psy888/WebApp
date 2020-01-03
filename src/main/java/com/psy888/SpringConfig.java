package com.psy888;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.psy888")
@PropertySource("classpath:MusicPlayer.properties")
public class SpringConfig {
}
