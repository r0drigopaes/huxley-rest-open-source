package com.thehuxley

class Approval {

    String username
    String clientId

    String scope
    boolean approved

    Date expiration
    Date lastModified

    static constraints = {
        username nullable: false, blank: false
        clientId nullable: false, blank: false
        scope nullable: false, blank: false
        expiration nullable: false
        lastModified nullable: false
    }
}
