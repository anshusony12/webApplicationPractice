<%-- 
    Document   : Signup
    Created on : 5 Apr, 2020, 12:43:42 AM
    Author     : Anshu Sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

    </head>
    <body style="background: url(image/back.jpg.jpg);background-size: cover;background-attachment: fixed">
        <div class="Container">
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content" style="border:2px solid black;outline: solid darkred thick">
                            <h3 style="margin: 10px; color: brown" class="center-align">Register Here !</h3>
                            <h5 id="msg"></h5>
                            <div class="form center-align">
                                <form action="Register.java" method="post" id="myform">
                                    <input type="text" name="user_name" placeholder="Enter your name">
                                    <input type="email" name="user_email" placeholder="Enter your email">
                                    <input type="password" name="user_password" placeholder="Enter your password">
                                    <div class="file-field input-field">
                                        <div class="btn">
                                            <span>File</span>
                                            <input name="image" type="file">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                        </div>
                                    </div>
                                    <button class="btn deep-red" type="submit" name="action">Submit</button>

                                </form>
                            </div>
                            <div class="loader center-align" style="margin-top: 10px; display: none">
                                <div class="preloader-wrapper big active">
                                    <div class="spinner-layer spinner-blue">
                                        <div class="circle-clipper left">
                                            <div class="circle"></div>
                                        </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                    </div>

                                    <div class="spinner-layer spinner-red">
                                        <div class="circle-clipper left">
                                            <div class="circle"></div>
                                        </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                    </div>

                                    <div class="spinner-layer spinner-yellow">
                                        <div class="circle-clipper left">
                                            <div class="circle"></div>
                                        </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                    </div>

                                    <div class="spinner-layer spinner-green">
                                        <div class="circle-clipper left">
                                            <div class="circle"></div>
                                        </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                    </div>
                                </div>
                                <h3>Please wait....</h3>

                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>
        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
            crossorigin="anonymous">

        </script>

        <script>
            $(document).ready(function () {
                console.log("page is ready");
                $("#myform").on('submit', function (event) {
                    event.preventDefault();
                    let f = new FormData(this);
                    console.log(f);
                    $(".loader").show();
                    $("#myform").hide();

                    $.ajax({
                        url: "Register",
                        data: f,
                        type: 'POST',
                        success: function (data, textStatus, jqXHR) {
                            console.log(data);
                            console.log("success.......");
                            $(".loader").hide();
                            $("#myform").show();

                            if (data.trim() === 'Done....') {
                                $("#msg").html("Successfully Registered...!")
                                $("#msg").addClass("green-text")
                            } else {
                                $("#msg").html("Something went wrong...!")
                                $("#msg").addClass("green-text")
                            }


                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            console.log(data);
                            console.log("error.......")
                            $(".loader").hide();
                            $("#myform").show();
                        },
                        processData: false,
                        contentType: false
                    })
                })

            })
        </script>

    </body>
</html>
