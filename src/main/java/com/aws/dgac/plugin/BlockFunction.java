/**
* @author  Raja SP
*/
package com.aws.dgac.plugin;

import com.facebook.presto.spi.function.Description;
import com.facebook.presto.spi.function.ScalarFunction;
import com.facebook.presto.spi.function.SqlType;
import com.facebook.presto.spi.type.StandardTypes;
import io.airlift.slice.Slice;
import io.airlift.slice.Slices;

//Build using clean package -Dcheckstyle.skip=true -Dcheckstyle.skipExec=true
public class BlockFunction {
    @Description("Block Function")
    @ScalarFunction("aws_dgac_block") // method name
    @SqlType(StandardTypes.VARCHAR) // Return type
    public static Slice aws_dgac_block(@SqlType(StandardTypes.VARCHAR) Slice str) {
        return Slices.utf8Slice("blocked");
    }
}