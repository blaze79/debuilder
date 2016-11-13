package org.silentpom.domain;

import org.junit.Test;

/**
 * Created by Vlad on 30.10.2016.
 */
public class Gen2Test {

    @Test
    public void builderGen2Test() throws Exception {
        take2(Gen2.builder().build());

        take2(Gen2.builder().val1("111").val2("222").build());

        take2(Gen2.builder().val1("111").val1("111").val1("111").val1("111").val2("222").build());
        take2(Gen2.builder().val1("111").val2("222").val2("222").val1("111").val2("222").build());

    }

    private static Gen2 take2(Gen2 take) {
        return take;
    }

    @Test
    public void builderGen2InheritanceTest() throws Exception {
        buildGen1Final(
                Gen2.builder().val2("set value from Gen2")
        );
    }

    /**
     * test function that have Gen1 builder parameter
     * @param builder
     * @return
     */
    private static Gen1 buildGen1Final(Gen1.InnerBuilder1<? extends Gen1, ?> builder) {
        builder.val1("set value from Gen1 builder");
        return builder.build();
    }

}