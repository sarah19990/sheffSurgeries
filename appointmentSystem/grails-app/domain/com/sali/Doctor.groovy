package com.sali

class Doctor {
   String fullName
   String qualifications
   String position
   String doctorEmail
   String password
   String doctorOffice
   String doctorPhone
   String bio

    static constraints = {
        fullName blank:false
        qualifications  blank:false
        position blank:false
        doctorEmail blank:false, email: true
        password blank:false
        doctorOffice blank:false
        doctorPhone blank:false
        bio blank:false, widget: 'textarea'
    }
}
