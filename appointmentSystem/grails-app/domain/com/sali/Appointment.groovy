package com.sali

class Appointment {
   // declare variables
   Date appDate
   String appTime
   int appDuration
   String roomNumber

    static constraints = {
       //delcare constraints
       appDate blank:false
       appTime blank:false
       appDuration nullable:false
       roomNumber blank:false
    }
    // declare relationships
    static belongsTo = [surgery:Surgery, doctor:Doctor,  patient:Patient]
}
