package com.example.hakerranktest.problem_solving

class TimeConversion {

    fun solve1(time:String):String
    {
        val data=time.split(":")
        var hour=data[0]
        val minutes=data[1]
        val rest=data[2]
        val seconds=rest.substring(0,2)
        val ap=rest.substring(2)
        if(ap == "PM")
        {
            if(hour!="12")
            {
                var currentHour=hour.toInt()
                currentHour+=12
                hour=currentHour.toString()
            }
        }
        else
        {
            if(hour == "12")
                hour="00"
        }


        return "$hour:$minutes:$seconds"

    }
}