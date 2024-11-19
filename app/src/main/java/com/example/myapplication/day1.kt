package com.example.myapplication

fun main(){
    println("Hello World")
    var name : String ="Ritika"
    var age : Int = 18
    println("My name is $name and my age us $age")
    println("My name is ${name.uppercase()}")
    println(name.lowercase())

    var datas =arrayOf("ritika","riya","simran")
    println("1st element is ${datas[0]}")
    println("2nd element is ${datas[1]}")
    println("3rdelement is ${datas[2]}")

    println("Enter any word")
    var input : String =readln()
    //println(dictionary[input])

    println("Enter day of week")
    var dayOfWeek : Int =readln().toInt()
    var day : String

    when(dayOfWeek){
        1-> day ="Sunday"
        2->day="Monday"
        3->day="Tuesday"
        4->day="Wednesday"
        5->day="Thursday"
        6->day="Tuesday"
        7->day="Tuesday"
        else->day="Invalid Option"
    }
    println(day)

    for(i in 0  until 5){
        println(i)
    }

    for(i in 0.. 5){
        println(i)
    }

    var data =listOf("sandis","ram")
    data.forEach{
        println(it)

    }
    println(data)

    var data1 =listOf("sandis","ram")
    println("1st element is ${data1[0]}")
    println("2nd element is ${data1[1]}")



}
//alt j