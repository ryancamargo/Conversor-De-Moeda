<h1 align="center">Conversor de Moeda</h1>

![Static Badge](https://img.shields.io/badge/status-em_desenvolvimento-green)
![Static Badge](https://img.shields.io/badge/license-MIT-blue)

# :writing_hand: Descrição do Projeto
Este projeto foi desenvolvido como parte do primeiro desafio da Fase 2 do programa Alura One Oracle Next Education. O objetivo é construir um Conversor de Moedas que permite aos usuários realizar conversões dinâmicas e em tempo real entre diferentes moedas, diretamente pelo console. A aplicação utiliza a linguagem Java para fazer requisições a uma API de taxas de câmbio, manipula dados JSON e oferece uma interface de usuário textual.

## API Utilizada:

Para obter as taxas de câmbio, o projeto utiliza a API <a href="https://www.exchangerate-api.com/">Exchangerate-API</a>. Essa API permite realizar requisições HTTP para buscar as cotações mais atualizadas entre pares de moedas. A Exchangerate-API é uma plataforma confiável que oferece dados rápidos e precisos para conversões de moeda, ideal para aplicações que exigem atualizações em tempo real.

Ao realizar uma conversão, o aplicativo faz uma requisição à API com os códigos das moedas de origem e destino, e o valor a ser convertido. A resposta JSON da API contém a taxa de conversão atualizada, que é utilizada para calcular o valor convertido. Esse processo garante que as taxas de câmbio sejam sempre precisas, proporcionando uma experiência de conversão confiável e atualizada para o usuário.

## Objetivos e Funcionalidades Principais

O Conversor de Moedas oferece ao usuário um menu de opções para conversão de moedas, com um mínimo de seis pares de moedas diferentes. A aplicação realiza as conversões de maneira dinâmica, utilizando taxas de câmbio atualizadas em tempo real obtidas via API, garantindo precisão e confiabilidade nos resultados.

## Funcionalidades Extras

    - `Histórico de Conversões`: O aplicativo armazena e exibe o histórico das conversões realizadas durante a sessão, proporcionando uma visão completa das atividades do usuário. Isso permite ao usuário revisar suas conversões a qualquer momento antes de encerrar o programa.
    - `Suporte Ampliado para Moedas`: Além das conversões comuns, a aplicação oferece suporte adicional para conversões entre Euro (EUR) e Yuan Chinês (CNY), expandindo as opções disponíveis e aumentando a flexibilidade.
    - `Registros de Logs`: Utilizando a biblioteca java.time, o aplicativo registra a data e a hora de cada conversão realizada, permitindo que o usuário saiba exatamente quando cada operação ocorreu. Esses logs são exibidos juntamente com o histórico no momento de encerramento do programa.

# :hammer: Funcionalidades do Projeto
    - Conversão de Moedas em Tempo Real com API: As conversões são realizadas usando dados atualizados da Exchangerate-API, oferecendo taxas de câmbio precisas.

    - Histórico de Conversões: Exibe um histórico detalhado das transações ao final da sessão, incluindo informações como o valor original, moeda de origem, moeda de destino e valor convertido.

    - Registro de Logs de Conversões: Cada transação é registrada com a data e hora, fornecendo uma visão completa de quando as operações foram realizadas. Esse log é exibido junto com o histórico ao encerrar o programa.

    - Suporte para Moedas Adicionais: Conversões adicionais foram incluídas entre Euro (EUR) e Yuan Chinês (CNY), permitindo uma gama mais ampla de opções para o usuário.

# :open_file_folder: Acesso ao projeto 
Para executar o projeto localmente, siga os passos abaixo:

1. Clone o repositório: Clone este repositório para sua máquina local usando o comando:
    
    `git clone https://github.com/usuario/conversor-de-moedas-java.git`

2. Compile e Execute o Projeto:

    - Abra o projeto em sua IDE de preferência (como IntelliJ ou Eclipse) ou compile diretamente pelo terminal.
    - No terminal, navegue até o diretório do projeto e compile-o com o seguinte comando:
    `javac -d bin src/org/example/*.java`
    - Em seguida, execute o programa:
    `java -cp bin org.example.Main`

3. Utilização do Conversor:

    - O Conversor de Moedas oferece várias opções de conversão. Ao iniciar o programa, selecione a opção de conversão desejada digitando o número correspondente e, em seguida, informe o valor que deseja converter.
    - O programa exibirá o resultado da conversão e manterá um histórico das conversões realizadas.
    - Para encerrar, escolha a opção de sair no menu principal.

4. Histórico de Conversões:

    - Ao finalizar o programa, será exibido um histórico completo das últimas conversões realizadas, incluindo detalhes sobre as moedas envolvidas, o valor convertido e a data e hora de cada transação.

# :computer: Tecnologias utilizadas

![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

# :handshake: Contribuição 
As contribuições são o que tornam a comunidade de código aberto um lugar incrível para aprender, inspirar e criar. Qualquer contribuição que você fizer será muito apreciada.

Se você tiver uma sugestão que possa melhorar o projeto, fork o repositório e faça um pull request. Você também pode simplesmente abrir uma issue com a tag “aprimoramento” ou "enhancement". Não se esqueça de dar uma estrela ao projeto! Obrigado novamente!

1. Fork the Project
2. Create your Feature Branch (git checkout -b feature/AmazingFeature)
3. Commit your Changes (git commit -m 'Add some AmazingFeature')
4. Push to the Branch (git push origin feature/AmazingFeature)
5. Open a Pull Request

# :man_technologist: Desenvolvedores

<a href="https://github.com/ryancamargo">
  <img src="https://github.com/ryancamargo.png" alt="Ryan Camargo" width="100" height="100">
</a>

[Ryan Camargo](https://github.com/ryancamargo)

# :page_with_curl: Licença
The <a target="_blank" href="https://choosealicense.com/licenses/mit/">MIT License</a> (MIT)

Copyright ©️ 2024 - Conversor de Moeda
