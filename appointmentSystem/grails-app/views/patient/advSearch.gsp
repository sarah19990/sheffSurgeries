<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Surgery | Home Page</title>
</head>
<body>

<div class="container">
<h1>Advanced Search</h1>

<formset>

    <legend>Advanced Search for Patients</legend>
        
<table>

        <g:form action="advResults">

        <tr>

         <td>Name</td>

         <td><g:textField name="name" /></td>

        </tr>

<tr>

        <td>Patient ID</td>

        <td><g:textField name="patientID" /></td>

      </tr>

<tr>

        <td>Patient Residence</td>

        <td><g:textField name="patientResidence" /></td>

      </tr>
    
<tr>
        <td>Query Type:</td>

        <td><g:radioGroup name="queryType" labels="['And','Or','Not']"values="['and','or','not']" value="and" >

        ${it.radio} ${it.label}

                        </g:radioGroup>

                    </td>

                  </tr>

<tr>

<td/>

<td>

<g:submitButton name="search" value="Search"/></td>

</tr>

</g:form>

</table>

</formset>

  </div>

</body>

</html>