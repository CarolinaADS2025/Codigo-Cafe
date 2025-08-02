# Codigo-Cafe e um blog de Estudos – API com Spring Boot + PostgreSQL 

API RESTful para um blog pessoal de estudos em desenvolvimento e testes de software, desenvolvida com Java + Spring Boot + PostgreSQL.

## API RESTful para um blog pessoal de estudos em desenvolvimento e testes de software, desenvolvida com Java + Spring Boot + PostgreSQL.

## ✅Funcionalidades
 - ✍️ Cadastro de posts com autor, conteúdo, imagem e vídeos
 - 🧠 Organização de aprendizados técnicos
 - 📅 Registro de data de criação e atualização
 - 🖼️ Upload de imagem (como arquivo)
 - 🎥 Upload de vídeo (como link ou arquivo)
 - 📄 Documentação automática com Swagger

## 🚀 Tecnologias Utilizadas
 - Java 17
 - Spring Boot
 - Spring Data JPA
 - PostgreSQL
 - Lombok
 - Maven
 - Swagger (OpenAPI)
 - Spring Validation

## 🏗️ Estrutura do Projeto

```
    src/
    └── main/
        ├── java/
        │   └── com/
        │       └── carol/
        │           └── blog/
        │               ├── controller/
        │               ├── dto/
        │               ├── model/
        │               ├── repository/
        │               ├── service/
        │               ├── config/
        │               ├── exception/
        │               └── BlogApplication.java
        └── resources/
            ├── application.properties
            └── static/
    
```
## ⚙️ Configuração
No arquivo application.properties, configure a conexão com o banco:
```
    spring.datasource.url=jdbc:postgresql://localhost:5432/blog_db
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
    
    spring.servlet.multipart.max-file-size=50MB
    spring.servlet.multipart.max-request-size=50MB
    
```
## ▶️ Como Rodar

### Pré-requisitos
 - Java 17+
 - Maven
 - PostgreSQL rodando

### Passos

```
    # Clone o repositório
    git clone https://github.com/seuusuario/codigo-cafe.git
    
    # Acesse o diretório
    cd codigo-cafe
    
    # Crie o banco de dados manualmente no PostgreSQL
    
    # Rode o projeto
    ./mvnw spring-boot:run
    
```
## Swagger (Documentação)

```
http://localhost:8080/swagger-ui/index.html

```

## 🛠️ Endpoints
| Método | Endpoint        | Descrição             |
| ------ | --------------- | --------------------- |
| POST   | /api/posts      | Criar um novo post    |
| GET    | /api/posts      | Listar todos os posts |
| GET    | /api/posts/{id} | Buscar post por ID    |
| PUT    | /api/posts/{id} | Atualizar post        |
| DELETE | /api/posts/{id} | Deletar post          |

## Upload de Arquivos

 - Use multipart/form-data para envio de imagem ou vídeo nos endpoints de criação/edição.

## 🗄️ Modelo de Dados: Post

| Campo       | Tipo              | Descrição                        |
| ----------- | ----------------- | -------------------------------- |
| id          | Long              | Identificador do post            |
| autor       | String            | Nome da autora                   |
| titulo      | String            | Título do post                   |
| conteudo    | String            | Conteúdo do post                 |
| dataCriacao | LocalDate         | Data em que foi criado           |
| imagem      | byte\[]           | Imagem destacada                 |
| video       | byte\[] ou String | Arquivo de vídeo ou link externo |


## 🤝 Contribuição
```
# Fork o projeto
# Crie sua branch
git checkout -b feature/minha-feature

# Faça o commit
git commit -m "Minha feature"

# Envie sua branch
git push origin feature/minha-feature

# Abra um Pull Request
```
## 📜 Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE.

## 👩‍💻 Autor

Desenvolvido com 💙 por Carolina Mesquita
Blog pessoal para estudos de Desenvolvimento e Teste de Software