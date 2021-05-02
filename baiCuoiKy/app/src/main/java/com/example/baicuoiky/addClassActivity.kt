package com.example.baicuoiky

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_add_class.*
import kotlinx.android.synthetic.main.activity_add_class.view.*
import kotlinx.android.synthetic.main.row_add_cricketer.*

class addClassActivity : AppCompatActivity() {

    var arr :ArrayList<MyModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_class)
    }
//    fun onDelete(view: View) {
//        parentLinearLayout!!.removeView(view.parent as View)
//    }
    fun onAddField(view: View) {
        arr.add(MyModel(edit_terms.text.toString(),edit_define.text.toString(),nameTerm.text.toString()))
        listView.adapter = MyAdapter(this,arr)

    }
    fun onBack(view: View){
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun complete(view: View){

        val intent:Intent = Intent(this, term::class.java)
        intent.putExtra("data", arr)
        startActivity(intent)
    }
}