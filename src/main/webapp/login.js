function sendLoginRequest(){
    sendRequest.getUserAndPass();
}

var sendRequest = {
    getUserAndPass : function() {
        var username = $("#usr").val();
        var password = $("#pwd").val();
        console.log(username + "!!!" + password);
        sendRequest.sendReqToServer(username);
    },

    sendReqToServer : function(user){
        $.ajax({
            "url" : "http://localhost:8080//login",
            data : {
                "token" : user
            },
            "error" : function(){
                var message = "ERROR";
                console.log(message);
            },
            "success" : function(response) {
                var message = "SUCCESS";
                console.log(message);
                //window.location.href = response.redirect;
            }
        });
    }
}