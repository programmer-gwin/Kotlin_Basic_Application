package elkanahtech.com.kotlinbasicapplication.mystudies

public  class  MyConstructor(intValue: Int, stringValue: String){
    var innerInt : Int = 0;
    var innerStr : String = "";

    var  MyInt: Int
    get() = innerInt
    set(value) {
        innerInt=value
    }

    var MyString : String
    get() = innerStr
    set(value) {
        innerStr=value
    }
}