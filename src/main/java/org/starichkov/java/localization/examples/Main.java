package org.starichkov.java.localization.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.starichkov.java.localization.L10N;

import java.util.Locale;

/**
 * @author Vadim Starichkov
 * @since 27.03.2016 19:36
 */
public final class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    private Main() {
    }

    public static void main(String[] args) {
        // save default locale
        Locale defaultLocale = Locale.getDefault();

        Locale[] locales = {Locale.US, new Locale("ru")};
        for (Locale locale : locales) {
            Locale.setDefault(locale);
            LOGGER.info(L10N.getMessage(Labels.HELLO_WORLD));
            LOGGER.info(L10N.getMessage(Messages.GREETING));
            LOGGER.info(L10N.getMessage(Messages.FAREWELL));
        }

        // restore default locale
        Locale.setDefault(defaultLocale);
    }
}
