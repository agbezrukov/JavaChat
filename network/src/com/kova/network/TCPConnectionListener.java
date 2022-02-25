package com.kova.network;

public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection tcpConnection); // запуск соединения и можно с ним работать
    void onReceiveString(TCPConnection tcpConnection, String value); // соединение приняло строчку входящую
    void onDisconnect(TCPConnection tcpConnection); // соединение отвалилось
    void onException(TCPConnection tcpConnection, Exception e); // что то пошло не так и вернулось исключение
}
