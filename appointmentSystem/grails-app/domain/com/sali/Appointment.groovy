package com.sali

class Appointment {
   Date appDate
   String appTime
   int appDuration
   String roomNumber

    static constraints = {
       appDate blank:false
       appTime blank:false
       appDuration nullable:false
       roomNumber blank:false
    }
}
