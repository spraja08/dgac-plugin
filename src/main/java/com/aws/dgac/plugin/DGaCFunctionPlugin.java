package com.aws.dgac.plugin;

/**
* @author  Raja SP
*/
import com.facebook.presto.spi.Plugin;
import com.facebook.presto.spi.block.Block;
import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class DGaCFunctionPlugin implements Plugin {
    @Override
    public Set<Class<?>> getFunctions() {
        return ImmutableSet.<Class<?>>builder().add(HelloFunction.class)
                 .add(HashFunction.class)
                 .add(RedactFunction.class)
                 .add(BlockFunction.class)
                 .build();
    }
}