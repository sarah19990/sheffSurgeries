package com.sali

class Doctor {
    // declare variables
   String fullName
   String qualifications
   String position
   String username
   String password
   String doctorOffice
   String doctorPhone
   String bio

   // declare instances
   String toString(){
        return fullName
    }

    static constraints = {
        // declare constraints
        fullName blank:false
        qualifications  blank:false
        position blank:false
        username blank:false, unique: true
        password blank:false, size:0..15
        doctorOffice blank:false
        doctorPhone blank:false, size:0..15
        bio blank:false, widget: 'textarea'
    }
    // declare relationships
    static hasMany = [prescriptions:Prescription, appointments:Appointment, nurses:Nurse]
    static belongsTo = [surgery:Surgery, patient:Patient]
}
