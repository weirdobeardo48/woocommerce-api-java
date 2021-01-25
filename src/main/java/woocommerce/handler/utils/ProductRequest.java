package woocommerce.handler.utils;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import woocommerce.entity.StoreInformation;
import woocommerce.entity.product.ProductVariable;
import woocommerce.handler.APIHandler;
import woocommerce.handler.IRequest;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class ProductRequest extends APIHandler implements IRequest {
    private final String URL;

    public ProductRequest() {
        this.URL = String.format("%s/wp-json/wc/%s/products", storeInformation.getURL(), WoocommerceAPIVersion.values()[API_VERSION - 1] + "");
    }

    /**
     * @param id id of product
     * @return return ProductVariable
     */
    @Override
    public String GET(int id) {
        try {
            return RequestUtils.getRequest(String.format("%s/%d", URL, id
            ), headers, ignoreSSLError);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param params
     * @return
     */
    @Override
    public String GET(Map<String, String> params) {
        try {
            return RequestUtils.getRequest(URL, headers, params, ignoreSSLError);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @param data
     * @return
     */
    @Override
    public String POST(Map<Object, Object> data) {
        try {
            return RequestUtils.postRequest(URL, headers, data, ignoreSSLError);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String PUT(int id, Map<Object, Object> data) {
        try {
            return RequestUtils.putRequest(URL, headers, data, ignoreSSLError);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String POST(String data) {
        try {
            return RequestUtils.postRequest(URL, headers, data, ignoreSSLError);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String DELETE(int id) {
        try {
            return RequestUtils.deleteRequest(String.format("%s/%d", URL, id), headers, ignoreSSLError);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
