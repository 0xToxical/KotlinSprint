fun main(){
    val mins = 108
    val minInHour = 60
    val sum=(mins*minInHour)
println (sum)
    val hour = (sum/60/60)


    val secondsOst1 = (6480%3600)
    val minsOst = (secondsOst1/60)
    val secondOst2 = (sum%60)

print("0$hour:$minsOst:0$secondOst2")
}

