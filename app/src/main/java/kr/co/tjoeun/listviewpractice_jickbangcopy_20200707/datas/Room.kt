package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas

import java.io.Serializable

class Room (val price : Int, val address : String, val floor : Int, val description : String) :Serializable {


    fun getFomattedFloor() : String {
//        지상, 반지하, 지하층
        if (this.floor>=1){
            return "${this.floor}층"
        }
        else if (this.floor==0){
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }




    }

    fun getFormattedPrice() : String{
//        1억이 넘냐 아니냐에 따라 다르게 가공
        if (this.price>=10000){
//            ?억 ?만원 양식으로 가공
            val uk = this.price/10000
            val rest = this.price%10000
            return String.format("%d억 %,d만원",uk,rest)
        }
        else {
//            1억이 안되는 경우 => 8,500만원 등으로 가곡.
//            숫자에 컴마, 뒤에 만원
            return String.format("%,d만원",this.price)
        }
    }


}