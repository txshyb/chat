var username = name;
var target = "ws://localhost:8080/chat/message"
if(username != null && username != '') {
    target = "ws://localhost:8080/chat/"+username;
}
var ws ;
if(ws == null) {
    ws = new WebSocket(target);
}
//var ws = new WebSocket("ws://localhost:8080/chat");