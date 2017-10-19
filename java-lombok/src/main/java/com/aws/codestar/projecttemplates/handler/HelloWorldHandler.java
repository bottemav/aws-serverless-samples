package com.aws.codestar.projecttemplates.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

import com.aws.codestar.projecttemplates.GatewayResponse;
import com.aws.codestar.projecttemplates.model.HelloWorldCmd;

/**
 * Handler for requests to Lambda function.
 */
public class HelloWorldHandler implements RequestHandler<HelloWorldCmd, GatewayResponse> {

    public GatewayResponse handleRequest(final HelloWorldCmd input, final Context context) {
        System.out.println("Input: " + input);
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");
        System.err.println("This is a test log message 1");
        System.err.println("This is a test log message 2");
        return new GatewayResponse("{ \"Output\": \"Hello " + input.getName() + "\"}", headers, 200);
    }
}
