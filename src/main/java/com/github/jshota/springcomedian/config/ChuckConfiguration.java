package com.github.jshota.springcomedian.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author j.h on 7/20/20
 */
@Configuration
public class ChuckConfiguration {

    @Bean // telling spring this is a bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}