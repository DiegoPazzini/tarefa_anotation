# tarefa_anotation

Módulo 18

Em Java, as anotações são metadados que podem ser adicionados a classes, métodos, variáveis ​​e outros elementos do código para fornecer informações adicionais ou instruções ao compilador ou a outras ferramentas de desenvolvimento.

As anotações são definidas usando o símbolo "@" seguido do nome da anotação, seguido de parâmetros opcionais. Algumas anotações são fornecidas pela própria linguagem Java, como `@Override` e `@Deprecated`, enquanto outras podem ser criadas pelo desenvolvedor.

As anotações em Java podem ter diferentes finalidades, como:

1. Informar ao compilador para realizar verificações ou ações específicas durante a compilação.
2. Fornecer informações para ferramentas de desenvolvimento ou frameworks.
3. Controlar o comportamento em tempo de execução.

Por exemplo, a anotação `@Override` é usada para indicar que um método está sobrescrevendo um método da classe pai. Isso permite que o compilador detecte erros de digitação ou assinatura de método incorreta durante a compilação.

Nesse código há uma anotação personalizada chamada `@tabelaAnotation`. Essa anotação é usada para marcar a declaração da lista `nomeTabela` e tem um parâmetro chamado "tabela" que recebe um array de strings.

`@Documented`: Essa anotação é usada para indicar que a anotação deve ser incluída na documentação gerada automaticamente. Normalmente, as anotações não são incluídas na documentação gerada, mas com o uso dessa anotação, é possível garantir que a anotação seja documentada e apareça na documentação gerada para a classe, método ou elemento anotado.

`@Retention(RetentionPolicy.RUNTIME)`: Essa anotação é usada para especificar a política de retenção da anotação. Nesse caso, `RetentionPolicy.RUNTIME` indica que a anotação deve ser retida durante a execução do programa e pode ser acessada e processada em tempo de execução por meio de reflexão. Isso significa que é possível recuperar e usar essa anotação durante a execução do programa.

`@Target(value = {LOCAL_VARIABLE})`: Essa anotação é usada para especificar os elementos aos quais a anotação pode ser aplicada. Nesse caso, `LOCAL_VARIABLE` especifica que a anotação pode ser aplicada a variáveis locais.

Em resumo, essas anotações estão sendo usadas para indicar que a anotação em questão deve ser documentada, retida em tempo de execução e pode ser aplicada a variáveis locais.

## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
