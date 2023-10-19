package tarefa_anotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {LOCAL_VARIABLE})
public @interface tabelaAnotation {

    String[] tabela();

}