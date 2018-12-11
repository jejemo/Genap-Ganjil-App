package com.maho.upi.ggapp

class Model {
    var Num: Int? = null
    var Bil: String? = ""
    var GG: String? = ""

    constructor(){}

    constructor(Num:Int, Bil:String, GG:String){
        this.Num = Num
        this.Bil = Bil
        this.GG = GG
    }
}