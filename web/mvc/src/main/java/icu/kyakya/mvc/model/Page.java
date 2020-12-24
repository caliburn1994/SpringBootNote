package icu.kyakya.mvc.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@Slf4j
public class Page<T> {

    public Page(List<T> data) {
        this.data = data;
    }

    private List<T> data;
    private int recordsFiltered;
    private int recordsTotal;
    @NotNull //校验器 todo
    private int draw;


    /**
     * 校验器所在的method必须以get开头
     * todo 当校验结果为失败时候，如何信息，并返回view对应信息。或者说不应该捕捉
     * todo override ConstraintValidator default message in Spring-MVC
     * todo 如何自定义校验器
     * todo 如何多语言化 view的文字 https://stackoverflow.com/questions/5273958/how-to-use-springmessage-inside-an-attribute-of-forminput
     * todo https://spring.io/guides/gs/validating-form-input/  public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {
     * todo spring exception catch and redirect
     */
    @AssertTrue(message = "message111")
    public boolean getValid1(){
        log.info("校验器遍历成功");
        return true;
    }

}
