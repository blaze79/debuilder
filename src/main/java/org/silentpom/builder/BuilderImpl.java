package org.silentpom.builder;

/**
 * Created by Vlad on 29.10.2016.
 * Used as base class for all builder implementations
 *
 */
public class BuilderImpl<T, RetBuilder>  {
    protected T nested;
    RetBuilder returnBuilder;

    protected BuilderImpl(T child) {
        nested = child;
    }

    protected T getNested() {
        return nested;
    }

    protected void injectReturnBuilder(RetBuilder builder) {
        returnBuilder = builder;
    }

    protected RetBuilder self() {
        return returnBuilder;
    }

    public T build() {
        return nested;
    }
}
