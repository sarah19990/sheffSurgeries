package com.sali

class Doctor {
    // declare variables
   String fullName
   String qualifications
   String position
   String doctorEmail
   String password
   String doctorOffice
   String doctorPhone
   String bio

    static constraints = {
        // declare constraints
        fullName blank:false
        qualifications  blank:false
        position blank:false
        doctorEmail blank:false, email: true, unique:true
        password blank:false, size:0..15
        doctorOffice blank:false
        doctorPhone blank:false, size:0..15
        bio blank:false, widget: 'textarea'
    }
    // declare relationships
    static hasMany = [nurse:Nurse, prescription:Prescription, patient:Patient, appointment:Appointment]
    static belongsTo = [surgery:Surgery]
}
