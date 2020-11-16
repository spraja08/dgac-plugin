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
public class HelloFunction {
    @Description("Hello Function")
    @ScalarFunction("aws_dgac_hello") // method name
         @SqlType(StandardTypes.VARCHAR) //Return type
    public static Slice aws_dgac_hello(@SqlType(StandardTypes.VARCHAR) Slice str) {
        String value=str.toStringUtf8();
        return Slices.utf8Slice("Hello "+value);
    }
}