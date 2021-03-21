package icu.kyakya.mvc.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@Slf4j
class GlobalControllerExceptionHandler {

    /**
     * when this is configured: {@code spring.mvc.throwExceptionIfNoHandlerFound: true}
     * ControllerAdvice can catch the exception
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle404(WebRequest request) {
        return "/exceptions/404";
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public String handle500(Exception exception) {
        log.warn(exception.getMessage());
        return "/exceptions/500";
    }

}
