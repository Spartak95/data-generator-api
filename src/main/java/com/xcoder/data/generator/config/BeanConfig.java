package com.xcoder.data.generator.config;

import java.util.Objects;

import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    @SneakyThrows
    public XML producerXML() {
        return new XMLDocument(
            Objects.requireNonNull(getClass().getResourceAsStream("/kafka/producer.xml")).readAllBytes());
    }
}
