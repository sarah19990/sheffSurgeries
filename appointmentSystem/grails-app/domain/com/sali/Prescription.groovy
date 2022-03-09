package com.sali

class Prescription {
   String pharmacyName
   String prescripNumber
   String medicine
   String totalCost
   Date dateIssued
   Boolean patientPaying

    static constraints = {
       pharmacyName blank:false
       prescripNumber blank:false
       medicine blank:false
       totalCost blank:false
       dateIssued blank:false, nullable:false
       patientPaying blank:false, nullable:false
    }
}
