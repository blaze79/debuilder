package org.silentpom.builder;

/**
 * Created by Vlad on 29.10.2016.
 */
public class BuilderImpl<T, RetBuilder> /*implements Builder<T>*/ {
    protected T nested;
    RetBuilder returnedBuilder;

    protected BuilderImpl(T child) {
        nested = child;
    }

    protected T getNested() {
        return nested;
    }

    protected void injectReturningBuilder(RetBuilder builder) {
        returnedBuilder = builder;
    }

    protected RetBuilder self() {
        return returnedBuilder;
    }

    //@Override
    public T build() {
        return nested;
    }
}
