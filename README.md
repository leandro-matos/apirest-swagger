# Api Rest com o Swagger-ui.

### O deploy está no Heroku: https://leandro-apirest-produtos.herokuapp.com/swagger-ui.html


* Acesso para lista de produtos: https://leandro-apirest-produtos.herokuapp.com/api/produtos

* Acesso apenas um produto: https://leandro-apirest-produtos.herokuapp.com/api/produto/{id}

* Salvar, Atualizar e Deletar um produto: https://leandro-apirest-produtos.herokuapp.com/api/produto/


* Estrutura de Projeto:

```
│   .classpath
│   .gitignore
│   .project
│   HELP.md
│   mvnw
│   mvnw.cmd
│   pom.xml
│
├───.mvn
│   └───wrapper
│           maven-wrapper.jar
│           maven-wrapper.properties
│           MavenWrapperDownloader.java
│
├───.settings
│       org.eclipse.core.resources.prefs
│       org.eclipse.jdt.core.prefs
│       org.eclipse.m2e.core.prefs
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───produtos
│   │   │           └───apirest
│   │   │               │   ApirestApplication.java
│   │   │               │
│   │   │               ├───config
│   │   │               │       SwaggerConfig.java
│   │   │               │
│   │   │               ├───models
│   │   │               │       Produto.java
│   │   │               │
│   │   │               ├───repository
│   │   │               │       ProdutoRepository.java
│   │   │               │
│   │   │               └───resources
│   │   │                       ProdutoResource.java
│   │   │
│   │   └───resources
│   │       │   application.properties
│   │       │
│   │       └───templates
│   │               index.html
│   │
│   └───test
│       └───java
│           └───com
│               └───produtos
│                   └───apirest
│                           ApirestApplicationTests.java
│
└───target
    ├───classes
    │   │   application.properties
    │   │
    │   ├───com
    │   │   └───produtos
    │   │       └───apirest
    │   │           │   ApirestApplication.class
    │   │           │
    │   │           ├───config
    │   │           │       SwaggerConfig.class
    │   │           │
    │   │           ├───models
    │   │           │       Produto.class
    │   │           │
    │   │           ├───repository
    │   │           │       ProdutoRepository.class
    │   │           │
    │   │           └───resources
    │   │                   ProdutoResource.class
    │   │
    │   └───templates
    │           index.html
    │
    ├───generated-sources
    │   └───annotations
    ├───maven-status
    │   └───maven-compiler-plugin
    │       └───compile
    │           └───default-compile
    │                   createdFiles.lst
    │                   inputFiles.lst
    │
    └───test-classes
        └───com
            └───produtos
                └───apirest
                        ApirestApplicationTests.class
						
```

