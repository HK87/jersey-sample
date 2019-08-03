package com.hk87.jersey.sample.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** APIの基底クラス */
public class AbstractApi {

    protected static final Logger logger = LogManager.getLogger();

    protected static String convertToJsonFrom(Object target) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(target);
        } catch (JsonProcessingException e) {
            logger.error("json形式への変換に失敗" + e.getStackTrace());
            throw new InternalError();
        }
    }
}
