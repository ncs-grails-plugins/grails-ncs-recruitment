package edu.umn.ncs

class FatherEngagementCall {
	TrackedItem trackedItem
	Integer pregnantIsBioFatherHome			// 0=No, 1=Yes, 3=Refused, 4=Don't Know
	Integer pregnantBioFatherParticipating	// 0=No, 1=Yes, 3=Refused, 4=Don't Know
	Integer pregnantPartnerParticipating	// 0=No, 1=Yes, 3=Refused, 4=Don't Know
	Integer pregnantPartnerAtNextInterview	// 0=No, 1=Yes, 3=Refused, 4=Don't Know
	Integer nonPregnantTryingWithPartner	// 0=No, 1=Yes, 3=Refused, 4=Don't Know
	Integer nonPregnantPartnerAtInterview	// 0=No, 1=Yes, 3=Refused, 4=Don't Know
	Integer nonPregnantPartnerAtNextInterview	// 0=No, 1=Yes, 3=Refused, 4=Don't Know
	
    static constraints = {
		pregnantIsBioFatherHome(nullable:true)
		pregnantBioFatherParticipating(nullable:true)
		pregnantPartnerParticipating(nullable:true)
		pregnantPartnerAtNextInterview(nullable:true)
		nonPregnantTryingWithPartner(nullable:true)
		nonPregnantPartnerAtInterview(nullable:true)
		nonPregnantPartnerAtNextInterview(nullable:true)		
    }
}
