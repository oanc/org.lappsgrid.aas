package org.lappsgrid.licensing.core

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

/**
 * @author Keith Suderman
 */
public class SecurityManager
{
    //public static final int SALT_SIZE = 24;

    //public static final String ALGORITHM = "SHA-512";

    private static MessageDigest md;
    private static SecureRandom rng;

    static {
        rng = new SecureRandom();
        try
        {
            md = MessageDigest.getInstance("SHA-512");
        }
        catch (NoSuchAlgorithmException e)
        {
            //TODO This should not be ignoredl
        }
    }

    private SecurityManager() { }

    public static String hash(String input)
    {
        return toHexString(md.digest(input.getBytes()));
    }

    public static String getSalt() {
        return getSalt(24);
    }

    public static String getSalt(int size)
    {
        byte[] bytes = new byte[size];
        rng.nextBytes(bytes);
        return toHexString(bytes, 2 * size);
    }

    public static UUID getUUID()
    {
        return UUID.randomUUID();
    }

    public static String toHexString(byte[] bytes)
    {
        return toHexString(bytes, 128);
    }

    public static String toHexString(byte[] bytes, int width)
    {
        String formatString = "%0" + width + "x";
        return String.format(formatString, new BigInteger(1, bytes));
    }

    /** Converts a hex string into a BigInteger object. */
    public static BigInteger toBigInt(String number)
    {
        return new BigInteger(number, 16);
    }
}
