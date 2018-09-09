package com.aihui.lib.base.util;

import android.app.Dialog;

import java.util.Collection;
import java.util.Map;

/**
 * Contains common assertions.
 */
public final class CheckUtils {

    /**
     * Returns {@code true} if the provided reference is {@code null} otherwise
     * returns {@code false}.
     *
     * @param obj a reference to be checked against {@code null}
     * @return {@code true} if the provided reference is {@code null} otherwise
     * {@code false}
     * @apiNote This method exists to be used as a
     * {@link java.util.function.Predicate}, {@code filter(Objects::isNull)}
     * @see java.util.function.Predicate
     * @since 1.8
     */
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    /**
     * Returns {@code true} if the provided reference is non-{@code null}
     * otherwise returns {@code false}.
     *
     * @param obj a reference to be checked against {@code null}
     * @return {@code true} if the provided reference is non-{@code null}
     * otherwise {@code false}
     * @apiNote This method exists to be used as a
     * {@link java.util.function.Predicate}, {@code filter(Objects::nonNull)}
     * @see java.util.function.Predicate
     * @since 1.8
     */
    public static boolean nonNull(Object obj) {
        return obj != null;
    }

//    public static boolean isEmpty(CharSequence str) {
//        return str == null || str.length() == 0;
//    }

    public static boolean notEmpty(CharSequence str) {
        return str != null && str.length() != 0;
    }

    public static <T> boolean isEmpty(T[] array) {
        return array == null || array.length == 0;
    }

    public static <T> boolean notEmpty(T[] array) {
        return array != null && array.length != 0;
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean notEmpty(Collection<?> collection) {
        return collection != null && !collection.isEmpty();
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean notEmpty(Map<?, ?> map) {
        return map != null && !map.isEmpty();
    }

    public static void dismissDialog(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
