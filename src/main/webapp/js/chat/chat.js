$(function(){
    /*
     *监听三种状态的变化 。js会回调
     */
    ws.onopen = function(message) {
        console.log("oncpen");
    };
    ws.onclose = function(message) {
        ws.close();
    };
    ws.onmessage = function(message) {
        console.log("onmessage");
    };
    $(".send").click = send();

});

//发送消息
function send() {
    console.log("send....");
    var message = $(".message").val();
    var friend = friend;
    var username = username;
    var str = "{username:" + username + ",context:" + message + ",target:" + friend + "}";
    var $context = $(".context");
    var context = $context.html();
    $context.html(context + "你说：" + msg + "<br/>");
    ws.send(str);
    $(".message").val("");
}
function showMessage(message) {
    console.log("showMessage....");
    var $context = $("#context");
    $context.html($context.html() + message.username + "说：" + message.context + "<br/>");
}

function showFriends(message) {
    console.log("showFriends...." + ":" + message);
    var html = $("#showFriends").html();
    var username = $("#username").val();
    html = html + '<a target="_blank" href="/chatting.do?username=' + username + '&friend=' + message + '">' + message + '</a>';
    $("#showFriends").html(html);
}

function showAdvice(name) {
    console.log("showAdvice....");
    var showAdvice = document.getElementById("showAdvice");
    showAdvice.removeAttribute("hidden");
    showAdvice.innerHTML = name +"上线了";
    setTimeout(function(){
        showAdvice.setAttribute("hidden","hidden");
    },2000);
}
