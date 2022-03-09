package com.sali

class Receptionist {
   String recepName
   String recepEmail
   String recepUsername
   String recepPassword
   String recepPhone

    static constraints = {
       recepName blank:false
       recepEmail blank:false, email: true
       recepUsername blank:false, unique: true
       recepPassword blank:false
       recepPhone blank:false 
    }
}
