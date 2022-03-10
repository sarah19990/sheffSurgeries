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

    static constraints = {
        //delcare constraints
       patientName blank:false
       patientAddress blank:false
       patientResidence blank:false
       patientDob blank:false, date: true, nullable: false
       patientID blank: false
       dateRegistered blank:false, nullable:false
       patientPhone blank:false 
    }
     // declare relationships
   static hasMany = [doctor:Doctor, surgery:Surgery, prescription:Prescription]
}
