$(function () {
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
    //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
    window.onbeforeunload = function() {
        ws.close();
    };
    getList();
});

function getList() {
    $.ajax({
        url:"/login/getList.do",
        type:"post",
        dataType:"json",
        success:function(data) {
            console.log(data);
            var html = '';
            for(var i = 0;i < data.length;i++) {
                html = html + "<li><a href='/chat/toChat.do?friend='" + data[i] + ">str</a></li>";
            }
            $(".list").html(html);
        }
    });
}
