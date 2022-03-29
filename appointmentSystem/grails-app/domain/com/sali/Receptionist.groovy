package com.sali

class Receptionist {
   //declare variables
   String recepName
   String recepEmail
   String username
   String password
   String recepPhone

// declare instances
   String toString(){
        return recepName
    }
    static constraints = {
        //declare constraints
       recepName blank:false
       recepEmail blank:false, email: true, unique:true
       username blank:false, unique: true
       password blank:false, size:7..16
       recepPhone blank:false, size:0..15
    }
    // declare relationships
    static belongsTo = [surgery:Surgery]
}
