package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.adapters.RoomAdapter
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()
    lateinit var mRoomAdapter :RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setvalues()
    }
    override fun setupEvents() {

        roomListView.setOnItemClickListener { parent, view, position, id ->
            val clickedRoom = mRoomList[position]

//            눌린 방의 정보를 상세화면에 전달.
        }

    }

    override fun setvalues() {

        mRoomList.add(Room(8000,"서울시 마포구",5,"첫번째 방입니다."))
        mRoomList.add(Room(25000,"서울시 마포구",3,"두번째 방입니다."))
        mRoomList.add(Room(78000,"서울시 마포구",5,"세번째 방입니다."))
        mRoomList.add(Room(71000,"서울시 강서구",8,"네번째 방입니다."))
        mRoomList.add(Room(114000,"서울시 강서구",14,"다섯번째 방입니다."))
        mRoomList.add(Room(48000,"서울시 강서구",-2,"여섯번째 방입니다."))
        mRoomList.add(Room(96000,"서울시 종로구",0,"일곱번째 방입니다."))
        mRoomList.add(Room(44000,"서울시 종로구",6,"여덞번째 방입니다."))

        mRoomAdapter = RoomAdapter(mContext,R.layout.room_list_item,mRoomList)
        roomListView.adapter = mRoomAdapter

    }

}