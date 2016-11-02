package org.silentpom.domain;

import org.silentpom.builder.Builder;
import org.silentpom.builder.BuilderImpl;

import java.util.List;

/**
 * Created by Vlad on 29.10.2016.
 */
public class Gen1 {
    String val1;
    List<? extends Gen1> gens;

    public String getVal1() {
        return val1;
    }

    protected void setVal1(String val1) {
        this.val1 = val1;
    }

    public static ValueSetter1<? extends Gen1, ?>  builder() {
        return new FinalBuilder1();
    }


    //public interface ValueSetter1<T extends Gen1, RetBuilder extends ValueSetter1<? extends T,? extends RetBuilder> > extends Builder<T> {
    public interface ValueSetter1<T extends Gen1, RetBuilder extends ValueSetter1<? extends T,?> > extends Builder<T> {
        public RetBuilder val1(String val);
    }

    /*public interface ValueSetter1Ex<T extends Gen1> extends ValueSetter1<T, ValueSetter1Ex<T>> {

    }*/


    public static class ValueSetter1Impl<T extends Gen1, RetBuilder extends ValueSetter1Impl<T,RetBuilder> > extends BuilderImpl<T, RetBuilder> {

        protected ValueSetter1Impl(T created) {
            super(created);
        }

        public RetBuilder val1(String val) {
            getNested().setVal1(val);
            return self();
        }
    }

    public static class FinalBuilder1 extends ValueSetter1Impl<Gen1, FinalBuilder1> implements ValueSetter1<Gen1, FinalBuilder1>{
        //implements ValueSetter1Ex<Gen1> {
            //implements ValueSetter1<Gen1, FinalBuilder1> {
    // implements ValueSetter1<Gen1, FinalBuilder1> {
        private FinalBuilder1() {
            super(new Gen1());
            injectReturningBuilder(this);
        }
    }

}
