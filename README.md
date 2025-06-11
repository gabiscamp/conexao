Projeto: Sistema de Login com Interface Gráfica em Java
Este projeto consiste em uma aplicação desktop desenvolvida com Java Swing que permite o cadastro, login e gerenciamento de usuários. O sistema utiliza um banco de dados para armazenar as informações dos usuários, permitindo realizar autenticação e ações de CRUD (Criar, Ler, Atualizar e Deletar).

Funcionalidades
Tela de Login (TelaLogin)
Campo "Nome": insira seu nome de usuário.
Campo "Senha": insira sua senha.
Botão "Logar": realiza a autenticação do usuário com base nas informações inseridas. Se o login for bem-sucedido, a próxima tela será exibida.
Botão "Cadastrar": cria um novo usuário com os dados informados, caso o login ainda não exista.
Label de resultado: exibe mensagens como "Usuário cadastrado", "Login inválido", entre outras.

Tela de Usuário (UsuariosTela)
Após o login bem-sucedido, a interface de gerenciamento de usuários é exibida, com os seguintes componentes:
Tabela de Usuários: exibe os dados cadastrados (login e senha).
Botão "Atualizar Tabela": recarrega os dados da tabela com os registros mais recentes do banco de dados.
Botão "Deletar": remove o usuário selecionado da tabela e do banco de dados.
Botão "Alterar": permite editar os dados do usuário selecionado.

Como Usar o Projeto
Compile e execute o projeto no NetBeans ou em outro ambiente compatível com Java Swing.
Na primeira tela (Login), você pode:
Inserir um nome de usuário e senha e clicar em “Cadastrar” para criar uma conta.
Inserir um nome de usuário e senha e clicar em “Logar” para acessar o sistema (caso já tenha se cadastrado).

Na tela de gerenciamento:
Clique em “Atualizar Tabela” para ver os dados mais recentes.
Selecione uma linha e clique em “Deletar” para excluir o usuário.
Selecione uma linha e clique em “Alterar” para modificar os dados.
