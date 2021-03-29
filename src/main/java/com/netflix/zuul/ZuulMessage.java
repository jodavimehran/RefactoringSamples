package com.netflix.zuul;

import java.util.List;

public class ZuulMessage {

    private static final List<String> DEFAULT_ERROR_ENDPOINT = null;
    private static final Logger LOG = new Logger();

    protected ZuulFilter getErrorEndpoint(ZuulMessage msg) {
        SessionContext context = msg.getContext();
        String endpointName = context.getErrorEndpoint();
        //...
        ZuulFilter errorEndpoint = getFilterByNameAndType(
                endpointName,
                FilterType.ENDPOINT);
        if (errorEndpoint == null) {
            String errorStr = "..." + endpointName;
            LOG.error("..." + errorStr, context.getError());
        }
        return errorEndpoint;
    }

    private ZuulFilter getFilterByNameAndType(String endpointName, FilterType endpoint) {
        return null;
    }

    private SessionContext getContext() {
        return null;
    }


}
