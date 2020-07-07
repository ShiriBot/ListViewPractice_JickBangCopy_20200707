package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.R
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room


class RoomAdapter(val mContext: Context, val resId:Int, val mList:List<Room>):
    ArrayAdapter<Room>(mContext,resId,mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temprow = convertView
        if (temprow==null){
            temprow = inf.inflate(R.layout.room_list_item,null)
        }

        val row = temprow !!

        val data = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val adressTxt = row.findViewById<TextView>(R.id.adressTxt)
        val desTxt = row.findViewById<TextView>(R.id.desTxt)

        priceTxt.text= data.price.toString()
        adressTxt.text= data.address.toString()
        desTxt.text= data.description.toString()

        return row


    }




}