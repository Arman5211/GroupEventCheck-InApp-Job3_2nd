package com.example.groupeventcheck_inapp_job3_2nd

data class Event(
    var name: String = "",
    var details: String = "", // Ensure this is included
    var location: String = "",
    var time: String = "",
    var participants: List<String> = emptyList()
)
