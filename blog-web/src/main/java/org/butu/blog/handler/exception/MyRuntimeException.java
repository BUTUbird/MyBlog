package org.butu.blog.handler.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.butu.blog.ResultInfo;

/**
 * @author BUTUbird
 */

@Data
public class MyRuntimeException extends RuntimeException{

    private String code;
    private String message;

    public MyRuntimeException(ResultInfo resultInfo){
        this.code = resultInfo.getCode();
        this.message = resultInfo.getMessage();
    }

}
