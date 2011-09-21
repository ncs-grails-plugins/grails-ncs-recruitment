package edu.umn.ncs

class FatherEngagementStatus {
	String suId
	Integer fatherEngagement
	Person mother

    static constraints = {
    	mother(nullable:true)
    	suId()
    	fatherEngagement()
    }
}
