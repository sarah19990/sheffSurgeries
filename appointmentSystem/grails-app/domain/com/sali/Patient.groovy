package com.sali

class Patient {
   String patientName
   String patientAddress
   String patientResidence
   Date patientDob
   String patientID
   Date dateRegistered
   String patientPhone

    static constraints = {
       patientName blank:false
       patientAddress blank:false
       patientResidence blank:false
       patientDob blank:false, date: true, nullable: false
       patientID blank: false
       dateRegistered blank:false, nullable:false
       patientPhone blank:false 
    }

}
