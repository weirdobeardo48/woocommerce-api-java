package woocommerce.handler;

import woocommerce.entity.StoreInformation;

import java.util.Map;

public interface IRequest {

    String GET(int id);

    String GET(Map<String, String> params);

    String POST(Map<String, String> data);
}
