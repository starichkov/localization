package org.starichkov.java.localization.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Vadim Starichkov
 * @since 27.03.2016 19:30
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface BaseName {
    String value();
}
