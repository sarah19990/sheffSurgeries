package com.sali

class Patient {
   //declare variables
   String patientName
   String patientAddress
   String patientResidence
   Date patientDob
   String patientID
   Date dateRegistered
   String patientPhone

   // declare instances
   String toString(){
        return patientName
    }

    static constraints = {
        //delcare constraints
       patientName blank:false
       patientAddress blank:false
       patientResidence blank:false
       patientDob blank:false, date: true, nullable: false
       patientID blank: false, unique:true
       dateRegistered blank:false, nullable:false
       patientPhone blank:false, size:0..15
    }
     // declare relationships
   static belongsTo = [surgery:Surgery]
   static hasMany = [prescriptions:Prescription, doctors:Doctor, appointments:Appointment]
}
