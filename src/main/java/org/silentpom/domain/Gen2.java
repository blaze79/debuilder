package org.silentpom.domain;

/**
 * Created by Vlad on 29.10.2016.
 */
public class Gen2 extends Gen1 {
    String val2;

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public static InnerBuilder2<? extends Gen2, ?> builder() {
        return new FinalBuilder2();
    }


    public static class InnerBuilder2<T extends Gen2, RetBuilder extends InnerBuilder2<? extends T,?>> extends InnerBuilder1<T, RetBuilder> {

        protected InnerBuilder2(T created) {
            super(created);
        }

        public RetBuilder val2(String val) {
            getNested().setVal2(val);
            return self();
        }
    }

    private static class FinalBuilder2 extends InnerBuilder2<Gen2, FinalBuilder2> {

        private FinalBuilder2() {
            super(new Gen2());
            injectReturnBuilder(this);
        }
    }
}
