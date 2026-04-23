## Unit Testing - Estudos e Práticas 🧪

Repositório dedicado aos meus estudos práticos sobre testes de unidade, guiados pelo livro **"Unit Testing: Principles, Practices, and Patterns"** do autor Vladimir Khorikov.

O objetivo deste projeto não é apenas aprender a escrever testes, mas entender como escrever testes *valiosos*. O foco está em aplicar boas práticas de design de software (como SOLID e Clean Code) para criar uma suíte de testes que seja resiliente a refatorações e proteja o sistema contra regressões.

## 🛠️ Stack Tecnológica

- **Linguagem:** Java
- **Framework:** Spring Boot
- **Testes:** JUnit 5, Mockito e AssertJ
- **Build/Gerenciamento:** Maven (ou Gradle)

## 📚 Tópicos de Estudo

Ao longo deste repositório, estou documentando e testando na prática os seguintes conceitos abordados no livro:

1. **Os 4 pilares de um bom teste de unidade:**
   - Proteção contra regressões.
   - Resiliência a refatorações.
   - Feedback rápido.
   - Manutenibilidade.
2. **As Escolas de Testes:**
   - Escola Clássica (Detroit).
   - Escola de Londres (Mockist).
3. **Anatomia de um Teste:** Padrão AAA (Arrange, Act, Assert).
4. **Mocks e Stubs:** Quando utilizar, diferenças e como evitar testes frágeis.
5. **Refatoração para Testabilidade:** Como melhorar o design do código de produção para facilitar a criação de testes.
6. **Testes de Integração:** Interações com banco de dados e limites do sistema utilizando recursos do Spring.

## 🚀 Como executar os testes

Para rodar a suíte de testes diretamente via terminal, utilize o comando abaixo na raiz do projeto:

```bash
# Executando todos os testes
./mvnw test
```
