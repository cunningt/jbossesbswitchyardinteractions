package com.example.switchyard.httprouter;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(value = Foo.class, name = "FooService")
public class FooServiceBean implements Foo {

    @Inject
    @Reference
    private Out out;
    
    @Override
    public void process(String s) {
        System.out.println("FooServiceBean [" + s + "]");
        out.process("foo");
    }

}
