package com.gonfig;


/**
 * Builder class for {@link ConfigClient}.
 */
public interface Builder {

    /**
     * Sets url to connect to GonfigServer.
     * @param url url
     * @return {@link Builder} instance
     */
    Builder setUrl(String url);

    /**
     * Sets port to connect to GonfigServer.
     *
     * @param port port
     * @return {@link Builder} instance
     */
    Builder setPort(int port);

    /**
     * Creates and configure {@link ConfigClient} instance.
     * @return configured {@link ConfigClient} instance.
     */
    ConfigClient build();

}
