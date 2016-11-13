package org.silentpom.domain;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vlad on 13.11.2016.
 */
public class Gen3Test {

    @Test
    public void builderGen3Test() throws Exception {
        take3(Gen3.builder().build());

        take3(Gen3.builder().val1("111").val2("222").val3("333").build());

        take3(Gen3.builder().val1("111").val1("111").val3("333").val1("111").val1("111").val2("222").build());
        take3(Gen3.builder().val1("111").val2("222").val2("222").val1("111").val3("333").val2("222").build());

    }

    private static Gen3 take3(Gen3 take) {
        return take;
    }

    @Test
    public void builderGen3InheritanceTest() throws Exception {
        Gen1 gen1 = buildGen1Final(
                Gen3.builder().val3("set value from Gen3")
        );

        Gen1 gen2 = buildGen2Final(
                Gen3.builder().val3("set value from Gen3")
        );
    }

    private static Gen1 buildGen1Final(Gen1.InnerBuilder1<? extends Gen1, ?> builder) {
        builder.val1("set value from Gen1 builder");
        return builder.build();
    }

    private static Gen2 buildGen2Final(Gen2.InnerBuilder2<? extends Gen1, ?> builder) {
        builder.val1("set value from Gen1 builder");
        builder.val2("set value from Gen2 builder");
        return builder.build();
    }

}