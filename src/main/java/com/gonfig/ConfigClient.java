package com.gonfig;

/**
 * Client for GonfigServer - configuration server.
 *
 * {@see https://github.com/makitox/gonfigserver}
 *
 */
public interface ConfigClient {

    /**
     * Returns parameter specified by key as a string.
     *
     * @param key configuration key (name)
     * @return {@link String}
     */
    String asString(String key);

    /**
     * Returns parameter specified by key as a integer.
     *
     * @param key configuration key (name)
     * @return {@link Integer}
     */
    Integer asInteger(String key) ;

    /**
     * Returns parameter specified by key as a double.
     *
     * @param key configuration key (name)
     * @return {@link Double}
     */
    Double asDouble(String key);
}
