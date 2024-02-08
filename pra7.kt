import kotlin.math.*

fun main(){
// zadanie 1
//try{
//
//    //2
//    var m: Int
//    var n: Int
//    var s: Double
//    do{
//        println("m-")
//        m= readln()!!.toInt()
//        println("n-")
//        n= readln()!!.toInt()
//    }while(m<=0||n<=m)
//    println("введите значение элементов")
//    var am= readln()!!.toDouble()
//    var an= readln()!!.toDouble()
//    s=(am+an)*(n-m+1)/2
//    println("Sum=%.2f".format(s))
//
//
//}catch (e:Exception){
//    println("Некорректные данные")
//}
//    try {
//        //9
//
//        var a= readLine()!!.toDouble()
//        var b= readLine()!!.toDouble()
//        var c= readLine()!!.toDouble()
//        var p: Double
//        p=(a+b+c)/3
//        println("sr:"+p)
//    }catch (e:Exception){
//        println("Некорректные данные")
//    }
    /*try {
        //7.1
        var x= readLine()!!.toDouble()
        var y= readLine()!!.toDouble()
        var z= readLine()!!.toDouble()
        var a=(sqrt(abs(x-1))-sqrt(y).pow(3))/(1+x.pow(2)/2+y.pow(2)/4)
        var b=x* abs(atan(z)+  2.71828.pow(-(x+3)))
        println(a)
        println(b)
    }catch (e:Exception){
        println("Некорректные данные")
    }*/

    //zadani2

    //4
  /*  try{
        println("Первое число")
        var a= readLine()!!.toDouble()
        println("Второе число")
        var b= readLine()!!.toDouble()
        println("Третье число")
        var c= readLine()!!.toDouble()
        var p= (max(max(a,b),c)+min(min(a,b),c))/2
        println(p)
    }catch (e: Exception){
        println("Некорректные данные")
    }*/

    //14
   /* try{
        println("Введите x")
        var x=readln()!!.toInt()
        println("Введите y")
        var y=readln()!!.toInt()
        println("Введите m")
        var m=readln()!!.toInt()
        println("Введите n")
        var n=readln()!!.toInt()
        if((m%n)>(x-y)){x++
            println("x="+x)
        }
        else println("X не поменялся")
    }catch (e :Exception){
        println("Некорректные данные")
    }*/
    //24
//    try{
//        println("Введите координаты x")
//        var x=readln()!!.toDouble()
//        println("Введите координаты y")
//        var y=readln()!!.toDouble()
//        when{
//            (x>0&&y>0) -> println("Четверть 1")
//            (x<0&&y>0)-> println("Четверть 2")
//            (x<0&&y<0)->println("Четверть 3")
//            (x>0&&y<0)->println("Четверть 4")
//        }
//    }catch (e: Exception){
//        println("Некорректные данные")
//    }

    //34
    try{
        println("Задайте k — угловой коэффициент")
        var k=readln()!!.toDouble()
        println("Задайте число а")
        var a=readln()!!.toDouble()
        println("Задайте b — свободный коэффициент")
        var b=readln()!!.toDouble()
        var x1=(-b+sqrt(b.pow(2)+4*a*k))/(2*k)
        if(x1>0||x1==0.0||x1<0){
            var x2=(-b-sqrt(b.pow(2)+4*a*k))/(2*k)
            var y1=a/x1
            var y2=a/x2
            if(x1==x2) println("точек пересечения 1 и она равна:{$x1,$y1},")
            else println("Точек пересечения 2 и они равны {$x1,$y1}/{$x2,$y2}")
        }

        else println("Точек нет")

    }catch (e:Exception){
        println("Некорректные данные")
    }



    //44
    /*try{
        println("Введите чему равно среднее число пропущенных занятий у 1 группы")
        var n1= readln()!!.toInt()
        println("Введите чему равно среднее число пропущенных занятий у 2 группы")
        var n2= readln()!!.toInt()
        println("Введите чему равно среднее число пропущенных занятий у 3 группы")
        var n3= readln()!!.toInt()
        if(min(min(n1,n2),n3)<10) println("Есть хорошая группа")
        else println("К сожалению все много прогуливают")
    }catch (e: Exception){
        println("Некорректные данные")
    }*/

}
