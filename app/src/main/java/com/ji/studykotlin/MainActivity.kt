package com.ji.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ji.studykotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        var varibable:String = "홍길동"
//
//        // 코틀린의 기본타입
//        // 실수형
//        var doubleValue:Double = 35.6
////        var floatValue:Float = 123.7f
//        // 정수형
//        var intValue:Int = 12345678
////        var longValue:Long = 2_147_483_647
////        var shortValue:Short = 123
////        var byteValue:Byte = 127
//        // 문자형
//        var charValue:Char = 'a'
//        var stringValue:String = "문자형 길이에 상관없이 값을 입력할 수 있다 = 크기를 특정할 수 없다"
//        // 불린형
//        var booleanValue:Boolean = true
//
//        booleanValue = false
//
//        var VALVALUE:Boolean = true
//
//        var hello_world = "안녕 세상아!"

//        // 비교연산자 <, >, >=, <=, ==
//        var result = 1 != 2
//        Log.d(TAG, "결과 = ${result}")
//
//
//        // if
//
//        // when

//        var variable:Int = 157
//
//        // 배열
//        // Int -> IntArray
//        var intArr = IntArray(10)
//        // index = 0부터 시작
//        intArr[0] = 10
//        intArr[1] = 20
//        intArr[2] = 30
//        intArr[3] = 40
//        intArr[4] = 50
//
//        intArr[9] = 100
//
//        Log.d(TAG, "9번 인덱스의 값=${intArr[9]}")
//
//        // 컬렉션 Generic(제네릭)
//        // 리스트, 뮤터블리스트
//        var mutableList = mutableListOf<Int>()
//        // 값 넣기
//        mutableList.add(5)
//        mutableList.add(10)
//        mutableList.add(75)
//        mutableList.add(36)
//        mutableList.add(66)
//
//        Log.d("컬렉션", "3번 인덱스의 값=${mutableList.get(3)}")
//
//        //맵
//        var mutableMap = mutableMapOf<String, String>()
//        mutableMap.put("변수1", "값1")
//        mutableMap.put("변수2", "값2");
//
//        Log.d("컬렉션", "맵 변수1의 값은=${ mutableMap.get("변수1") }")

//        functionName()
//
//        var result = functionParam("값",2 )
//
//        var pi = getPi()
//        Log.d("함수", "pi=${pi}")

        // 함수를 사용하는 용도  > 코드를 분류하기 위해서

        //클래스의 사용
        // 1. 초기화
//        var cls = 클래스()//인스턴스 = 메모리에 로드되어 있는 클래스
//
//        cls.variable
//        cls.function()

        // 2. companion object로 만들기
//        Log.d("태그", "메시지")

//        var parent = Parent();
//        parent.showHouse();
//
//        var child = Child();
//        child.showHouse();

        var Son = Son()
        var result = Son.getNumber("홍");

    }

//    //기본 함수
//    fun functionName(){
//        //코드 블럭
//    }
//
//    // 입력값이 있는 함수
//    fun functionParam(param1:String, param2:Int) : String{
//        Log.d("함수", "param1=${param1}, param2=${param2}")
//        return "새로운 값"
//    }
//
//    // 출력값이 있는 함수
//    fun getPi() : Double{
//        return 3.141592
//    }



}

//class Log{
//
//    companion object{
//        var variable = "난 누구"
//        fun d(tag: String, msg: String){
//            print("[$tag] : $msg")
//        }
//    }
//
//}

//변수와 함수의 모음
//class 클래스 {
//
//    init {
//        //클래스를 초기화하면 호출된다.
//    }
//
//    var variable:String = "" // 변수 - 프로퍼티
//
//    //클래스 scope
//    fun function(){ //함수 - 메서드
//        var variable_local = ""
//    }
//}

//상속을 사용하는 이유
//1. 기존의 작성된 코드를 재활용하기 위해서
//2. 코드를 재활용하는데 -> 체계적인 계층구조로 사용하기 위해서

open class Parent{
    var money = 500000000
    open var house = "강남 200평 아파트"

    open fun showHouse(){
        Log.d("클래스", "house=${house}")
    }


}

class Child:Parent(){
    override var house = "강남 10평 오피스텔"
   //상속받으면, 아빠클래스의 프로퍼티와 메서드를 내것처럼 사용할 수 있다
    fun showMoney(){
        Log.d("클래스", "money=${money}")
    }

    override fun showHouse() {
        Log.d("클래스", "house=${house}")
    }

}

class Son{

    fun getNumber(zergling:String) : Int{
        return 1
    }

    fun getNumber(zergling:String, hidra:String) : Int{
        return 1
    }
}