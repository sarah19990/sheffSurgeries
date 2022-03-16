package com.sali

class Prescription {
   // declare variables
   String pharmacyName
   String prescripNumber
   String medicine
   String totalCost
   Date dateIssued
   Boolean patientPaying

    static constraints = {
        //delcare constraints
       pharmacyName blank:false
       prescripNumber blank:false
       medicine blank:false
       totalCost blank:false
       dateIssued blank:false, nullable:false
       patientPaying blank:false, nullable:false
    }
    // declare relationships
    static belongsTo = [doctor:Doctor, patient:Patient]
    
}
