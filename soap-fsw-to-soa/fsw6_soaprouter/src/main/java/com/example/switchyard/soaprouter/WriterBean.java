package com.example.switchyard.soaprouter;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(Writer.class)
public class WriterBean implements Writer {

    @Inject
    @Reference
    private Out out;
    
    @Override
    public void process(String s) {
        System.out.println("=============================");
        System.out.println("WriterBean [" + s + "]");
        System.out.println("=============================");       
        out.process(" <sayHi>"
                + "<arg0>BLAH</arg0>"
                + "<customType>"
                + "<type>foo</type>"
                + "<subType>"
                + "<type>foo</type>"
                + "<type2>"
                + "<type>foo</type>"
                + "</type2>"
                + "</subType>"
                + "</customType>"
                + "</sayHi>");
    }

}
