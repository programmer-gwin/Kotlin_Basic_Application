package elkanahtech.com.kotlinbasicapplication.controls

class MyDiscovery {
    //Getter and Setter
    var innerValue : Double = 0.0
    var GetAndSet : Double
        get() = innerValue/2.2
        set(value) {
            innerValue = value * 2.2
        }



}