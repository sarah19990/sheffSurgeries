<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="home.css"/>
    <title>links for the controllers</title>
</head>
<body>



<div>

<div class="first">
               <h3>Doctors</h3>


     <button type="button" class="btn btn-success">

           <g:link controller="Doctor" action="create">Register Doctor</g:link>

     </button>


</div>


</div>

<div class="second">
               <h3>Nurses</h3>



     <button type="button" class="btn btn-success">

           <g:link controller="Nurse" action="create">Register Nurse</g:link>

     </button>


</div>



<div class="third">
               <h3>Patients</h3>



     <button type="button" class="btn btn-success">

           <g:link controller="Patient" action="create">Register Patient</g:link>

     </button>


</div>

<div class="fourth">
               <h3>Receptionists</h3>



     <button type="button" class="btn btn-success">

           <g:link controller="Receptionist" action="create">Register Receptionist</g:link>

     </button>


</div>



</div>

</div>

</body>

</html>
