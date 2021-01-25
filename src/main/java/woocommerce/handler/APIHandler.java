package woocommerce.handler;

import woocommerce.entity.StoreInformation;

import java.util.Map;

public class APIHandler {
    protected Map<String, String> headers;
    protected StoreInformation storeInformation;
    protected boolean ignoreSSLError;
    protected int API_VERSION = 3;
}
