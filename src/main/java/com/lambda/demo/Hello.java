package com.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<LambdaRequest, LambdaResponse> {
    @Override
    public LambdaResponse handleRequest(LambdaRequest request, Context context) {
        System.out.printf("Request land on lambda function");
        if (request != null) {
            System.out.printf(" Request  = " + request.getBody());
        }
        LambdaResponse response = new LambdaResponse();
        response.setBody("Hello from java Lambda!");
        response.setStatusCode("200");
        System.out.printf("Response from lambda -- body = " + response.getBody() + ", code = " + response.getStatusCode());
        return response;
    }
}
