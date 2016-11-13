package org.silentpom.domain;

import org.silentpom.builder.BuilderImpl;

/**
 * Created by Vlad on 29.10.2016.
 */
public class Gen1 {
    String val1;

    public String getVal1() {
        return val1;
    }

    protected void setVal1(String val1) {
        this.val1 = val1;
    }

    public static InnerBuilder1<? extends Gen1, ?> builder() {
        return new FinalBuilder1();
    }


    /**
     * implementation of builder abstraction.
     *
     * @param <T>
     * @param <RetBuilder>
     */
    public static class InnerBuilder1<T extends Gen1, RetBuilder extends InnerBuilder1<? extends T, ?>> extends BuilderImpl<T, RetBuilder> {

        protected InnerBuilder1(T created) {
            super(created);
        }

        public RetBuilder val1(String val) {
            getNested().setVal1(val);
            return self();
        }
    }

    /**
     * real builder Gen1.
     */
    private static class FinalBuilder1 extends InnerBuilder1<Gen1, FinalBuilder1> {

        private FinalBuilder1() {
            super(new Gen1());
            injectReturnBuilder(this);
        }
    }

}
