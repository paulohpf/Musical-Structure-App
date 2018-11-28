# Musical Structure - Project Specification

[![N|Solid](https://raw.githubusercontent.com/paulohpf/Musical-Structure-App/master/images/Screenshot_1543375097.png)](https://raw.githubusercontent.com/paulohpf/Musical-Structure-App/master/images/Screenshot_1543375097.png) [![N|Solid](https://raw.githubusercontent.com/paulohpf/Musical-Structure-App/master/images/Screenshot_1543375100.png)](https://raw.githubusercontent.com/paulohpf/Musical-Structure-App/master/images/Screenshot_1543375100.png) [![N|Solid](https://raw.githubusercontent.com/paulohpf/Musical-Structure-App/master/images/Screenshot_1543375104.png)](https://raw.githubusercontent.com/paulohpf/Musical-Structure-App/master/images/Screenshot_1543375104.png) [![N|Solid](https://raw.githubusercontent.com/paulohpf/Musical-Structure-App/master/images/Screenshot_1543375110.png)](https://raw.githubusercontent.com/paulohpf/Musical-Structure-App/master/images/Screenshot_1543375110.png)

App Design
----------

#### Adequação
A estrutura do aplicativo é adequada a um reprodutor de música. Um aplicativo similarmente estruturado, que foca em audiobooks, podcasts ou outras mídias de áudio também é aceitável.

#### Clareza
O propósito de cada activity é facilitar a compreensão do design da UI e rotulagem pelo usuário.

#### Number of activities
The app contains 3.


Layout
----------

#### Estrutura
O aplicativo contém diversas activities, todas rotuladas(descrição da sua funcionalidade) e, juntas, formando um aplicativo coeso.

#### Rotulagem
Os recursos do aplicativo são definidos claramente, seja por textos ou imagens. Por exemplo, um botão que toca música poderia usar um triângulo reconhecido universalmente como símbolo de "Play" ou ter "Play" escrito.

#### Botões
Todas as activities contêm botão(ões) que se conectam a outras activities que um usuário seja capaz de atingir daquela activity. Por exemplo, uma activity ‘Biblioteca’ deve conter um botão para mudar para a activity ‘Tocando agora’ (em reprodução).

#### Boas práticas de layout
O código segue todas as práticas recomendadas a seguir:
- Os tamanhos de texto são definidos em sp
- Comprimentos são definidos em dp
- O preenchimento e a margem são usados de forma apropriada, de forma que as views não se encaixem entre si.


Funcionalidade
----------

#### Erros de execução
O código é executado sem erros.

#### OnClickListeners
Cada botão possui uma ação de click e utiliza o método *OnClickListener* no código Java e não utiliza o atributo android:onClick no Layout XML.

#### Intents
Todos os botões abrem corretamente a activity desejada usando uma intent explícita.


Qualidade do código
----------

#### Formatação do código
O código é formatado de maneira adequada:

-Sem linhas em branco desnecessárias
-Sem métodos e variáveis inutilizados
-Nenhum código comentado

O código também possui indentação adequada ao definir variáveis e métodos.

#### Legibilidade
O código pode ser lido com facilidade, para que outros programadores possam compreender o propósito do aplicativo.

#### Convenções de nomenclatura
Todas as IDs de recurso, métodos e variáveis são nomeadas de forma descritiva, para que outros desenvolvedores que lerem o código compreendam facilmente sua função.