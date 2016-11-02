package org.silentpom.domain;

/**
 * Created by Vlad on 29.10.2016.
 */
public class Gen1Test {

    @org.junit.Test
    public void build() throws Exception {
        take1(Gen1.builder().build());
        take1(Gen1.builder().val1("vall").val1("val1").val1("vallyyyyyyy").val1("33333").build());


    }

    private static Gen1 take1(Gen1 take) {
        return take;
    }

}