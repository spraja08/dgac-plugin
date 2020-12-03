/**
* @author  Raja SP
*/
package com.aws.dgac.plugin;

import com.facebook.presto.spi.function.Description;
import com.facebook.presto.spi.function.ScalarFunction;
import com.facebook.presto.spi.function.SqlNullable;
import com.facebook.presto.spi.function.SqlType;
import com.facebook.presto.spi.function.TypeParameter;
import com.facebook.presto.spi.type.StandardTypes;
import io.airlift.slice.Slice;
import io.airlift.slice.Slices;

//Build using clean package -Dcheckstyle.skip=true -Dcheckstyle.skipExec=true
@Description("Block Function")
@ScalarFunction(alias="aws_dgac_block", calledOnNullInput=true) // method name
public class BlockFunction {
    @TypeParameter("T")
    @SqlType(StandardTypes.VARCHAR)
    public static Slice aws_dgac_block(@SqlNullable @SqlType("T") Slice str) {
        return Slices.utf8Slice("blocked");
    }

    @TypeParameter("T")
    @SqlType(StandardTypes.VARCHAR)
    public static Slice aws_dgac_block(@SqlNullable @SqlType("T") Long str) {
        return Slices.utf8Slice("blocked");
    }

    @TypeParameter("T")
    @SqlType(StandardTypes.VARCHAR)
    public static Slice aws_dgac_block(@SqlNullable @SqlType("T") Double str) {
        return Slices.utf8Slice("blocked");
    }

    @TypeParameter("T")
    @SqlType(StandardTypes.VARCHAR)
    public static Slice aws_dgac_block(@SqlNullable @SqlType("T") Integer str) {
        return Slices.utf8Slice("blocked");
    }
}