package org.butu.blog.handler.exception;

import org.butu.blog.Result;
import org.butu.blog.ResultInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author BUTUbird
 */
@ControllerAdvice
public class GlobalException {


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exception(Exception e){
        e.printStackTrace();
        return Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
    }

    @ExceptionHandler(MyRuntimeException.class)
    @ResponseBody
    public Result myRuntimeException(MyRuntimeException e){
        e.printStackTrace();
        return Result.error().codeAndMessage(e.getCode(),e.getMessage());
    }
}
