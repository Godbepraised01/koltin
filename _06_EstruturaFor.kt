 fun main(){
     for(i in 1 .. 10){
         println(i==5)
         break
         println("atual $i")

     }
     println("-----------------")
     for (i in 1..10){
         if (i==5)
             continue
         println("atual $i")
     }
 }