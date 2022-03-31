<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Surgery | Home Page</title>
</head>
<body>

<div class="container">

        <h1>Advanced Search</h1>

<h3>Advanced Results</h3>

<p>Searched

 for prescriptions matching <em>${term}</em>.

 Found <strong>${prescriptions.size()}</strong> prescriptions.

 </p>

<ul>

 <g:each var="prescription" in="${prescriptions}">

 <li><g:link controller="Prescription" action="show"

totalcost="${prescription.totalCost}">${prescription.Medicine}</g:link></li>

 </g:each>

 </ul>

<g:link action='advSearch'>Search Again</g:link>

    </div>

</body>

</html>
