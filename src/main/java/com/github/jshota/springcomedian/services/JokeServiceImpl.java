package com.github.jshota.springcomedian.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author j.h on 7/20/20
 */
@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    /*
     * what's going to happen when this class runs inside a Spring,
     * Spring will create it once and then will be reused in that class.
     * So it's not going to get created with every request.
     */
//    public JokeServiceImpl() {
//        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//    }

    // change to java configuration here
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
