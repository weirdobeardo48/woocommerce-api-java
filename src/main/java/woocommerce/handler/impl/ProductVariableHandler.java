package woocommerce.handler.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import woocommerce.entity.StoreInformation;
import woocommerce.entity.product.ProductVariable;
import woocommerce.exception.product.CannotCreateProductException;
import woocommerce.handler.APIHandler;
import woocommerce.handler.IWoocommerce;
import woocommerce.handler.utils.ProductRequest;
import woocommerce.handler.utils.WoocommerceAPIVersion;
import woocommerce.utils.ReflectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author TruongNX25
 */

public class ProductVariableHandler extends APIHandler implements IWoocommerce<ProductVariable> {
    private static final Logger LOG = Logger.getLogger(ProductVariableHandler.class);

    private final ProductRequest productRequest;

    public ProductVariableHandler() {
        productRequest = new ProductRequest();
    }


    public ProductVariable create(ProductVariable productVariable) {
        if (productVariable != null) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                String data = mapper.writeValueAsString(productVariable);
                String json = productRequest.POST(data);
                return ReflectionUtils.jsonStringToProductVariable(json);
            } catch (JsonProcessingException e) {
                try {
                    throw new CannotCreateProductException(String.format("Cannot create product with:\nData: %s\nStore Information: %s", productVariable.toString(), storeInformation.toString()), e.getCause());
                } catch (CannotCreateProductException ignore) {
                }
            }
        }
        return null;
    }

    public List<ProductVariable> getAll() {
        return null;
    }

    public ProductVariable get(int id) {
        String json = productRequest.GET(id);
        return ReflectionUtils.jsonStringToProductVariable(json);
    }


    public boolean update(int id, Map<Object, Object> data) {
        String json = productRequest.PUT(id, data);
        return ReflectionUtils.jsonStringToProductVariable(json) == null;
    }

    public boolean delete(int id) {
        String json = productRequest.DELETE(id);
        return ReflectionUtils.jsonStringToProductVariable(json) != null;
    }

    public List<ProductVariable> batchUpdate(List<ProductVariable> productVariables) {
        return null;
    }


}
