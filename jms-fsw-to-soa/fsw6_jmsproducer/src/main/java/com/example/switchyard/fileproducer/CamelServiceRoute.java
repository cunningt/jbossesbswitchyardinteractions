package com.example.switchyard.fileproducer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.switchyard.common.camel.SwitchYardMessage;

public class CamelServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://FooService").log(
				"Received message for 'FooService' : ${body}")
				.process(new Processor() {
                @Override
                public void process(Exchange exchange) throws Exception {
                    SwitchYardMessage out = new SwitchYardMessage();
                    out.setBody("Date : " + System.currentTimeMillis());
                    exchange.setOut(out);
                }
            })
				.to("file:/tmp/fileproducer");
	}

}
