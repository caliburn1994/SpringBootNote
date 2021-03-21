package icu.kyakya.mvc.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * example: https://spring.io/blog/2013/11/01/exception-handling-in-spring-mvc
 * <p>
 * see here {@link org.springframework.web.bind.annotation.ExceptionHandler}, you can know what parameters can be used.
 */
@ControllerAdvice
@Slf4j
class GlobalControllerExceptionHandler {

    /**
     * when this is configured: {@code spring.mvc.throwExceptionIfNoHandlerFound: true}
     * ControllerAdvice can catch the exception
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle404(Model model, HttpServletRequest req, Exception ex) {
        return "/exceptions/404";
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({SQLException.class, DataAccessException.class})
    public String databaseError(HttpServletRequest req, Exception ex) {
        log.warn(ex.getMessage());
        return "/exceptions/500";
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public String handle500(HttpServletRequest req, Exception ex) {
        log.warn(ex.getMessage());
        return "/exceptions/500";
    }

}
