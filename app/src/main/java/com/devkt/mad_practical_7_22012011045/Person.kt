package com.devkt.mad_practical_7_22012011045

import org.json.JSONObject
import java.io.Serializable

class Person(
    var id:String,
    var name:String,
    var emailId:String,
    var address:String,
    var latitude:Double,
    var longitude:Double,
    ):Serializable {
        constructor(jsonObject: JSONObject):this("","","","",0.0,0.0){
            id = jsonObject.getString("id")
            emailId = jsonObject.getString("email")
        }
}