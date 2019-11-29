<!DOCTYPE html>
<html>
<body>

<p>Display some text when the checkbox is checked:</p>
<div style="display: flex; flex-direction: column;">
  Checkbox: <input type="checkbox" id="myCheck" onclick="myFunction()">
  Checkbox: <input type="checkbox" id="myCheck2" onclick="myFunction2()">
  Checkbox: <input type="checkbox" id="myCheck3" onclick="myFunction3()">
  Azul: <input type="checkbox">
</div>

<div class="a" id="nao"></div>
<div class="i" id="sim" style="display:none"></div>
<div class="a2" id="sim2" style="display:none"></div>
<div class="a3" id="sim3" style="display:none"></div>

<script>
function myFunction() {
  var A = document.getElementById("nao");
  var S = document.getElementById("sim");
  var checkBox = document.getElementById("myCheck");
  if (checkBox.checked == true){
    A.style.display = "none";
    S.style.display = "block";
  } else {
    A.style.display = "block";
    S.style.display = "none";
  }
}

function myFunction2() {
  var A = document.getElementById("nao");
  var S = document.getElementById("sim2");
  var checkBox = document.getElementById("myCheck2");
  if (checkBox.checked == true){
    A.style.display = "none";
    S.style.display = "block";
  } else {
    A.style.display = "block";
    S.style.display = "none";
  }
}
function myFunction3() {
  var A = document.getElementById("nao");
  var S = document.getElementById("sim3");
  var checkBox = document.getElementById("myCheck3");
  if (checkBox.checked == true){
    A.style.display = "none";
    S.style.display = "block";
  } else {
    A.style.display = "block";
    S.style.display = "none";
  }
}

</script>

<style>
.a {
width: 3rem;
height: 4rem;
background-color:red;}
.i {
width: 3rem;
height: 4rem;
background-color:blue;}
.a2 {
width: 3rem;
height: 4rem;
background-color:green;}
.a3 {
width: 3rem;
height: 4rem;
background-color:yellow;}

</style>

</body>
</html>

