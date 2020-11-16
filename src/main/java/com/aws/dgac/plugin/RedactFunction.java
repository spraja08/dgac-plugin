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
public class RedactFunction {
    @Description("Redact Function")
    @ScalarFunction("aws_dgac_redact") // method name
    @SqlType(StandardTypes.VARCHAR) // Return type
    public static Slice aws_dgac_redact(@SqlType(StandardTypes.VARCHAR) Slice str) {
        String input = str.toStringUtf8();
        String redactedString = new StringBuilder(input)
                .replace(0, input.length() - 4, new String(new char[input.length() - 4]).replace("\0", "x")).toString();
        return Slices.utf8Slice(redactedString);
    }
}