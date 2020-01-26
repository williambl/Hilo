package com.diluv.hilo.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public final class SQLHandler {
    private SQLHandler () {

    }

    public static String readFile (String filename) {

        try {
            final File f = new File(SQLHandler.class.getClassLoader().getResource("db/query/" + filename + ".sql").getFile());
            return FileUtils.readFileToString(f, Charset.defaultCharset());
        }
        catch (final IOException e) {
            e.printStackTrace();
            // TODO Throw exception(crash?)
        }
        return null;
    }
}