package com.thoughtworks.utils;

import java.io.*;

class FakePrintStream extends PrintStream {


    public FakePrintStream(OutputStream out) {
        super(out);
    }

    public FakePrintStream(OutputStream out, boolean autoFlush) {
        super(out, autoFlush);
    }

    public FakePrintStream(OutputStream out, boolean autoFlush, String encoding) throws UnsupportedEncodingException {
        super(out, autoFlush, encoding);
    }

    public FakePrintStream(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public FakePrintStream(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException {
        super(fileName, csn);
    }

    public FakePrintStream(File file) throws FileNotFoundException {
        super(file);
    }

    public FakePrintStream(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException {
        super(file, csn);
    }

    @Override
    public void println(){

    }
}
