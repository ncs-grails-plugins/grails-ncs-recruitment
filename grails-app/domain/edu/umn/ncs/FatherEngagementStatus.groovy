package edu.umn.ncs

class FatherEngagementStatus {
	String suId
	Boolean fatherEngagement
	Person mother

    static constraints = {
    	mother(nullable:true)
    	suId()
    	fatherEngagement()
    }
}
