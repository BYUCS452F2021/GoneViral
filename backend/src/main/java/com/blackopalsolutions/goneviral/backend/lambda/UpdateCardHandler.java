package com.blackopalsolutions.goneviral.backend.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.blackopalsolutions.goneviral.backend.model.request.UpdateCardRequest;
import com.blackopalsolutions.goneviral.backend.model.response.Response;
import com.blackopalsolutions.goneviral.backend.service.CardService;

public class UpdateCardHandler implements RequestHandler<UpdateCardRequest, Response> {

    /**
     * Handles a request to update a card.
     * @param request the request to update a card.
     * @param context the request context.
     * @return whether or not it was a success.
     */
    @Override
    public Response handleRequest(UpdateCardRequest request, Context context) {
        return (new CardService()).updateCard(request);
    }
}
