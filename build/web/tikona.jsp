<%-- 
    Document   : tikona
    Created on : Jul 28, 2016, 9:08:50 PM
    Author     : harshit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <div id="container">
            <div id="header">
                <div class="logo"><img src="images/logo.png" width="157" height="115" alt="Tikona logo" /></div>
                <div id="inner-menu">
                </div>
            </div>
            <div class="clear"></div>
            <div class="wrapper">

                <div id="content" style="margin:0">
                    <h1>MY TIKONA <img src="images/home-title.png" width="24" height="26" alt="Tikona" /></h1><h2>Your Space. Your Way. Your Choice.</h2>
                    <p>&nbsp;</p>
                    <div class="clear"></div>
                    <div class="content" style="font-size:12px; width:420px;">
                        <p><b>Dear Subscriber</b>,<br />
                            <br />
                            We are excited to launch our redesigned SelfCare portal - 'My Tikona' - <br />Your Space. Your Way. Your Choice. The new portal is easy to navigate and has great functionalities such as:<br />
                        </p><br />
                        <ul><li>Bill payment</li>
                            <li>In-person collection request</li>
                            <li>Session history, etc.</li></ul><br />
                        <p>Look forward to more updates.</p>
                        <p>&nbsp;</p><p>&nbsp;</p><a target="_blank" href="http://tikona.in/for-home/customer-support/tikona-care/quick-bill-pay"><img src="images/quick-bill-pay.png" alt="Quick Bill Pay" width="108" height="21" align="right" /></a>
                        <p>Regards,<br />
                            <b>Tikona Care</b> </p>
                    </div>
                    <div class="sep" style="width: 40px;"><br />
                        <br />
                        <br />
                        <img src="images/sep.png" width="20" height="220" alt=""  align="absmiddle"/><br />
                        <br />
                        <br />
                        <br />
                    </div>
                    <div class="formcontent" style="width: 240px;">
                        <form class="myForm" name="loginForm" id="loginForm" action="loginAction.do" method="post" onsubmit="return submitForm();">
                            <label for="user">
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <span class="nmltxt">User ID</span>
                            </label>
                            <input type="text" name="username" id="username" onkeyup="checkSpace(this.id)" size="30" maxlength="30" autocomplete="off"/>

                            <label for="emailaddress"><br />
                                <span class="nmltxt">Password</span></label>
                            <input type="password" name="password" id="password" size="30" maxlength="30" onkeyup="checkSpace(this.id)"/>

                            <div>
                                <font style="font-size:12px; width:420px;color: red;">
                                    
                                    <div class ="errormessage" id="errormessage"></div
                                    
                                </font>
                            </div>

                            <input type="submit" name="submitbutton" id="submitbutton" value="" class="left"/>
                            <!--<input type="submit" name="submitbutton" id="changepwd" value="" />-->
                            <a target="_blank" class="change_password" href="https://apps.tikona.in/PasswordGenerator/"><div style="margin-left:10px;" class="left" id="resetpwd"></div></a>
                            <br />
                            <br />
                            <br />
                            <input type="hidden" name="data" id="data" value=""/>
                            <font style="font-size:12px; width:420px;color: red;">
                                
                            </font>
                        </form>
                    </div>

                </div>
            </div>
            <div class="clear"></div>

            <!--<div class="downlink">
                    <div class="downlink_container">
                    <div class="downlink1"><a target="_blank" href="">View Bill</a></div>
                <div class="downlink2"><a target="_blank" href="">View Usage</a></div>
                <div class="downlink3"><a target="_blank" href="http://tikona.in/for-home/customer-support/tikona-care/refer-a-friend/">Refer A Friend</a></div>
                <div class="downlink4"><a target="_blank" href="http://blog.tikona.in/">Blog</a></div>
                <div class="downlink5"><a target="_blank" href="https://www.facebook.com/TikonaIndia">Facebook</a></div>
                <div class="downlink6"><a target="_blank" href="http://forum.tikona.in/">Tikona Forum</a></div>
                </div>
            </div>
            
            <div class="clear"></div>-->

            <div id="footer">
                <div class="footer1">
                    <div class="copyright">&nbsp;Copyright © Tikona Digital Networks Pvt. Ltd.</div>
                    <div class="footertikona">Tikona Care :&nbsp;&nbsp;<img src="images/contact-icon.png" alt="Contact Tikona" width="8" height="16" align="bottom" /> 1860 3000 3434&nbsp;&nbsp; <img src="images/email-icon.png" alt="Email tikona" width="8" height="16" align="bottom" />&nbsp;customercare@tikona.in</div>
                </div>
                <div class="footer2">&nbsp;</div>
                <div class="footer3">&nbsp;</div>
            </div>

        </div><!--container end-->
        <script type="text/javascript">
            function submitForm() {
                var username = document.getElementById("username");
                var password = document.getElementById("password");

                if (username.value == "") {
                    document.getElementById("errormessage").innerHTML = "Invalid ID or password<br/>Please try again";
                    username.focus();
                    document.getElementById("logoutBlock").style.display = "none";
                    return false;
                }
                if (password.value == "") {
                    document.getElementById("errormessage").innerHTML = "Invalid ID or password<br/>Please try again";
                    password.focus();
                    document.getElementById("logoutBlock").style.display = "none";
                    return false;
                }

                var url = "EncryptData.do";

                if (typeof XMLHttpRequest != "undefined") {
                    req = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    req = new ActiveXObject("Microsoft.XMLHTTP");
                }

                req.open("POST", url, false);

                req.onreadystatechange = processResponse;

                req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                req.send("data=" + encodeURIComponent(username.value + "~" +password.value));
            }

            function processResponse() {
                if (req.readyState == 4) {
                    if (req.status == 200) {
                        //alert("req.responseText "+req.responseText);
                        var userStatus = req.responseText;
                        //document.getElementById("username").value = "";
                        //document.getElementById("password").value = "";
                        document.loginForm.data.value = userStatus.toString();
                        document.loginForm.submit();
                    } else {
                        //alert("Error Occured");
                    }
                }
            }
        </script>

        <script type="text/javascript">
            var cookies = document.cookie.split(";");
            for (var i = 0; i < cookies.length; i++) {
                var cookie = cookies[i];
                var eqPos = cookie.indexOf("=");
                var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
                document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";
            }
        </script>

    </body>
</html>
