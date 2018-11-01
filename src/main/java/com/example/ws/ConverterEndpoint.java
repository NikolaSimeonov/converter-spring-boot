package com.example.ws;

import com.example.ws.pojo.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigDecimal;
import java.math.RoundingMode;


@Endpoint
public class ConverterEndpoint {

    private static final BigDecimal kmInMiles = new BigDecimal(1.609344).setScale(10, RoundingMode.CEILING);
    private static final BigDecimal milesInKm = new BigDecimal(0.621371192).setScale(10, RoundingMode.CEILING);



    @PayloadRoot(namespace = "http://spring.io/guides/gs-producing-web-service", localPart = "distanceInKmRequest")
    public @ResponsePayload DistanceInKmResponse getDistanceInKm(@RequestPayload  DistanceInKmRequest distanceInKmRequest) {

        DistanceInKmResponse distanceInKmResponse = new DistanceInKmResponse();
        distanceInKmResponse.setDistanceInKm(kmInMiles.multiply(distanceInKmRequest.getDistanceInMiles()));
        return distanceInKmResponse;
    }

    @PayloadRoot(namespace = "http://spring.io/guides/gs-producing-web-service", localPart = "distanceInMilesRequest")
    public @ResponsePayload DistanceInMilesResponse getDistanceInMiles(@RequestPayload  DistanceInMilesRequest distanceInMilesRequest) {

        DistanceInMilesResponse distanceInMilesResponse = new DistanceInMilesResponse();
        distanceInMilesResponse.setDistanceInMiles(milesInKm.multiply(distanceInMilesRequest.getDistanceInKm()));
        return distanceInMilesResponse;
    }


}
