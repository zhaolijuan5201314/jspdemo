$(window).ready(function() {
    var message = $("#messageDiv").html();
    console.info(message);

    $("#sumbit").on("click", function(){
        var userName = $("[name='userName']").val();
        var password = $("[name='password']").val();

        $.ajax({
            url : "http://localhost:8080/login.json",
            type: "post",
            data : {userName : userName, password : password},
            success: function(data){
                alert(data);
            }
        });
    });
});
