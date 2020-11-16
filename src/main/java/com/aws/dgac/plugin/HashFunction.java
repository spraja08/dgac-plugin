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

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//Build using clean package -Dcheckstyle.skip=true -Dcheckstyle.skipExec=true
public class HashFunction {
    @Description("Hash Function")
    @ScalarFunction("aws_dgac_hash") // method name
    @SqlType(StandardTypes.VARCHAR) // Return type
    public static Slice aws_dgac_hash(@SqlType(StandardTypes.VARCHAR) Slice str) throws NoSuchAlgorithmException {
        String input = str.toStringUtf8();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(input.getBytes());
        byte[] stringHash = messageDigest.digest();
        return Slices.utf8Slice(new BigInteger(1, stringHash).toString(16).substring(0, 32));
    }
}