package org.academiadecodigo.gitbusters.TeamCharlie.Server;

public class Main {
    public static void main(String[] args) {

        int port = ChatServer.DEFAULT_PORT;

        ChatServer chatServer = new ChatServer();
        chatServer.start(port);




    }

}
