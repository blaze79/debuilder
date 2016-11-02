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

    public static ValueSetter2<? extends Gen2, ?>  builder() {
        return new FinalBuilder2();
    }

    public interface ValueSetter2<T extends Gen2, RetBuilder extends ValueSetter2<? extends T,?>> extends ValueSetter1<T, RetBuilder> {
        public RetBuilder val2(String val);
    }

    public static class ValueSetter2Impl<T extends Gen2, RetBuilder extends ValueSetter2Impl<T,RetBuilder>> extends ValueSetter1Impl<T, RetBuilder> {

        protected ValueSetter2Impl(T created) {
            super(created);
        }

        public RetBuilder val2(String val) {
            getNested().setVal2(val);
            return self();
        }
    }

    public static class FinalBuilder2 extends ValueSetter2Impl<Gen2, FinalBuilder2> implements ValueSetter2<Gen2, FinalBuilder2>{

        private FinalBuilder2() {
            super(new Gen2());
            injectReturningBuilder(this);
        }
    }
}
