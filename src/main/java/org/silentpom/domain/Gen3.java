package org.silentpom.domain;

/**
 * Created by Vlad on 29.10.2016.
 */
public class Gen3 extends Gen2 {
    String val3;

    public String getVal3() {
        return val3;
    }

    public void setVal3(String val3) {
        this.val3 = val3;
    }

    public static InnerBuilder3<? extends Gen3, ?> builder() {
        return new FinalBuilder3();
    }

    public static class InnerBuilder3<T extends Gen3, RetBuilder extends InnerBuilder3<? extends T,?>> extends InnerBuilder2<T, RetBuilder> {

        protected InnerBuilder3(T created) {
            super(created);
        }

        public RetBuilder val3(String val) {
            getNested().setVal3(val);
            return self();
        }
    }

    private static class FinalBuilder3 extends InnerBuilder3<Gen3, FinalBuilder3> {

        private FinalBuilder3() {
            super(new Gen3());
            injectReturnBuilder(this);
        }
    }
}
