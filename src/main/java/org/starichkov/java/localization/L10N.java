package org.starichkov.java.localization;

import org.starichkov.java.localization.annotations.BaseName;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Vadim Starichkov
 * @since 27.03.2016 19:28
 */
public final class L10N {

    private L10N() {
    }

    public static String getMessage(Enum<?> message) {
        Class<?> clazz = message.getClass();
        if (clazz.isAnnotationPresent(BaseName.class)) {
            BaseName annotation = clazz.getAnnotation(BaseName.class);
            ResourceBundle bundle = ResourceBundle.getBundle(annotation.value());
            return bundle.getString(message.name());
        }
        return null;
    }
}
