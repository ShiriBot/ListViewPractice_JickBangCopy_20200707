package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas

class Room (val price : Int, val address : String, val floor : Int, val description : String) {

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