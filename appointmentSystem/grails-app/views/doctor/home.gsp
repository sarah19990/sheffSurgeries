<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="current.css"/>
    <title>links for the controllers</title>
</head>
<body>



<div>

<div class="first">
               <h3>Prescriptions</h3>


     <button type="button" class="btn btn-success">

           <g:link controller="Prescription" action="create">Register Prescription</g:link>

     </button>


</div>



<div class="second">
               <h3>Patients</h3>



     <button type="button" class="btn btn-success">

           <g:link controller="Patient" action="create">Register Patient</g:link>

     </button>


</div>

<div class="third">
               <h3>Appointments</h3>



     <button type="button" class="btn btn-success">

           <g:link controller="Appointment" action="create">Register Appointment</g:link>

     </button>


</div>



</div>

</div>

</body>

</html>
