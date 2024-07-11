<p align="center"><img src="https://github.com/quasiEvil/ONE-DesafiosJava01/assets/140989367/629c3fbc-8343-4218-9383-cae3a8a329c1" height="60">
<br>
<img src="https://github.com/quasiEvil/ONE-DesafiosJava01/assets/140989367/ad683805-6a3c-4eb0-aee6-6c611b9d5340" height="10"> & <img src="https://github.com/quasiEvil/ONE-DesafiosJava01/assets/140989367/df751b45-3b7f-4297-a3c2-08d983be89b6" height="15">
</p>

# Fase 3 - Especialização Backend com Java e Spring

## Conversor de Moedas
Este aplicativo Java permite aos usuários converter entre diferentes moedas usando taxas de câmbio em tempo real obtidas da ExchangeRate-API. Ele oferece uma interface de menu fácil de usar para selecionar opções de conversão.

👩🏻‍🎓 [Certificado de conclusão](https://cursos.alura.com.br/certificate/quasiEvil/praticando-java-construindo-conversor-moedas)

## Funcionalidades
- **Interface por Menu:** Escolha entre várias opções de conversão de moeda.
- **Taxas de Câmbio em Tempo Real:** Obtém taxas de câmbio atuais da ExchangeRate-API.
- **Moedas Suportadas:** Suporta conversões entre USD, ARS, BRL e EUR.

## Requisitos
- Kit de Desenvolvimento Java (JDK)
- IntelliJ IDEA (recomendado) ou qualquer IDE Java
- Chave da ExchangeRate-API (armazenada em `config.properties`)

## Instalação e Configuração
1. Clone o repositório:

```bash
git clone https://github.com/seu-nome/conversor-de-moedas.git
```
2. Abra o projeto no IntelliJ IDEA ou na sua IDE Java preferida.

3. Crie um arquivo config.properties na pasta raiz e adicione sua chave da ExchangeRate-API:

```properties
exchange.rate.api.key=sua_chave_api_aqui
```
4. Execute o arquivo `CurrencyConverter.java`.

## Uso
- Ao executar o aplicativo, um menu exibirá várias opções de conversão de moeda.
- Escolha sua opção e forneça o valor a ser convertido.
- O aplicativo exibirá o valor convertido com base nas taxas de câmbio em tempo real.

## Demo
