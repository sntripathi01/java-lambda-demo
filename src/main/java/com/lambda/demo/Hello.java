package com.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class Hello implements RequestHandler<Map<String, String>, LambdaResponse> {
    @Override
    public LambdaResponse handleRequest(Map<String, String> requestMap, Context context) {
        System.out.printf("Request land on lambda function");
        if (requestMap != null) {
            requestMap.forEach((s, s2) -> {
                System.out.printf("Request key = " + s);
                System.out.printf("Request value = " + s2);
            });
        }
        LambdaResponse response = new LambdaResponse();
        response.setBody("com.lambda.demo.Hello from java Lambda!");
        response.setStatusCode("200");
        System.out.printf("Response from lambda -- body = " + response.getBody() + ", code = " + response.getStatusCode());
        return response;
    }
}
